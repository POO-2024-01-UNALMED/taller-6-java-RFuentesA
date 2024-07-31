package vehiculos;
import java.util.ArrayList;

public class Vehiculo {

    //ATRIBUTOS
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static int cantidadVehiculos = 0;
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();


    //CONSTRUCTOR
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos ++;
        Vehiculo.agregarvehiculo(this);
        fabricante.agregarCantidad();
    }

    //METODOS
    


    
}
