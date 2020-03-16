package za.ac.cput;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Methods method = new Methods();
       List list = method.stringArray(); // Assigning based on created methods
       Map map = method.createMap();
       Set set = method.createSet();

       System.out.println("initial list" + list.toString());
       System.out.println("initial map" + map.toString()); // showing all the inital values of collection/map items without modification
       System.out.println("initial set" + set.toString());

       list.add("added item");
       System.out.println("added an item to list");
       map.put(4000,"added item");
       System.out.println("added a map value");         // adding and informing of additions
       set.add("added item");
       System.out.println("added an item to set");

       list.remove("unit2");
       System.out.println("removed unit 2");
       map.remove(2);
       System.out.println("removed value with key 2 from map");   // removing items and informing of additions
       set.remove("cow");
       System.out.println("removed cow from set");

        Collections.sort(list); // sorting the list


       System.out.println("updated list after changes" + list.toString());
       System.out.println("updated map after changes" + map.toString());       //showing the updated collection/map items after modification
       System.out.println("updated set after changes" + set.toString());


    }
}
