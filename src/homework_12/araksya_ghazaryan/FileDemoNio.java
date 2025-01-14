package homework_12.araksya_ghazaryan;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemoNio {
    public static String readFile (String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            Path path = Paths.get(fileName);
            try  {
                byte[] bytes = Files.readAllBytes(path);
                return new String(bytes, StandardCharsets.UTF_8);
            } catch (FileNotFoundException e) {
                System.out.println("File not found: %s ");
            } catch (IOException e) {
                System.err.println("Error!!Can`t read file");
                e.printStackTrace();
            }
        }
        return fileName;
    }

    public static String writeFile (String fileName, String data) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            Path path = Paths.get(fileName);
            try {
                Files.write(path, data.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                System.out.println("Error!!!Can`t write into file");
            }
        }
        return fileName;
    }
    public static String processData(String data){
        return data.toUpperCase();
    }
}