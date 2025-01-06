import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read input from stdin
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read 3 lines of input
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        // Print each integer on a new line
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // Close the BufferedReader
        reader.close();
    }
}
