import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list = new ArrayList<>();

        int rows = grid.length;
        int cols = grid[0].length;
        int totalElements = rows * cols;
        int top = 0, left = 0, right =  grid[0].length - 1, bottom = grid.length -1;
        int count = 0;
        while(count <= totalElements) {
            int i;
            for(i = left; i <= right; i++) {
                list.add(grid[top][i]);
                count++;
            }
            top++;
            for(i = top; i <= bottom; i++) {
                list.add(grid[i][right]);  //Error in this line
                count++;
            }
            right--;
            for(i = right; i >= left; i--) {
                list.add(grid[bottom][i]);
                count++;
            }
            bottom--;
            for(i = bottom; i >= top; i--) {
                list.add(grid[i][left]);
                count++;
            }
            left++;
        }//while
        System.out.println(list);
    }//main
}//class