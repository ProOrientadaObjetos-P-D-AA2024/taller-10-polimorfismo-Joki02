package problemaunoo;

public class Combate {
    public  void iniciarCombate(Personaje p1, Personaje p2) {
        System.out.println("Comienza el combate entre " + p1.getNombre() + " y " + p2.getNombre());

        while (true) {
            p1.atacar(p2);
            if (p2.getPuntosDeVida() <= 0) {
                System.out.println(p2.getNombre() + " ha sido derrotado.");
                System.out.println(p1.getNombre() + " ha ganado el combate.");
                p1.subirNivel();
                break;
            }

            p2.atacar(p1);
            if (p1.getPuntosDeVida() <= 0) {
                System.out.println(p1.getNombre() + " ha sido derrotado.");
                System.out.println(p2.getNombre() + " ha ganado el combate.");
                p2.subirNivel();
                break;
            }
        }
    }
}

