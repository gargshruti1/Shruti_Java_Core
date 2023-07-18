package MyPackage2.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main (String args[]){
        ArrayList<String> studentName = new ArrayList<>();
        System.out.println(studentName);
        studentName.add("rakesh");
        studentName.add("honey");
        studentName.add("A");
        studentName.add("B");
        studentName.add("C");
        studentName.add("D");
        studentName.add("E");
        studentName.add("F");
        studentName.add("G");
        studentName.add(1,"ramesh");
        studentName.remove(1);
        studentName.set(1,"GH");
        System.out.println(studentName.contains(60));
        System.out.println(studentName);
        System.out.println(studentName.get(1));
        for (int i = 0;i<studentName.size();i++){
            System.out.println("element is "+ studentName.get(i));
        }
        for (String element: studentName){
            System.out.println(" using for each element is "+ element );// array iterate
        }
        Iterator<String> it = studentName.iterator();
        while (it.hasNext()){
            System.out.println("iterator "+ it.next());
        }
        }
}
