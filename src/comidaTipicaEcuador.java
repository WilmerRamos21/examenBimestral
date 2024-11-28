import java.util.Scanner;
public class comidaTipicaEcuador extends comidaTipica {
    //Atributos
    private String region;

    public comidaTipicaEcuador(String pais, String region) {
        super(pais);
        this.region = region;
    }

    //Get
    private String getRegion() {
        return region;
    }
    //Set
    public void setRegion(String region) {
        this.region = region;
    }

    //Metodo personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("--- Comida tipica de Ecuador ---");
        System.out.println("Region comida tipica: " + getRegion());
    }
    //Cambiar datos
    @Override
    public void cambiarDatos(){
        super.cambiarDatos();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la region del platillo: ");
            setRegion(sc.nextLine());
        }catch (Exception e){
            System.out.println("Se ha producido un error inesperado.");
        }
    }

}
