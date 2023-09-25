package Collection;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface display_data{
    void display(String s);
}


public class ArrayListPractice {

    public static void main(String[] args) {

        display_data display_data = System.out::printf;

        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5,70);

        display_data.display(al1.toString());
        System.out.println("\n------------------------------");
        display_data.display(String.valueOf(al1.contains(10)));
        System.out.println("\n------------------------------");
        display_data.display(String.valueOf(al1.contains(1)));
        System.out.println("\n------------------------------");
        display_data.display(String.valueOf(al1.get(4)));
        System.out.println("\n------------------------------");
        display_data.display(String.valueOf(al1.lastIndexOf(70)));
        System.out.println("\n------------------------------");
        display_data.display(String.valueOf(al1.set(4,30)));
        System.out.println("\n------------------------------");
        display_data.display(al1.toString());
    }
}

