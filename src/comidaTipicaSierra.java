import java.util.Scanner;
public class comidaTipicaSierra extends comidaTipicaEcuador{
    //Atributo
    private String ciudad;

    public comidaTipicaSierra(String pais, String region, String ciudad) {
        super(pais, region);
        this.ciudad = ciudad;
    }

    private String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //Metodo personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("--- Ciudad del platillo ---");
        System.out.println("Ciudad: " + getCiudad());
    }
    //Cambiar datos
    @Override
    public void cambiarDatos(){
        super.cambiarDatos();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese a la ciudad que pertenece el platillo: ");
            setCiudad(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado.");
        }
    }
}
