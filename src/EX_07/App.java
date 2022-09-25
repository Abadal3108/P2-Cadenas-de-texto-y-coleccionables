package EX_07;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("try1");
        al.add("try2");
        al.add("try3");
        al.add("try4");
        al.add("try5");
//iterator
        Iterator<String> it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
