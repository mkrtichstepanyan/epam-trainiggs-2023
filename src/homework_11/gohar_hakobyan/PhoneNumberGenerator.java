package homework_11.gohar_hakobyan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberGenerator {

    public static List<String> generatePhoneNumbers(String code) {
        List<String> numbers = new ArrayList<>();
        if (!code.equals("093")) {
            System.out.println("Code can only start's with 093");
            System.exit(0);
        }
        for (int i = 0; i <= 1000000; i++) {
            String phoneNumber = String.format("%s%06d", code, i);
            numbers.add(phoneNumber);
        }
        return numbers;
    }

    public static void writeToFile(List<String> phoneNumbers, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String phoneNumber : phoneNumbers) {
                bw.write(phoneNumber + "\n");
                System.out.println("File writing completed successfully.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file!" + fileName);
            System.exit(0);
        }
    }
}

