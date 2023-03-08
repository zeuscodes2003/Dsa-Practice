import java.util.ArrayList;
import java.util.Arrays;

public class ARRAY08 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5, 1, 9, 8));
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(arr1.size());
        System.out.println(arr2.size());
        int size = arr1.size() > arr2.size() ? arr1.size() : arr2.size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            int s = arr1.get(i);
            if (arr2.contains(s)) {
                ans.add(arr1.get(i));
            }

        }

        System.out.println(ans);

    }
}
