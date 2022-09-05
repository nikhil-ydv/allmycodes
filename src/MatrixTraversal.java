public class MatrixTraversal {
    public static void main(String[] args) {
        //2d array
        System.out.println("Print left to right row wise");
        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};
        for(int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[0].length; col++) {
                System.out.print(arr2D[row][col]+" ");
            }
        }
        System.out.println();
        System.out.println("Print right to left row wise");
        //row right to left
        for(int row = 0; row < arr2D.length; row++) {
            for (int col = arr2D.length - 1; col >= 0; col--) {
                System.out.print(arr2D[row][col]+" ");
            }
        }
        //column top to bottom
         System.out.println();
        System.out.println("Print top to bottom column wise");

        for(int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[0].length; col++) {
                System.out.print(arr2D[col][row]+" ");
            }
        }
        //column bottom to top
        System.out.println();
        System.out.println("Print  bottom to top column wise");

        for(int row = 0; row < arr2D.length; row++) {
            for (int col = arr2D.length - 1; col >= 0; col--) {
                System.out.print(arr2D[col][row]+" ");
            }
        }

        //both diagonals
        System.out.println();
        System.out.println("Print  both diagonals");
        //forward diagonal
        int i = 0, j = 0;
        while(i<arr2D.length) {
            System.out.print(arr2D[i][j] + " ");
            i++;
            j++;

        }
        System.out.println();
        //backward diagonal
        int k = 0, l = arr2D.length - 1;
        while(k< arr2D.length) {
            System.out.print(arr2D[k][l]+ " ");
            k++;
            l--;
        }
        //all diagonals
//        1 2 3      first part where diagonal starts from first columns , other part diagonal start from last row
//        4 5 6
//        7 8 9
        System.out.println();
        System.out.println("All Diagonals");
        for(int d = 0; d < arr2D.length; d++) {
             i = d;
             j = 0;
             while(i >= 0) {
                 System.out.print(arr2D[i][j] + " ");
                 i--;
                 j++;
             }
            System.out.println();

        }
        //second part
        for(int d = 1; d < arr2D[0].length; d++) {
            i = arr2D[0].length - 1;
            j = d;
            while(j <= arr2D[0].length - 1) {
                System.out.print(arr2D[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }







    }
}
