package problemaunoo;
public class Mago extends Personaje {
    private int poderMagico;

    public Mago(String nombre, int puntosDeVida, int nivel, int experiencia, int poderMagico) {
        super(nombre, puntosDeVida, nivel, experiencia);
        this.poderMagico = poderMagico;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " lanza un hechizo a " + enemigo.getNombre());
        enemigo.setPuntosDeVida(enemigo.getPuntosDeVida() - (8 + poderMagico));
    }

    @Override
    public void defender() {
        System.out.println(nombre + " usa un escudo mágico.");
        this.puntosDeVida += 3;
    }
}