package homework_11.Karen_Sargsyan.assignment_1;

public enum AcceptableFileFormats {
    TXT(".txt"), CSV(".csv"), JSON(".json");

    String fileFormat;

    AcceptableFileFormats(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getFIleFormat() {
        return fileFormat;
    }

}