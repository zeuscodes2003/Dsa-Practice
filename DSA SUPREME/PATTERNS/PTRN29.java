import java.util.Scanner;

public class PTRN29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            for (int s = 0; s < (2 * n) - 2 - 2 * i; s++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            for (int s = 0; s < 2 * i; s++) {
                System.out.print("  ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}