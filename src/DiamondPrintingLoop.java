public class DiamondPrintingLoop {
    public static void main(String[] args) {
        int n = 5;
        // 1 2 3 4 5, 6 7 8 9
        //            4 3 2 1
        String[] result = new String[2*n - 1];
        for(int i = 1; i<=n; i++) {
            String firstHalf = "";
            for(int j = 1; j <= i; j++) {
                firstHalf += "*"+" ";
            }
            result[i-1] = firstHalf;
        }
        for(int i = n+1; i < 2*n; i++) {
            String secondHalf = "";
            for(int j = 2*n - i; j >= 1; j--) {
                secondHalf += "*" + " ";
            }
            result[i-1] = secondHalf;
        }

        for(int i = 0; i < 2*n-1; i++) {
            System.out.println(result[i]);
        }
    }
}
