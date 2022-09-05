public class MaxInArray {
    public static void main(String[] args) {
        int[] numArr = {1,5,4,8,2,4,21,11,17,6};
        int len = numArr.length;
        int firstMax = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            firstMax = Math.max(firstMax, numArr[i]);
        }
        System.out.printf("First Maximum is:- %d ",firstMax);
        System.out.println();
        //print second max
        //Either sort array and then print second max or find first max and then compare array elements
        //other than firstMax to find second max
        String secondMax = String.format("Second max in array is %d .",secondMax(numArr,firstMax));
        System.out.println(secondMax);
    }

    public static int secondMax(int[] arr, int firstMax) {
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != firstMax) {
                secondMax = Math.max(secondMax,arr[i]);
            }
        }
        return secondMax;
    }
}
