package EX_05;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        do {
            Integer mayus = 0;
            Integer minus = 0;
            Integer simbolos = 0;
            Integer numeros = 0;
            System.out.println("Introduce contraseña, Consideramos una contraseña fuerte si contiene 8 o más caracteres, y entre\n" +
                    "ellos, por lo menos una mayúscula, una minúscula, un símbolo y un dígito.");
            String contraseña = sc.toString();
            String[] partes = contraseña.split("");
            if (contraseña.length() <= 8) {
                System.out.println("Tamaño correcto, contiene 8 o más caracteres");
            } else {
                System.out.println("Tamaño incorrecto, necesita 8 o más caracteres");

            }
            for (int i = 0; i < partes.length; i++) {
                if (Character.isUpperCase(Integer.parseInt(partes[i]))) { //Convierte una cadena de texto en un número entero.
                    mayus++;
                } else if (Character.isLowerCase(Integer.parseInt(partes[i]))) {
                    minus++;
                } else if (Character.isDigit(Integer.parseInt(partes[i]))) {
                    numeros++;

                } else {
                    simbolos++;
                }
            }

            if (mayus >= 1 && minus >= 1 && numeros >= 1 && simbolos >= 1 && contraseña.length() <= 8) {
                System.out.println("Contraseña fuerte");
                correcto = true;
            }
        } while (!correcto);

    }

}
