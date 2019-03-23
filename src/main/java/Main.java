import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

        void run() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("input.txt"));
        int n = scanner.nextInt();
        int[] a = new int[n]; //первоначальный массив
        ArrayDeque<Integer> q = new ArrayDeque<>();

        for (int k = 0; k < n; k++) {
            a[k] = scanner.nextInt();
        }

        int m1 = a[0];//максимальный элемент
        int index = 0;//максимальный элемент
        int m2 = -1;//максимальный после первого
        int w = scanner.nextInt(); //размер окна

        for (int i = 0; i < w; i++) { //первоначальное заполнение очереди элементами из окна
            q.add(a[i]);
        }

        for (int j = 1; j < w; j++) { //максимум в первой части окна
            if (a[j] > m1) {
                m1 = a[j];
                index = j;
            }
        }

        for (int i = index + 1; i < w; i++) { //максимум во второй части окна
            if (a[i] > m2) {
                m2 = a[i];
            }
        }

        System.out.print(m1 + " "); //выводим первый максимальный элемент в окне
        for (int i = w; i < n; i++) { //выводим оставшиеся
            if (q.poll() == m1) {
                m1 = m2;
                m2 = -1;
            }
            q.add(a[i]);
            if (m1 < a[i]) {
                m1 = a[i];
            } else if (m2 <= a[i]) {
                m2 = a[i];
            }
            System.out.print(m1 + " ");
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
    new Main().run();
    }
}
