// Duplicates are present

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,4,5,5,6,7,8,9};
        int right = arr.length - 1;
        int target = 5;
        int result = -1;
        int leftMostIndex = search(0, right, arr, target, result);
        System.out.println(leftMostIndex);
    }
    static int search(int left, int right, int[] arr, int target, int result) {
        if(left > right) {
            return result;
        }
        else {
            int mid = left+(right-left)/2;
            if(arr[mid] == target) {
                result = mid;
                return search(left, mid - 1, arr, target, result);
            }
            else if(arr[mid] < target) {
                return search(mid + 1, right, arr, target, result);
            }
            else {
                return search(left, mid - 1, arr, target, result);
            }
        }
    }
}
