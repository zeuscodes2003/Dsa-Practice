import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAY10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 2, 4, 6));
        int target = 9;
        for (int i = 0; i < 7; i++) {
            if (arr1.contains((target - arr1.get(i)))) {
                System.out.println((arr1.get(i)) + " " + (target - arr1.get(i)));
                arr1.set(i, Integer.MIN_VALUE);
            }
        }

    }

}
