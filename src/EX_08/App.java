package EX_08;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(4);
        numeros.forEach( (n) -> { System.out.println(n); } );
    }
}
