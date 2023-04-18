import org.jetbrains.annotations.NotNull;

import static java.lang.Character.isDigit;

public class Rough implements Comparable<Object>{

//    static int maxSubArraySum(int[] arr) {
//        int len = arr.length;
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//
//        for(int i = 0; i < len; i++) {
//            currSum += arr[i];
//            if(currSum > maxSum) {
//                maxSum = currSum;
//            }
//            else if(currSum < 0) {
//                currSum = 0;
//            }
//        }
//        return maxSum;
//    }
//
    public static void main(String[] args) {
//        int[] array = {1, -2, 5, 4, -21, 6};
//        System.out.println("MaxSubArraySum : "+maxSubArraySum(array));
        String str = "@1NIK*";
        if('9' > '4') {
            System.out.println(true);
            System.out.println('9');
        }

        System.out.println(str.toLowerCase());
//        System.out.println(lowerCase(str));
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }


    //Convert string to lowercase
//    static String lowerCase(String str) {
//        int len = str.length();
//        StringBuffer sb = new StringBuffer(str);
//
//        for(int i = 0; i < len; i++) {
//            if(Character.isUpperCase(sb.charAt(i))) {
//                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
//            }
//        }
//        String lowString = sb.toString();
//        return lowString;
//    }






}
