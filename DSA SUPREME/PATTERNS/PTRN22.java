import java.util.Scanner;

public class PTRN22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * i) + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print(i + 1);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int k = n; k > 0; k--) {
            for (int u = 0; u < 2 * k - 1; u++) {
                if (u % 2 == 0) {
                    System.out.print(k);
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }

}
