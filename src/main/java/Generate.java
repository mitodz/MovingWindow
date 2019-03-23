import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Generate {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter("input.txt")) {
            int n = 100_000;
            int m = 1;
            Random rnd = new Random();
            printWriter.println(n);
            for (int i = 0; i < n; i++) {
                printWriter.print(rnd.nextInt(n) + " ");
            }
            printWriter.println("\n" + m);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
