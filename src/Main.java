import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hornado hornado1 =new hornado("nada","nada","nada","nada","nada",0.0);
        hornado1.mostrarDatos();
        hornado1.cambiarDatos();
        hornado1.mostrarDatos();
    }
}