import com.opencsv.CSVReader;
import com.opencsv.CSVReaderHeaderAware;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Program013 {
    public static void main(String[] args) throws IOException, CsvValidationException {
//        Map<String, String> values = new CSVReaderHeaderAware(new FileReader("yourfile.csv")).readMap();
        var fileName = "yourfile.csv";

        try (var fr = new FileReader(fileName, StandardCharsets.UTF_8);
             var reader = new CSVReader(fr)) {

            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {

                for (var e : nextLine) {
                    System.out.format("%s ", e);
                }
            }
        }
    }
}
