package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComp implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }
}

public class PriorityQueuePractice {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());
        pq.add(20);
        pq.add(70);
        pq.add(40);
        pq.add(30);
        pq.add(80);
        pq.add(60);
        pq.add(90);
        pq.add(50);

        System.out.println(pq.peek());
        System.out.println("\n-----------------------------");
        pq.forEach(System.out::println);

       pq.poll();

        System.out.println("\n-----------------------------");
        System.out.println("\nAfter Deletion");
        pq.forEach(System.out::println);

    }
}
