import java.util.Scanner;

public class PTRN34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int cond = i <= n / 2 ? 2 * i : 2 * (n - i - 1);
            for (int j = 0; j <= cond; j++) {

                if (j <= cond / 2) {
                    System.out.print(j + 1);
                } else {
                    System.out.print(cond - j + 1);
                }

            }

            System.out.println();
        }

    }
}