package Instrumentos;

public abstract class Instrumento {

    public String nombre;
    public String marca;
    public double precio;

    public Instrumento(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public abstract String tocar();
}
