package problemaunoo;
public class ProblemaUnoo {

    public static void main(String[] args) {
        Guerrero guerrero1 = new Guerrero("THOR", 100, 1, 0, 15);
        Mago mago1 = new Mago("LOKI", 80, 1, 0, 20);

        Combate.iniciarCombate(guerrero1, mago1);
    }
}
