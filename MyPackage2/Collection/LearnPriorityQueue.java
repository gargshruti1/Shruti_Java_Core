package MyPackage2.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String args[]){
        Queue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(30);
        pq.offer(2);
        pq.offer(5);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
