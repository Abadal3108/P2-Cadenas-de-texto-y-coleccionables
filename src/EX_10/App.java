package EX_10;

import java.security.KeyStore;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) {
        HashMap<String, Integer> numeros = new HashMap<String, Integer>();

        //añadir valores al hashmap
        numeros.put("dos", 2);
        numeros.put("tres", 3);
        numeros.put("cuatro", 4);
        numeros.put("cinco", 5);
        numeros.put("seis", 6);
        numeros.put("uno", 1);
        System.out.println(numeros);
//Ordenar/crear el treee
        SortedSet<Integer> valores = new TreeSet<>(numeros.values());
        Iterator<Integer> iterator = valores.iterator();
//print del tree
        System.out.print("Tree set data: ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        // check si esta vacio
        if (valores.isEmpty())
            System.out.print("Tree Set is empty.");
        else
            System.out.println("Tree Set size: " + valores.size());


    }


}

