package homework_13.anna_manukyan.search;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*Numbers*", "C:\\Users\\annam\\OneDrive\\Рабочий стол\\ex1");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}
