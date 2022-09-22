package EX_04;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("frase");
        String entrada = sc.nextLine();
        System.out.println("letra");
        String letra = sc.nextLine();

            int veces=entrada.indexOf(letra);
            System.out.println(veces);

        }
    }

