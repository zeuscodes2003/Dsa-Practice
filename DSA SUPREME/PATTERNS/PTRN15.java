import java.util.Scanner;

public class PTRN15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = 0;

            for (int j = 0; j < (2 * n) - 1; j++) {

                if (j < n - i - 1) {
                    System.out.print(" ");
                } else if (k < (2 * i) + 1) {
                    System.out.print("*");
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
