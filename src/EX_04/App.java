package EX_04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("frase");
        String entrada = sc.nextLine();
        System.out.println("letra");
        String letra = sc.nextLine();

        for (int i = 0; i < entrada.length(); i++) {
            int valor = entrada.indexOf(letra, i);
            if (valor == -1) break;
            System.out.println(valor);
            i = valor;


        }
    }
}




