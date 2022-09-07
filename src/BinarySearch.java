public class BinarySearch {
    //Duplicates are present
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,4,5,5,6,7,8,9};
        int right = arr.length - 1;
        int target = 2;
        //left most index of target
        int resultIndex = binSearch(0, right, arr, target);
        System.out.println(resultIndex);
    }
    static int binSearch(int left, int right, int[] arr, int target) {
        int index = -1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(arr[mid] == target) {
                index = mid;
                right = mid - 1;
            }
            else if(arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }//while
        return index;
    }//binSearch

}
