package MyPackage2.Collection;

import java.util.ArrayDeque;

public class LearnArraydeque {
    public static void main(String args[]){
        ArrayDeque<Integer> adq= new ArrayDeque<>();
        adq.offer(1);
        adq.offer(89);
        adq.offerFirst(45);
        adq.offerLast(87);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.out.println(adq.pollLast());
        System.out.println(adq);
     }
}
