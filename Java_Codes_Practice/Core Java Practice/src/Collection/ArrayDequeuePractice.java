package Collection;

import java.util.ArrayDeque;

public class ArrayDequeuePractice {

    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.offerLast(60);
        dq.offerFirst(5);

        dq.forEach(System.out::println);
        System.out.println("\n------------------------------------");
        dq.pollFirst();
        dq.forEach(System.out::println);
        System.out.println("\n------------------------------------");
        dq.offerLast(80);
        dq.forEach(System.out::println);
        System.out.println("\n------------------------------------");
        dq.pollFirst();
        dq.pollLast();
        dq.forEach(System.out::println);
    }



}
