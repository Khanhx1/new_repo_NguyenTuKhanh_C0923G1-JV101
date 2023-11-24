package ss15_io_text_file_read_write.bai_tap.read_file_CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String PATH_OF_COUNTRY_FILE = "D:\\4K\\codeG du an ngoai\\module_2_java\\untitled\\src\\ss15_io_text_file_read_write\\bai_tap\\read_file_CSV\\countries.csv";

    public static List<Country> readCSV(String pathFile) throws IOException {
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Country> countryList = new ArrayList<>();
        String line = null;
        String[] temp;
        int id;
        String code;
        String name;
        Country country;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            id = Integer.parseInt(temp[0]);
            code = temp[1];
            name = temp[2];
            country = new Country(id, code, name);
            countryList.add(country);
        }
        bufferedReader.close();
        return countryList;
    }

    public static void main(String[] args) {
        try {
            List<Country> countryList = readCSV(PATH_OF_COUNTRY_FILE);
            for (Country country : countryList) {
                System.out.println(country);
            }
        } catch (IOException e) {
            System.out.println("Path of file does not exist");
        }
    }
}
