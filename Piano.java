package Instrumentos;

public class Piano extends Instrumento implements Afinable {

    public int numeroTeclas;
    public Piano(int numeroTeclas, String nombre, String marca, double precio) {
        super(nombre, marca, precio);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public String afinar() {
        return "Afinando el piano";
    }

    @Override
    public String tocar() {
        return "Tocando el piano";
    }
}
