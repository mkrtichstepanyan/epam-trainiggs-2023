package homework_12.Ani_Barseghyan.chapter_23;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Path.of("test.txt"))) {
            long fSize = fileChannel.size();

            MappedByteBuffer mBuf = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (long i = 0; i < fSize; i++) {
                System.out.println((char) mBuf.get());
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("I/O Error" + e);
        }
    }
}
