package vehiculos;
import java.util.ArrayList;

public class Fabricante {

    //ATRIBUTOS
    private int cantidad = 0;
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();

    //CONSTRUCTOR
    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
        pais.agregarFabricante(this);
    }

    //SETTER Y GETTER
    public void agregarCantidad(){
        cantidad ++;
    }
    public int getCantidad(){
        return cantidad;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }
    public Pais getPais(){
        return pais;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }


    //METODOS
    public static Fabricante fabricanteMayorVentas(){
        int x = 0;
        Fabricante mayor = null;
        for (int i = 0; i < fabricantes.size(); i++){
            if (fabricantes.get(i).getCantidad() > x){
                x = fabricantes.get(i).getCantidad();
                mayor = fabricantes.get(i);
            }
        }
                return mayor;
    }
    
}
