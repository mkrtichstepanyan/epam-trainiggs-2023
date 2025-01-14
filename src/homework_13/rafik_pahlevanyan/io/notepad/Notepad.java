package homework_13.rafik_pahlevanyan.io.notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Properties;

import static homework_13.rafik_pahlevanyan.io.notepad.Notepad.LabelKey.*;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class Notepad extends JFrame {

    private JTextArea textArea;

    private File currentFile;

    public Notepad() {
        currentFile = new File("src/homework_13/rafik_pahlevanyan/io/notepad/Result.txt");
        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        jScrollPane.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_AS_NEEDED);

        NotepadMenuBar menuBar = new NotepadMenuBar();

        add(jScrollPane);
        add(menuBar, BorderLayout.NORTH);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class NotepadMenuBar extends JMenuBar {

        private final JMenu file;
        private final JMenuItem newFile;
        private final JMenuItem openFile;
        private final JMenuItem save;
        private final JMenuItem saveAs;
        private final JMenuItem close;

        private final JMenu language;
        private final JMenuItem amLang;
        private final JMenuItem enLang;
        private final JMenuItem ruLang;

        public NotepadMenuBar() {
            file = new JMenu();
            newFile = new JMenuItem();
            openFile = new JMenuItem();
            save = new JMenuItem();
            saveAs = new JMenuItem();
            close = new JMenuItem();

            file.add(newFile);
            file.add(openFile);
            file.add(save);
            file.add(saveAs);
            file.add(close);

            language = new JMenu();
            enLang = new JMenuItem();
            amLang = new JMenuItem();
            ruLang = new JMenuItem();

            language.add(enLang);
            language.add(amLang);
            language.add(ruLang);

            add(file);
            add(language);

            close.addActionListener(this::onCloseActionPerformed);
            save.addActionListener(this::onSaveActionPerformed);
            openFile.addActionListener(this::onOpenActionPerformed);
            newFile.addActionListener(this::onNewFileActionPerformed);
            saveAs.addActionListener(this::onSaveAsActionPerformed);

            loadMenuLabels(AM);
            enLang.addActionListener(this::onEnLangActionPerformed);
            amLang.addActionListener(this::onAmLangActionPerformed);
            ruLang.addActionListener(this::onRuLangActionPerformed);
        }

        private void onRuLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(RU);
        }

        private void onAmLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(AM);
        }

        private void onEnLangActionPerformed(ActionEvent actionEvent) {
            loadMenuLabels(EN);
        }

        private void loadMenuLabels(LabelKey labelKey) {
            Properties properties = loadMessages(labelKey);
            loadMenuLabels(properties);
        }

        private void loadMenuLabels(Properties properties) {
            file.setText(properties.getProperty("file.menu.name"));
            newFile.setText(properties.getProperty("new.menu.name"));
            openFile.setText(properties.getProperty("open.menu.name"));
            save.setText(properties.getProperty("save.menu.name"));
            saveAs.setText(properties.getProperty("saveAs.menu.name"));
            close.setText(properties.getProperty("close.menu.name"));
            language.setText(properties.getProperty("language.menu.name"));
            enLang.setText(properties.getProperty("en.menu.name"));
            amLang.setText(properties.getProperty("hy.menu.name"));
            ruLang.setText(properties.getProperty("ru.menu.name"));
        }

        private Properties loadMessages(LabelKey labelKey) {
            InputStream inputStream;
            String path = "";
            switch (labelKey.getLabel()) {
                case "am":
                    path = "i18n/label_hy.properties";
                    break;
                case "ru":
                    path = "i18n/label_ru.properties";
                    break;
                default:
                    path = "i18n/label.properties";
            }
            inputStream = getClass().getClassLoader().getResourceAsStream(path);
            Properties properties = new Properties();
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return properties;
        }

        private void onSaveAsActionPerformed(ActionEvent actionEvent) {
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(selectedFile))) {
                    bufferedWriter.write(textArea.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                currentFile = selectedFile;
                System.exit(0);
            }
        }

        private void onNewFileActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().length() > 0) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                if (option == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionEvent);
                }
            }
            textArea.setText("");
            currentFile = null;
        }


        private void onOpenActionPerformed(ActionEvent actionEvent) {
            if (textArea.getText().length() > 0) {
                int option = JOptionPane.showConfirmDialog(this, "Do you want to save your changes?");
                if (option == JOptionPane.YES_OPTION) {
                    onSaveActionPerformed(actionEvent);
                }
            }
            JFileChooser fileChooser = new JFileChooser();
            int choice = fileChooser.showOpenDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedFile))) {
                    StringBuilder fileContent = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        fileContent.append(line).append("\n");
                    }
                    textArea.setText(fileContent.toString());
                    currentFile = selectedFile;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void onSaveActionPerformed(ActionEvent actionEvent) {
            String text = textArea.getText();
            if (currentFile == null) {
                JFileChooser fileChooser = new JFileChooser();
                int userSelection = fileChooser.showSaveDialog(null);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    currentFile = fileChooser.getSelectedFile();
                }
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFile))) {
                bufferedWriter.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void onCloseActionPerformed(ActionEvent e) {
            if (textArea.getText().length() == 0) {
                System.exit(0);
            }
            int option = JOptionPane.showConfirmDialog(this, "Do you want to save?");
            if (option == JOptionPane.YES_OPTION) {
                onSaveActionPerformed(e);
                System.exit(0);
            }
            if (option == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }
    }

    enum LabelKey {

        AM("hy"),
        EN("en"),
        RU("ru");

        private String label;

        LabelKey(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
