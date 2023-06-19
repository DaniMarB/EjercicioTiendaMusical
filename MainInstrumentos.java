package Instrumentos;

public class MainInstrumentos {
    public static void main(String[] args) {
        Piano p1 = new Piano(40,"De pared","Yamaha",65000);
        Violin v1  = new Violin("nombre","Stentor",260000,"acustico");
        Guitarra g1 = new Guitarra("Electrica","Gibson",800000,6);

        System.out.println(p1.afinar());
        System.out.println(p1.tocar());
        System.out.println(v1.afinar());
        System.out.println(v1.tocar());
        System.out.println(g1.afinar());
        System.out.println(g1.tocar());

    }
}
