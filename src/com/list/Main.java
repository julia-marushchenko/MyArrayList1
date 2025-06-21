// Java program to demonstrate java ArrayList

package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating an ArrayList
        List<Fruit> list = new ArrayList<>();

        // Creating objects of class Fruit
        Fruit fruit = new Fruit("Apple");
        Fruit fruit1 = new Fruit("Peach");
        Fruit fruit2 = new Fruit("Mango");
        Fruit fruit3 = new Fruit("Watermelon");
        Fruit fruit4 = new Fruit("Melon");
        Fruit fruit5 = new Fruit("Grapes");
        Fruit fruit6 = new Fruit("Strawberries");
        Fruit fruit7 = new Fruit("Pomelo");
        Fruit fruit8 = new Fruit("Plum");

        // Adding elements to the list
        list.add(fruit);
        list.add(fruit1);
        list.add(fruit2);
        list.add(fruit3);
        list.add(fruit4);
        list.add(fruit5);
        list.add(fruit6);
        list.add(fruit7);
        list.add(fruit8);

        // Printing elements of the list to console
        System.out.println(list);

        // Deleting Pomelo from the list
        list.remove(fruit7);

        // Printing elements of the list to console
        System.out.println(list);

        // Checking if there is Peach in the list
        System.out.println("Is Peach in the list: " + list.contains(fruit2));

        // Checking if there is Pomelo in the list
        System.out.println("Is Pomelo in the list: " + list.contains(fruit7));

        // Checking if there is Apple in the list
        System.out.println("Is Apple in the list: " + list.contains(fruit1));

        // Checking if there is Watermelon in the list
        System.out.println("Is Watermelon in the list: " + list.contains(fruit3));

    }
}

// Fruit class
class Fruit{

    // Name attribute
    String name;

    // Constructor of the class
    public Fruit(String name) {
        this.name = name;
    }

    // ToString method for correct visualisation
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }

    // Equals method for correct comparing objects
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    // HashCode method
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}