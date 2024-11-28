import java.util.InputMismatchException;
import java.util.Scanner;
public class hornado extends comidaTipicaSierra{
    //Atributos
    private String ingredientePrincipal;
    private String ingredienteSecundario;
    private double tiempoPreparacion;

    public hornado(String pais, String region, String ciudad, String ingredientePrincipal, String ingredienteSecundario, double tiempoPreparacion) {
        super(pais, region, ciudad);
        this.ingredientePrincipal = ingredientePrincipal;
        this.ingredienteSecundario = ingredienteSecundario;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    //Get
    private String getIngredientePrincipal() {
        return ingredientePrincipal;
    }
    private String getIngredienteSecundario() {
        return ingredienteSecundario;
    }
    private double getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setIngredientePrincipal(String ingredientePrincipal) {
        this.ingredientePrincipal = ingredientePrincipal;
    }

    public void setIngredienteSecundario(String ingredienteSecundario) {
        this.ingredienteSecundario = ingredienteSecundario;
    }

    public void setTiempoPreparacion(double tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    //Metodo personalizado
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("--- Datos del plato ---");
        System.out.println("Ingrediente Principal: " + getIngredientePrincipal());
        System.out.println("Ingrediente Secundario: " + getIngredienteSecundario());
        System.out.println("Tiempo preparacion: " + getTiempoPreparacion());
    }
    //Cambiar Datos
    @Override
    public void cambiarDatos() {
        super.cambiarDatos();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el ingrediente principal: ");
            setIngredientePrincipal(sc.nextLine());
            System.out.println("Ingrese el ingrediente secundario: ");
            setIngredienteSecundario(sc.nextLine());
            System.out.println("Ingrese el tiempo preparacion (Minutos): ");
            setTiempoPreparacion(sc.nextDouble());
        } catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
