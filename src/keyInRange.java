import java.util.*;
public class keyInRange {

    // find numbers between P and R whose digits sum equals X, smallest is the public key, largest is private
    public static void main(String[] args) {
            int P = 9;
            int R = 99;
            int X = 8;
        findPublicPrivateKey(P,R,X);
    }

    public static void findPublicPrivateKey(int P, int R, int X) {
        ArrayList<Integer> arList = new ArrayList<>();
        //-------
        for(int i = P; i<=R; i++) {

            int sum = 0;
            int value = i;
            int rem = 0;
            while(value>0) {
//                rem = value % 10;
                sum = sum + i % 10; // write value in place of i to get exact result
                System.out.println(i);
                value = value/10;
            }
            if(sum == X) {
                arList.add(i);
            }
        }
        //----------------

        Collections.sort(arList);
        System.out.println(arList);
        System.out.println(arList.get(0));
        System.out.println(arList.get(arList.size() -1 ));
    }



}
