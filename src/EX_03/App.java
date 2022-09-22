package EX_03;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("frase");
        String entrada = sc.nextLine();
        String[] frase = entrada.trim().split("");
        System.out.println("letra");
        String letra = sc.nextLine();
        for (int i = 0; i < frase.length; i++) {
            if (frase[i].equals(letra)){
                System.out.println("En la posicion "+i+" está la letra "+letra);
            }
        }

    }
}
