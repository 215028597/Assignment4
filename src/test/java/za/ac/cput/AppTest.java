package za.ac.cput;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.lang.reflect.Method;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private Methods methods;

    @Before
    public void start() // runs before each test since every test is using methods from Method class, object needs to be instantiated
    {
       methods = new Methods(); // Creating a object of the methods class for future testing.
    }
    @Test
   public void stringArrayTest() // Tests the stringArray() method to ensure it is creating the correct list
    {
      List<String> result = methods.stringArray(); // Assigns the ArrayList off the stringArray method to a List called "result"
      Assert.assertEquals(Arrays.asList("unit1", "unit2", "unit3"), methods.stringArray()); // Compares the result List to the desired inputs

    }

    @Test
    public void stringArraySizeTest() // checking if the ArrayList is the correct size
    {
        List<String> result = methods.stringArray(); // Assigning Arraylist
        assertThat("is not size 3", result.size(), is(3)); // checking if the assigned ArrayList is size 3
    }

    @Test
    public void mapTest() // testing the creation and elements of the createMap() method
    {
        Map<Integer , String> result = methods.createMap();// create a map called result using the createMap() method

        assertThat("does not contain dog",result, IsMapContaining.hasEntry(1, "dog"));
        assertThat("does not contain cat",result, IsMapContaining.hasEntry(2, "cat")); // testing all elements
        assertThat("does not contain owl",result, IsMapContaining.hasEntry(3, "owl"));

    }
    @Test
    public void mapSizeTest()
    {
        Map<Integer , String> result = methods.createMap(); // Assigning map through create method
        assertThat("is not size 3",result.size(), is(3)); // Comparing size to created method

    }

    @Test
    public void mapEqualityTest()  // A test that creates an identical hashMap and tests if it is equal
    {
        Map<Integer, String> result = methods.createMap();  // Assigning HashMap
        Map<Integer, String> newMap = new HashMap<>(); // Creating new HashMap to compare
        newMap.put(2,"cat");
        newMap.put(1,"dog");        //Adding identical variables
        newMap.put(3,"owl");
        assertThat("hashMaps are different", newMap, is(result)); // Comparing both hashmaps

    }

    @Test
    public void setTest() // testing a set for various strings
    {
        Set result = methods.createSet(); // assigning created Set into variable for testing
        assertTrue ("does not contain cow",result.contains("cow"));
        assertTrue ("does not contain dog",result.contains("dog"));     // Testing various strings that are supposed to be present
        assertTrue ("does not contain frog",result.contains("frog"));
        assertTrue ("does not contain chimp",result.contains("chimp"));


    }

    @Test
    public void setSizeTest()
    {
        Set result = methods.createSet();
        assertThat("is not size 4",result.size(), is(4));
    }


}
