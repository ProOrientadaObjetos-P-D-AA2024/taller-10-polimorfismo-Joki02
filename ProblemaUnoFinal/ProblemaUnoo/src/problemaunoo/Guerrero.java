package problemaunoo;
public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int puntosDeVida, int nivel, int experiencia, int fuerza) {
        super(nombre, puntosDeVida, nivel, experiencia);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca con su espada a " + enemigo.getNombre());
        enemigo.setPuntosDeVida(enemigo.getPuntosDeVida() - (10 + fuerza));
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se defiende con su escudo.");
        this.puntosDeVida += 5;
    }
}