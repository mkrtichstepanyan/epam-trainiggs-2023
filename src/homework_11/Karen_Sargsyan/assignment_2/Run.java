package homework_11.Karen_Sargsyan.assignment_2;

public class Run {
    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator();
        fileCreator.writeToFile(fileCreator.generatePhoneNumbers("093"), "PhoneNumbers");
    }

}
