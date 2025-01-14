package homework_11.Nona_Asatryan.chapter22;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        String s = "This is a &copy ; copyright symbol " +
                " but this is &copy not.\n";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        CharArrayReader in = new CharArrayReader(buf);
        int c;
        boolean marked = false;

        try (BufferedReader f = new BufferedReader(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.println("(c)");
                        } else {
                            System.out.print((char) c);
                            break;
                        }
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.println("&");
                        } else {
                            System.out.print((char) c);
                            break;
                        }
                    default:
                        if (!marked) {
                            System.out.print((char) c);
                            break;
                        }
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Error:" + e);
        }
    }
}
