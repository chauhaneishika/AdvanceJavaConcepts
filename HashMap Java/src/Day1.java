import java.util.HashMap;

public class Day1 {
    public static void main(String args[]){
        //country(key), population(value)
        HashMap<String, Integer> map =  new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);
    }
}
