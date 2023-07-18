package MyPackage2.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main (String[]args){

        Queue<Integer>queue= new LinkedList<>();
        queue.offer(12);
        queue.offer(2);
        queue.offer(13);
        queue.offer(124);
        queue.offer(128);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.peek();
        System.out.println(queue.peek());
    }
}
