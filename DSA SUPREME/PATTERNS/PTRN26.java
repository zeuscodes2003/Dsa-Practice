import java.util.Scanner;

class PTRN26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 3 - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k % 2 == 0) {
                    System.out.print(i + 1);
                } else {
                    System.out.print("*");
                }
            }
            for (int u = 0; u < n + 3 - i; u++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}