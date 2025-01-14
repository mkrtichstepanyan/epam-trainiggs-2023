package homework_11.Karen_Sargsyan.chapter_22.sisd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            return null;
        }
    }

}
