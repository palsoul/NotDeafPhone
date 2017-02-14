import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Brotherdos aka Janbrodos
 * @date: 14.02.2017
 */
public class Runner {
    public static void main(String[] args) {
        int number;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            number = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println(number);
    }
}
