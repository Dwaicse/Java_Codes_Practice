package Collection;


import Collection.UtilClass.Point;

import java.util.TreeSet;

public class ComparablewithTreesetDemo {
    public static void main(String[] args)
    {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(-2,1));

        System.out.println(ts);
    }
}
