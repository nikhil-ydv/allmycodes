import java.util.ArrayList;
import java.util.List;

public class ToArrayMethod {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");
        strList.add("Good");
        strList.add("Morning");

        //Object[] objArray = strList.toArray();
        //after JDK 6 passing empty array is as fast as pre-sized array{here the strList.size() instead of 0}

        String[] strArray = strList.toArray(new String[0]);
        System.out.println(strArray[0]);
    }
}
