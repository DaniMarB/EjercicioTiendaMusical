package Instrumentos;

public class Guitarra extends Instrumento implements Afinable{
    public int numeroCuerdas;

    public Guitarra(String nombre, String marca, double precio, int numeroCuerdas) {
        super(nombre, marca, precio);
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public String afinar() {
        return "Afinando la guitarra";
    }

    @Override
    public String tocar() {

        return "Tocando la guitarra";

    }
}
