import java.util.Scanner;

public class PTRN19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (k < i) {
                    System.out.print(" ");
                    k++;
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }

}
