import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum ^ arr.get(i);

        }

        System.out.println(sum);
    }
}