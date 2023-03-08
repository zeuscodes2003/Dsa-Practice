public class ARRAY03 {
    public static void main(String[] args) {
        int arr[] = { 532, 235, 235, 623, 33, 1, 90352, 2333 };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }

}
