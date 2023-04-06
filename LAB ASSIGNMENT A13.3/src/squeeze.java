import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class squeeze {
    /**
     * Removes spaces from the front of the text.
     * @param inputFile The file you want to remove the spaces from the front of the text
     */
    public squeeze(String inputFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                int count = 0;
                for (char ch : line.toCharArray()) {
                    if (ch == ' ') {
                        count++;
                    } else {
                        break;
                    }
                }
                System.out.printf("%d %s", count, line.substring(count));
                System.out.println();
            }
        } catch (IOException ex) {
            System.out.println("Error reading from file");
            //ex.printStackTrace();
        }
    }
}
