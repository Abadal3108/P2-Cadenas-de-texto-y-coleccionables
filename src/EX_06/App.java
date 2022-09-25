package EX_06;

import java.nio.charset.StandardCharsets;

public class App {


    public static void main(String[] args) {
        String nombres = "Alexa";
        String[] letras = nombres.split("");
        byte[] ascii = nombres.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < ascii.length; i++) {
            System.out.println("ASCII Numeric Value of "+letras[i]+": "+ascii[i]);

        }
    }
}
