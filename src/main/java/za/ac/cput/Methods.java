package za.ac.cput;

import java.util.*;

public class Methods {


    public List<String> stringArray() // A method that creates a ArrayList of the string variable
    {
        List<String> ar = new ArrayList<>();  // Creating an ArrayList storing String variables
        ar.add("unit1");
        ar.add("unit2");        //Adding 3 string values to the ArrayList
        ar.add("unit3");
        return ar;              // Returning the newly created ArrayList


    }

    public Map<Integer, String> createMap()  // A method for creating a Hashmap with three keys
    {
        Map<Integer,String> map = new HashMap<>(); // Creating a new Map
        map.put(1,"dog");
        map.put(2,"cat");       // Adding 3 values to the mapp class with numerated keys
        map.put(3,"owl");
        return map;            // Returning the created Map called map.
    }

    public Set createSet() // a method for creating a hashSet with 4 string values
    {
        Set<String> hash_Set = new HashSet<String>();  // Creating a hashSet called hash_Set
        hash_Set.add("dog");
        hash_Set.add("frog");
        hash_Set.add("chimp");        // Adding various string elements
        hash_Set.add("cow");
        return hash_Set;
    }

}
