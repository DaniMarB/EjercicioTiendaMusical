package Instrumentos;

public class Violin extends Instrumento implements Afinable{
    public String tipoDeViolin;


    public Violin(String nombre, String marca, double precio, String tipoDeViolin) {
        super(nombre, marca, precio);
        this.tipoDeViolin = tipoDeViolin;
    }

    @Override
    public String afinar() {
        return "Afinando el violin";
    }

    @Override
    public String tocar() {
        return "Tocando el violin";
    }
}
