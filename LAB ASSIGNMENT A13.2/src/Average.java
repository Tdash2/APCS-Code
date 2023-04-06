import java.io.*;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.Scanner;
public class Average {
    /**
     * Finds the Average from a list of numbers form .txt file on the internet, where each number is on its own line.
     * @param username The username for the site.
     * @param password The password for the site.
     * @param Url The url of the .txt file on the internet .
     */
    public Average(String username, String password, String Url) {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });

        try {
            URL url = new URL(Url);
            Scanner in = new Scanner(url.openStream());

            int sum = 0;
            int count = 0;

            while (in.hasNextInt()) {
                int number = in.nextInt();
                sum += number;
                count++;
            }

            double average = (double) sum / count;
            System.out.println("Average: " + average);

            in.close();
        } catch (IOException ex) {
            System.out.println("Error reading from file:");
            ex.printStackTrace();
        }
    }
}
