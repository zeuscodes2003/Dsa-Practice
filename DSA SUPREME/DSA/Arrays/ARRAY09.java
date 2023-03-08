import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAY09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i) == arr2.get(j)) {
                    result.add(arr2.get(j));
                    arr2.remove(j);
                }
            }
        }

        System.out.println(result);

    }

}
