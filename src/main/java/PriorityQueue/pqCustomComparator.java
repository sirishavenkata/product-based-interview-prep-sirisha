package PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class pqCustomComparator {
    //Critical mandate to understand
    record Task(String name,int priority){}

    public static void main(String[] args) {
        PriorityQueue<Integer>  pqmax=new PriorityQueue<>(Collections.reverseOrder());
        pqmax.offer(8);
        pqmax.offer(3);
        pqmax.offer(2);
        pqmax.offer(5);

        PriorityQueue<Task> pqtask=new PriorityQueue<>(Comparator.comparing(t->t.priority));
        pqtask.add(new Task("saloon appointment",5));
        pqtask.add(new Task("Bath",3));
        pqtask.add(new Task("ContactInternet Support",2));
        pqtask.add(new Task("Learn for intervies",1));
        pqtask.add(new Task("Meetupp with friends",8));

        while(!pqtask.isEmpty()){
            System.out.println(pqtask.poll());
        }
        PriorityQueue<Task> multisorttask=new PriorityQueue<>(Comparator.comparing(Task::priority).thenComparing(Task::name));
        multisorttask.add(new Task("saloon appointment",5));
        multisorttask.add(new Task("Bath",3));
        multisorttask.add(new Task("ContactInternet Support",2));
        multisorttask.add(new Task("Learn for intervies",1));
        multisorttask.add(new Task("Meetupp with friends",8));
        System.out.println(multisorttask);
    }
}
