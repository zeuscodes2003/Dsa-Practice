import java.util.Scanner;

public class PTRN20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                if (k == 0 || k == i)
                    System.out.print(" *");
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                if (k == 0 || k == n - i - 1)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
