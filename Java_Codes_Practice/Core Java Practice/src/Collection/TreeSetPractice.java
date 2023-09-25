package Collection;

import java.util.List;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args)
    {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,40,80,65,70));
        ts.add(45);
        ts.forEach(System.out::println);
        System.out.println("\n--------------------------------");
        System.out.println(ts.floor(50));
        System.out.println(ts.ceiling(50));

    }
}
