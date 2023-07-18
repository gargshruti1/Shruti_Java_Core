package MyPackage2.ExceptionHandling;

import java.util.Scanner;

public class Throw extends RuntimeException {
    Throw(String msg) {
        super(msg);
    }
}

class voting {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ur age");
        try {
            int age = s.nextInt();
            if (age < 18) {
                throw new Throw("u r not eligible for vote ");
            } else {
                System.out.println("u can vote");
            }
        } catch (Throw e) {
            System.out.println("exception");
        }
    }
}