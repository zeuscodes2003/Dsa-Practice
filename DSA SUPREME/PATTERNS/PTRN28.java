import java.util.Scanner;

public class PTRN28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (3 * 2) - 1 + i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }

    }
}