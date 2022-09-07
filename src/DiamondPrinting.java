import java.util.*;

class DiamondPrinting {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = diamondPrinting(n);

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);

    }

    // TODO: Implement this method
    static String[] diamondPrinting(int n) {
        String[] result = new String[2*n-1];

        for(int i = 0; i < n; i++) {
            String firstHalf = "";

            for(int j = 0; j <= i; j++){
                firstHalf += "*"+" ";
            }
            result[i] = firstHalf;
        }

        for(int i = n+1; i < 2*n; i++) {
            String secondHalf = "";
            for(int j = 2*n-i; j > 0; j--){
                secondHalf += "*"+" ";
            }
            result[i-1] = secondHalf;
        }

        return result;
    }//func
}