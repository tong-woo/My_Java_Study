/**
 * A HashMap is a built-in data structure that stores a collection
 * of key-value pairs. Each key acts as a unique identifier for its
 * associated value. In this article, we’ll cover the following topics:
 *
 * creating a HashMap
 * adding a key-value pair
 * accessing a value
 * removing a key-value pair
 * traversing a HashMap
 * additional HashMap methods
 */
import java.util.HashMap;


public class Hash_map {
    public static void main(String[] args){
        HashMap<String, Integer> teaSteepingTemp = new HashMap<>();
        // Add key-value pairs to HashMap:
        // Add key-value pairs to HashMap:
        teaSteepingTemp.put("Oolong", 185);
        teaSteepingTemp.put("Rooibos", 212);

        // Output the size of a HashMap:
        System.out.println(teaSteepingTemp.size()); // Prints: 2

        // Output a HashMap:
        System.out.println(teaSteepingTemp); // Prints: {Oolong=185, Rooibos=212}

        // Remove an item:
//        teaSteepingTemp.remove("Oolong");
//        System.out.println(teaSteepingTemp); // Prints: {Rooibos=212}

        // Remove all items:
//        teaSteepingTemp.clear();
//        System.out.println(teaSteepingTemp); // Prints: {}

        //Iterate through HaspMap
        for(String key: teaSteepingTemp.keySet()){
            System.out.println("Brew " + key + " tea at " + teaSteepingTemp.get(key) + "°F");
        }
        // Check for keys:
        System.out.println(teaSteepingTemp.containsKey("Oolong")); // Prints: true
        System.out.println(teaSteepingTemp.containsKey("Green")); // Prints: false

        // Replace a value:
        teaSteepingTemp.replace("Rooibos", 245);
        System.out.println(teaSteepingTemp.get("Rooibos")); // Prints: 245
    }
}
