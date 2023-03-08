import java.util.Scanner;

public class PTRN21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < 2 * n; j++) {
                if (j < n - i) {
                    System.out.print("* ");
                } else if (k < 2 * i) {
                    System.out.print("  ");
                    k++;
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int u = 0;
            for (int j = 0; j < 2 * n; j++) {
                if (j < i + 1) {
                    System.out.print("* ");

                } else if (u < 2 * n - 2 * i - 2) {
                    System.out.print("  ");
                    u++;
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

    }
}
