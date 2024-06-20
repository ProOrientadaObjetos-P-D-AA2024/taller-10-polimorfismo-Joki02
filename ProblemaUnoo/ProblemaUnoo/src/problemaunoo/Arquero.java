package problemaunoo;
public class Arquero extends Personaje {
    private int precision;

    public Arquero(String nombre, int puntosDeVida, int nivel, int experiencia, int precision) {
        super(nombre, puntosDeVida, nivel, experiencia);
        this.precision = precision;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " dispara una flecha a " + enemigo.getNombre());
        enemigo.setPuntosDeVida(enemigo.getPuntosDeVida() - (7 + precision));
    }

    @Override
    public void defender() {
        System.out.println(nombre + " esquiva el ataque.");
        this.puntosDeVida += 2;
    }
}
