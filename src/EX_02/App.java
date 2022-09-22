package EX_02;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
 int tamaño;
        int sobra;

        String entrada1 = "   Alexaa3333";
        String[] parte1 = entrada1.trim().split("");
        String entrada2 = "Marcaaiiiiiiiiiiiiiiiiiiiii";
        String[] parte2 = entrada2.trim().split("");


        if (parte1.length > parte2.length) {
            tamaño = parte1.length;
        } else {
            tamaño = parte2.length;
        }
        for (int i = 0; i < tamaño; i++) {
            if (parte1.length > i) {
                System.out.print(parte1[i]);
            }
            if (parte2.length > i) {
                System.out.print(parte2[i]);
            }
        }
    }
}
