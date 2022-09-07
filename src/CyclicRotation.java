import java.util.*;

class CyclicRotation {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int[] rotatedArr = cyclicRotation(n, arr, k);

        for (int j : rotatedArr)
            System.out.print(j + " ");

    }

    // 1 2 3 4 5 6  o to n-k-1, n-k to n-1
    static int[] cyclicRotation(int n, int[] arr, int k) {
        k = k % n; // to get k within the range of n
        //reverse from o to n-k-1 i.e. first part
        System.out.println("first"+Arrays.toString(arr));
        reverseArray(arr,0, n-k-1);
        //reverse from n-k to n-1
        System.out.println("second"+Arrays.toString(arr));
        reverseArray(arr, n-k, n-1);
        //reverse array
        System.out.println("third"+Arrays.toString(arr));
        reverseArray(arr, 0, n-1);
        System.out.println("final"+Arrays.toString(arr));
        return arr;
    }
    static void reverseArray(int[] arr, int start, int end) {
        while(start < end) { 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}