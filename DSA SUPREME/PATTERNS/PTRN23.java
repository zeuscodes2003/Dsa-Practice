import java.util.Scanner;

public class PTRN29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0) {
                    System.out.print(k + 1);
                } else if (k == 2 * i) {
                    System.out.print(i + 1);
                } else if (i == n - 1) {
                    System.out.print(k + 1);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}