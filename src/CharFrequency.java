import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CharFrequency {

    public static void main(String[] args) throws IOException {

        //take input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine();
        HashMap<String, Integer> map = new HashMap<>();

        //convert string to character array
        char[] chArr = userInput.toLowerCase().toCharArray();

        //iterate over array, convert character to string and update frequency
        for(char ch : chArr) {
            String stringChar = String.valueOf(ch);
            if(map.containsKey(stringChar)) {
                map.put(stringChar,map.get(stringChar) + 1);
            }
            map.putIfAbsent(stringChar,1);
        }
        System.out.println(map);
    }
}
