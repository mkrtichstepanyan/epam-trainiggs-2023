package homework_11.Sofya_Ghazaryan.assignment1;

public class Main {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Hp\\Desktop\\RD\\epam-trainings-2023\\src\\homework_11\\test.txt";
        ReadAndWriteFiles.writeFile(fileName, "Hello");
        ReadAndWriteFiles.readFile(fileName);
//        ioFile.processData("ascdasc");
    }
}
