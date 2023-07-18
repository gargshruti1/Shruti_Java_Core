package MyPackage2.Collection;

import java.util.Stack;

public class LearnStack {
    public static void main (String args[]){
        Stack<String> animal = new Stack<>();
        animal.push("lion");
        animal.push("cat");
        animal.push("dog");
        animal.push("Goat");
        animal.push("Horse");
        animal.push("rabbit");
        animal.push("peacock");
        System.out.println(animal);
        System.out.println(animal.peek()); // sabse top vala element i.e peacock
        animal.pop();  // sabse top vala element i.e peacock
        System.out.println(animal);
        System.out.println(animal.peek());
    }
}
