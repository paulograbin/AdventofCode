package commons;

import java.io.*;


public class InputFileReader {

    private int dayNumber;
    private File inputFile;

    public InputFileReader(int day) {
        this.dayNumber = day;
    }

    public String getFileContent() throws IOException {
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder sb = new StringBuilder();

        String s;
        while((s = bufferedReader.readLine()) != null) {
            sb.append(s);
        }

        return sb.toString();
    }

    public File getInputFile() {
        return inputFile;
    }

    public void loadInputFile() {
        this.inputFile = new File(getClass().getClassLoader().getResource("day" + dayNumber + "/input.txt").getFile());
    }
}
