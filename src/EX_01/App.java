package EX_01;

public class App {
    public static void main(String[] args){

        String nombres = "Alex Abadal Goula";
        String[] partes = nombres.split(" ");
        String apellido = partes[1];
        String apellido1 = partes[2];
        String nombre = partes[0];
        char letra_nombre = nombre.charAt(0);
        System.out.println(apellido+" "+apellido1+" "+letra_nombre+".");
    }
}