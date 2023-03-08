import java.util.Scanner;

public class PTRN11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            int k = i;
            for (int j = 0; j < i + 1; j++) {

                System.out.print(((k++) + 1) + " ");
            }
            if (i == 0) {
                System.out.println();
                continue;
            }
            int b = i * 2;
            for (int u = 0; u < i; u++) {
                System.out.print(b-- + " ");
            }
            System.out.println();

        }
    }

}

// done by my own5