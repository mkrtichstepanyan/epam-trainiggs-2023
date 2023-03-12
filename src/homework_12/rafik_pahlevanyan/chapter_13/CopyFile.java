package homework_12.rafik_pahlevanyan.chapter_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            System.out.println("Usage: copyFile from to");
            return;
        }
        //copy File
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e2) {
                System.out.println("Error closing input file");
            }
        }
        try {
            if (fout != null) {
                fout.close();
            }
        } catch (IOException e2) {
            System.out.println("Error closing Output file");
        }
    }
}
