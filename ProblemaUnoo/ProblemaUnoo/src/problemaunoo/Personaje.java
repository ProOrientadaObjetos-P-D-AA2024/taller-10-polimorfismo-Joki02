package problemaunoo;
public abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected int nivel;
    protected int experiencia;

    public Personaje(String nombre, int puntosDeVida, int nivel, int experiencia) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public abstract void atacar(Personaje enemigo);
    public abstract void defender();

    public void subirNivel() {
        this.nivel++;
        this.puntosDeVida += 10;
        this.experiencia = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    @Override
    public String toString() {
        return nombre + " [Vida: " + puntosDeVida + ", Nivel: " + nivel + ", Experiencia: " + experiencia + "]";
    }
}