public class functionCall {
    public static void main(String[] args) {
        //array is stored in heap
        int[] a = {5};
        System.out.println("Before: "+a[0]);
        increment(a);
        System.out.println("After Function: " +a[0]);
    }
    static void increment(int[] a) {
        a[0] += 1;
    }
}

//public class functionCall {
//    public static void main(String[] args) {
//        int a = 5;
//        System.out.println("Before: "+a);
//        increment(a);
//        System.out.println("After Function: " +a);
//    }
//    static void increment(int a) {
//        a += 1;
//    }
//}
