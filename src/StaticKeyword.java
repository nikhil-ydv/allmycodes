
public class StaticKeyword {
    static int num = 5;
//  final static num = 5;  To make this num constant for all the members of the class
    public static void main(String[] args) {

        //static fields/variables can only be created at class level and not local to any block.
        //static int error = 37;

        /*If num is not static, It will give error because
          our method is static and we can not access non-static fields directly*/
        System.out.println(num);

        
    }


}
