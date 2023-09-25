package Collection;

import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args)
    {
        HashSet<Integer> hs = new HashSet<>(20,0.75f);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(80);
        System.out.println(hs);

    }


}
