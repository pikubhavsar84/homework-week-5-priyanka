package homework_week_5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */
public class Programme_5_Iterator {
    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");

        // Get an Iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        // Use the Iterator to iterate through the elements
        System.out.println("Iterating through the ArrayList using Iterator:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
