import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int list[] = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = in.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(list[i]);
            if (i == n - 1) {
                System.out.print("\n");
            } else {
                System.out.print(" ");
            }
        }
    }
}
