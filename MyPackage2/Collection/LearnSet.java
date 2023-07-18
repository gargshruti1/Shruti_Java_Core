package MyPackage2.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main (String args[]){
       /// Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(76);
        set.add(98);
        set.add(7);
        set.add(6);
        set.add(676);
        set.add(6);
        set.add(736);
        System.out.println(set);
        set.remove(6);
        System.out.println(set);
        System.out.println(set.contains(7));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
