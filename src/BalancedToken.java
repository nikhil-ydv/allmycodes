import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BalancedToken {

    static Boolean balancedToken(String name) {
        name = convertToLower(name);
        // System.out.println(name);


        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < name.length(); i++) {
            Character chAtIndex = name.charAt(i);
            if(mp.containsKey(chAtIndex)) {
                mp.put(chAtIndex, mp.get(chAtIndex) + 1);
            }
            else {
                mp.put(chAtIndex, 1);
            }
        }

        Set<Integer> valueSet = new HashSet<>(mp.values());
        if(valueSet.size() == 1) {
            return true;
        }
        return false;
    }

    static String convertToLower(String name) {
        StringBuffer sb = new StringBuffer(name);
        for(int i = 0; i < name.length(); i++) {
            if(Character.isUpperCase(sb.charAt(i))) {
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name = "AbdabcC" ;
        System.out.println(balancedToken(name));
    }
}
