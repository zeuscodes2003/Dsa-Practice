import java.util.Scanner;

public class PTRN12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) + 1; k++) {
                if (k == 0 || k == (2 * i)) {
                    if (k == 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(i + 1);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for (int i = 1; i <= n + 1; i++) {
            System.out.print(i + " ");
        }

    }

}
