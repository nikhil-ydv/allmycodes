public class KadanesAlgo {

    int maxSubArraySum(int[] array) {
        int len = array.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < len; i++) {
            currentSum += array[i];

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
            else if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,-8, 2, 9, 1, 15};
        /*using annonymous object to call the method, annonymous objects
         are useful when you want to use the object only once*/
        int answer = new KadanesAlgo().maxSubArraySum(arr);
        //answer would be 27
        System.out.println("MaximumSubArraySum is: "+answer);
    }
}
