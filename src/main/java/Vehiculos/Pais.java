package vehiculos;
import java.util.ArrayList;

public class Pais {

    //ATRIBUTOS
    private String nombre;
    private ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private static ArrayList<Pais> paises = new ArrayList<>();

    //CONSTRUCTOR
    public Pais(String nombre){
        this.nombre = nombre;
        paises.add(this);
    }

    //METODOS
    public static Pais paisMasVendedor(){
        return Fabricante.fabricanteMayorVentas().getPais();
    }

    public void agregarFabricante(Fabricante fabricante){
        fabricantes.add(fabricante);
    }

    //SETTER Y GETTER
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;

    }
    
}
