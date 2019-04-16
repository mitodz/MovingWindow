import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String windowMax(int n, int[] a, int w) {
        int m1;
        StringBuilder sb = new StringBuilder();
        Stack<HashMap.SimpleEntry<Integer, Integer>> s1 = new Stack<>();
        Stack<HashMap.SimpleEntry<Integer, Integer>> s2 = new Stack<>();
        for (int i = 0; i < w; i++) {
            Integer max = s1.empty() ? a[i] : Integer.max (a[i], s1.peek().getValue());
            s1.push (new HashMap.SimpleEntry<> (a[i], max));
        }
        if (s1.empty() || s2.empty())
            m1 = s1.isEmpty() ? s2.peek().getValue() : s1.peek().getValue();
        else
            m1 = Integer.min (s1.peek().getValue(), s2.peek().getValue());

        sb.append(m1 + " ");

        for (int i = w; i < n; i++) {
            Integer max = s1.empty() ? a[i] : Integer.max (a[i], s1.peek().getValue());
            s1.push (new HashMap.SimpleEntry<> (a[i], max));

            if (s2.empty())
                while (!s1.empty()) {
                    int element = s1.peek().getKey();
                    s1.pop();
                    m1 = s2.empty() ? element : Integer.max (element, s2.peek().getValue());
                    s2.push (new HashMap.SimpleEntry<>  (element, m1));
                }
            s2.pop();

            if (s1.empty() || s2.empty())
                m1 = s1.isEmpty() ? s2.peek().getValue() : s1.peek().getValue();
            else
                m1 = Integer.max (s1.peek().getValue(), s2.peek().getValue());

            sb.append(m1 + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n]; //первоначальный массив
        for (int k = 0; k < n; k++) {
            a[k] = scanner.nextInt();
        }
        int w = scanner.nextInt(); //размер окна
        System.out.println(new Main().windowMax(n, a, w));
    }
}

