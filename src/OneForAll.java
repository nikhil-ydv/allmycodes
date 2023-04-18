import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.*;


class ImplementHashMap {
    void hMap() {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1,"Nikhil");
        hmap.put(2,"Sam");
        hmap.put(3,"Udemy");
        Set<Map.Entry<Integer, String>> entry= hmap.entrySet();
        System.out.println(entry);
        for( Map.Entry<Integer, String> out : entry) {
            System.out.println(out.getKey());
        }
    }
}

public class OneForAll {
    private String name;
    private int age;

    public OneForAll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "OneForAll{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {;

        //Constructor thing
        OneForAll obj1 = new OneForAll("Nikhil", 23);
        OneForAll obj2 = new OneForAll("Baby", 23);
        System.out.println(obj1);
        List<OneForAll> details = Arrays.asList(obj1, obj2);
        System.out.println(details);
        details.stream().filter(p -> p.getName().equals("Nikhil") || p.getAge() == 22).forEach(System.out::println);

        //HashMap Implementation
        ImplementHashMap impHmap = new ImplementHashMap();
        impHmap.hMap();

        //
        String[] arr = {"Nik","Shr"};
        //with new arraylist; asList will create fixed length list, no extra element can be added then
        List<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        arrayList.add("one more");
        System.out.println(arrayList);

        //char to string
        String o1 ;
        //System.out.println(o1);
        char ch = 'a';
        o1 = ""+ch;
        System.out.println(o1);

        Set<Integer> st = new HashSet<>();
        List<Integer> st1 = new LinkedList<>();
        st1.add(1);
        st1.add(2);

        st.addAll(st1);
        st1.add(1);
        System.out.println("str1 "+st1);
        System.out.println("st "+ st);
        System.out.println(st.containsAll(st1));
        st.forEach(e-> System.out.println(e));



    }
}
