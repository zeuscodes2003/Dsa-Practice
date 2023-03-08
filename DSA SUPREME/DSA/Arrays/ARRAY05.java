public class ARRAY05 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int temp, start = 0, end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}

// time complexity is 0(n)