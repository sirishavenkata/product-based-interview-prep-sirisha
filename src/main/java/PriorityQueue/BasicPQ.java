package PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BasicPQ {
    //Min-heap= {1,2,3,4}
    //Max-heap ={5,3,2,1}

    public static void main(String[] args) {
        //Basic pQ Min heap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        System.out.println(pq.peek());

        //Max Heap -ways
        PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> pqx=new PriorityQueue<Integer>((x,y)-> y-x);
        PriorityQueue<Integer> pqc=new PriorityQueue<Integer>((x,y)-> Integer.compare(y,x));
        pq1.offer(5);
        pq1.offer(6);
        pq1.offer(1);
        pq1.offer(0);
        pqx.offer(1);
        pqx.offer(2);
        pqx.offer(3);
        pqx.offer(14);
        pqc.offer(1);
        pqc.offer(20);
        pqc.offer(38);
        pqc.offer(41);
        System.out.println(pq1);
        System.out.println(pqx);
        System.out.println(pqc);
        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }
        System.out.println(pq1.peek());





    }
}
