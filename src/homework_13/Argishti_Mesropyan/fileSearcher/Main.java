package homework_13.Argishti_Mesropyan.fileSearcher;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileSearcher fileSearcher = new FileSearcher("src/homework_13/Argishti_Mesropyan/fileSearcher");

        List<String> matches = fileSearcher.search("*.txt");
        List<String> matches2 = fileSearcher.search("hd.java");
        List<String> matches3 = fileSearcher.search("Art*hur*Doel");

        System.out.println("matches the:");
        for (String match : matches3) {
            System.out.println(new File(match).getName());
        }
    }
}
