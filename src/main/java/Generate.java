import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Generate {
    public void generate() {
        try (PrintWriter printWriter = new PrintWriter("input.txt")) {
            int n = 10;
            int m = 4;
            Random rnd = new Random();
            printWriter.println(n);
            for (int i = 0; i < n; i++) {
                printWriter.print(rnd.nextInt(3) + " ");
            }
            printWriter.println("\n" + m);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
