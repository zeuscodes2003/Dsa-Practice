public class ARRAY02 {
    public int[] search(int arr[]) {
        int zero = 0;
        int c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero++;
            else
                c2++;
        }
        return new int[] { zero, c2 };

    }

    public static void main(String[] args) {
        ARRAY02 obj = new ARRAY02();
        int arr[] = { 1, 0, 0, 1, 0, 0, 1, 0, 1 };
        int ans[] = obj.search(arr);
        System.out.println(ans[0] + " " + ans[1]);
    }

}
