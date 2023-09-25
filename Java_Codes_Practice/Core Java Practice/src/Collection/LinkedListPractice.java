package Collection;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@FunctionalInterface
interface DisplayUtility_LL{
    void display(String str);
}

public class LinkedListPractice {


    public static void main(String[] args)
    {
        DisplayUtility_LL displayUtility_ll = System.out::println;
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(20,30,40,50,60));

        ll1.addFirst(10);
        ll1.add(200);
        ll1.addAll(1,ll2);

       // displayUtility_ll.display(ll1.toString());

        ListIterator<Integer> lit = ll1.listIterator();
        while (lit.hasNext())
        {
            System.out.print(" "+lit.next()+" ");
        }

        System.out.println();

        while (lit.hasPrevious())
        {
            System.out.print(" "+lit.previous()+" ");
        }
        System.out.println();
        ll1.forEach(n->displayUtility_ll.display(n.toString()));


    }









}
