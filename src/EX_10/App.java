package EX_10;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> numeros = new HashMap<String, String>();

        //añadir valores al hashmap
        numeros.put("uno", "1");
        numeros.put("dos", "2");
        numeros.put("tres", "3");
        numeros.put("cuatro", "4");
        //sout con hashmap
        System.out.println(numeros);

        //creamos treemap de strings asignar el hashmap
        TreeMap<String, String> tm = new TreeMap<String, String>(numeros);
        Iterator itr = tm.keySet().iterator();
        while (itr.hasNext()) {

            //preguntar key si es el string0? o que es?
            String key = (String) itr.next();
            System.out.println("key: " + key + " ,value: " + numeros.get(key));
        }
        ArrayList<HashMap<String, String>> arrayListHashMap = new ArrayList<HashMap<String, String>>();
        arrayListHashMap.add(numeros);
        Iterator<HashMap<String, String>> it = arrayListHashMap.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());


        }
    }
    }

