package checkServisUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PrintTrueAnswerService {

    public ArrayList<String> printAnswers(String fileName) throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                arr.add(line);
            }
            System.out.println("2: " + arr + "\n");
        }
        return arr;
    }
}
