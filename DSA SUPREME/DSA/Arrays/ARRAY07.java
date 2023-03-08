import java.util.ArrayList;

public class ARRAY07 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 34, 53, 32, 45, 53 };
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            arr.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            arr.add(arr2[i]);

        }
        System.out.println(arr);

    }
}
