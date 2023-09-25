package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface Display_Data_REf{
    void display(String str);
}


public class ArrayListIteration {

     static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }

    public static void main(String[] args)
    {
       Display_Data_REf display_data = System.out::printf;

        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(20,30,40,50,70,80,90));



        al1.add(10);
        al1.add(100);
        al1.addAll(1,al2);
        //display_data.display(al1.toString());

             /*  Iterator<Integer> it = al1.iterator();
        while (it.hasNext()){
            display_data.display(String.valueOf(it.next()));
        }
*/
       // al1.forEach(n->System.out.println(n));
      //  al1.forEach(System.out::println);
       // al1.forEach(n->show(n));
        al1.forEach(ArrayListIteration::show);


    }


}
