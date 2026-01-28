import java.util.HashSet;

public class HashSet1 {
    static void main() {

        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //list.add(el)

        //Search - contains
        if(set.contains(1)) {
            System.out.println("Set Contains 1");
        }
        if(!set.contains(6)) {
            System.out.println("Does not contain");
        }
    }
}
