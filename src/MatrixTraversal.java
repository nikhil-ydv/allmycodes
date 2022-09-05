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
        //column top to bottom
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






    }
}
