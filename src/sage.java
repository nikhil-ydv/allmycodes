import java.util.*;
public class sage {
    // get middle character
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = getMiddle(str);
        System.out.println(result);
    }
    public static String getMiddle(String str) {
        String result = "";
        int middle = 0;
        int len = str.length();
        //System.out.println(len);
        if(len==0 || len == 1) {
            return str;
        }
        middle = len/2;
        //System.out.println(middle);
        if(len % 2==0) {
            //result = String.valueOf(str.charAt(middle-1))+String.valueOf(str.charAt(middle));
            result = String.valueOf(str.charAt(middle  - 1))+String.valueOf(str.charAt(middle));
            return result;
//            System.out.println(result+" sdfgsdjfg ");
        }
        else {
            result = str.charAt(middle) +"";
            return result;
        }



    }
}



