package EX_NONAME;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add("Elemento 1");
        al.add("Elemento 2");
        al.add("Elemento 3");

        String[] ary = new String[al.size()];


        ary = (String[]) al.toArray(ary);

        for (String s : ary)
            System.out.println(s);

    }

}
