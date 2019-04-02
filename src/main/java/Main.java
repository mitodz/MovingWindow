import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String windowMax(int n, int[] a, int w) {
        int m1 = a[0];//максимальный элемент
        int i1 = 0;//индекс 1 максимального элемента
        int m2 = -1;//максимальный после первого
        int i2 = 0;//индекс 2 максимального элемента
        StringBuilder sb = new StringBuilder();

        for (int j = 1; j < w; j++) { //максимум в первой части окна
            if (a[j] >= m1) {
                m1 = a[j];
                i1 = j;
            }
        }

        for (int i = i1 + 1; i < w; i++) { //максимум во второй части окна
            if (a[i] > m2) {
                m2 = a[i];
                i2 = i;
            }
        }

        sb.append(m1).append(" "); //выводим первый максимальный элемент в окне
        for (int i = w; i < n; i++) { //выводим оставшиеся
            if (i - w == i1) { //в случае, если "вылетающий" из окна элемент по индексу равен текущему максимальному
                //то меняем его на второй максимум, заодно и индекс.
                m1 = m2;
                i1 = i2;
                m2 = -1;
            }
            if (m1 <= a[i]) {
                m1 = a[i];
                i1 = i;
                i2 = i;
            } else if (m2 <= a[i]) {
                m2 = a[i];
                i2 = i;
                if (m1 == m2) i1 = i2;
            }
            sb.append(m1).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Generate gen = new Generate();
        //gen.generate();
        Scanner scanner = new Scanner(new File("input.txt"));
        int n = scanner.nextInt();
        //System.out.println(n);
        int[] a = new int[n]; //первоначальный массив
        for (int k = 0; k < n; k++) {
            a[k] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(a));
        int w = scanner.nextInt(); //размер окна
        //System.out.println(w);
        //System.out.println();
        System.out.println(new Main().windowMax(n, a, w));
    }
}

