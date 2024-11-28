import java.util.Scanner;
public class comidaTipica {
    //Atributo
    private String pais;

    public comidaTipica(String pais) {
        this.pais = pais;
    }

    private String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //Metodo personalizado
    public void mostrarDatos(){
        System.out.println("--- Comida Tipica ---");
        System.out.println("Pais: " + getPais());
    }

    //Cambiar Datos
    public void cambiarDatos(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("--- Cambio de datos ---");
            System.out.println("Ingrese el pais de la comida tipica: ");
            setPais(sc.nextLine());
            } catch (Exception e){
            System.out.println("Error inesperado.");
        }
    }
}
