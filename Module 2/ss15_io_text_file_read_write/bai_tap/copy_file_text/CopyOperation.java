package ss15_io_text_file_read_write.bai_tap.copy_file_text;

import java.io.*;

public class CopyOperation {
    private static final String PATH_SOURCE_FILE = "D:\\4K\\codeG du an ngoai\\module_2_java\\untitled\\src\\ss15_io_text_file_read_write\\bai_tap\\copy_file_text\\source_file.csv";
    private static final String PATH_TARGET_FILE = "D:\\4K\\codeG du an ngoai\\module_2_java\\untitled\\src\\ss15_io_text_file_read_write\\bai_tap\\copy_file_text\\target_file.csv";

    public static String getValueByReadCSV(String pathFile) throws IOException {
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String readResult = "";
        while ((line = bufferedReader.readLine()) != null) {
            readResult += line + "\n";
        }
        bufferedReader.close();
        return readResult;
    }

    public static void writeCSV(String inputValue, String pathFile) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(inputValue);
        bufferedWriter.close();
    }

    public static int countCharacterInCSVFile(String pathFile) throws IOException {
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            count += line.length();
        }
        bufferedReader.close();
        return count;
    }

    public static void main(String[] args) {
        try {
            writeCSV(getValueByReadCSV(PATH_SOURCE_FILE), PATH_TARGET_FILE);
            System.out.println("Copied file has " + countCharacterInCSVFile(PATH_TARGET_FILE) + " characters");
        } catch (IOException e) {
            System.out.println("Path of file does not exist");
        }
    }
}
