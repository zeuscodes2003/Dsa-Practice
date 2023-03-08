import java.util.Scanner;

public class PTRN29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(i + k + 1);
            }
            int c = 2 * i;
            for (int u = 0; u < i; u++) {
                System.out.print(2 * i - u);
            }
            System.out.println();
        }

    }
}
