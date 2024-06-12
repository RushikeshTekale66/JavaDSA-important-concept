import java.util.Map;
import java.util.HashMap;

/**
 * JavaDSA
 */
public class JavaDSA {

    public static void main(String [] args){
        Map<String, Integer> ht = new HashMap<>();

        // Add key value to hashmap
        ht.put("apple", 5);
        ht.put("banana", 8);
        ht.put("orange", 3);

        // get the value of that key
        int appleCount = ht.get("apple");
        System.out.println("Count of apple is : "+ appleCount);

        System.out.println(ht);

        // remove the data as per key
        ht.remove("orange");
        System.out.println(ht);

        // Check the hashmap contains the key
        boolean containsApple = ht.containsKey("apple");
        System.out.println("Contains apple ? "+containsApple);
    }
}