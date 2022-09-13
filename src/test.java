import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //StringBuffer sb = new StringBuffer(str);
        str = str.replaceAll("\\s","%20");
        System.out.println(str);


    }
}
