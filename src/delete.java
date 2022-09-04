import java.util.*;

public class delete {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(addDigits(num));
          System.out.println(increamentResult());
//          int num = 123_43;
//        System.out.println(num);
    }

    //
    public static List<Integer> increamentResult() {
        List<Integer> arList = new ArrayList<>();
        System.out.println("PRINTING THE RESULT OF DOING i++ in for loop:- ");
        for(int i = 0; i < 10; i = i+2) {

            arList.add(i);
            i++;
        }
        return arList;

    }

    // function to add digits
//    public static int addDigits(int num) {
//        int sum = 0;
//        while(num>0) {
//            int rem = num  % 10;
//            sum = sum + rem;
//            num = num / 10;
//        }
//        return sum;
//    }
}
