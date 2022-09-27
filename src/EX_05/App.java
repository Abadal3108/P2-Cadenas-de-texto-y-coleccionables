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

            String contraseña = sc.nextLine();
            String[] partes = contraseña.split("");
            if (contraseña.length() >= 8) {
                System.out.println("Tamaño correcto, contiene 8 o más caracteres");

                for (int i = 0; i < contraseña.length(); i++) {
                    if (Character.isUpperCase(contraseña.charAt(i))) { //Convierte una cadena de texto en un número entero.
                        mayus++;
                        System.out.println("+ " + mayus+" mayus");
                    } else if (Character.isLowerCase(contraseña.charAt(i))) {
                        minus++;
                        System.out.println("+ " + minus+" minus");
                    } else if (Character.isDigit(contraseña.charAt(i))) {
                        numeros++;
                        System.out.println("+ " + numeros+" num");

                    } else {
                        simbolos++;
                        System.out.println("+ " + simbolos+" sim");
                    }
                }
            } else {
                System.out.println("Tamaño incorrecto, necesita 8 o más caracteres");

            }


            if (mayus >= 1 && minus >= 1 && numeros >= 1 && simbolos >= 1 && contraseña.length() >= 8) {
                System.out.println("Contraseña fuerte");
                correcto = true;
            }
        } while (!correcto);
        System.out.println("correcto");
    }

}
