/**
 *
 * A Set stores an unordered collection of unique values.
 * In this article, we’ll cover the following topics:
 *
 * creating a Set
 * adding items to a Set
 * removing items from a Set
 * checking for an item
 * finding the size of a Set
 * iterating through a Set
 * using Set operations
 */


// Import Set class:
import java.util.Set;

// Import HashSet class:
import java.util.HashSet;

// Import TreeSet class:
import java.util.TreeSet;

// Import LinkedHashSet class:
import java.util.LinkedHashSet;

// Import all classes:
import java.util.*;

public class Set_ {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("orange");

        Set<String> primary = new HashSet<String>();
        primary.add("red");
        primary.add("yellow");

// Modify colors to store a union between colors set and primary set:
        colors.removeAll(primary);
        System.out.println(colors); // Prints: [red, orange, yellow]
    }

}
