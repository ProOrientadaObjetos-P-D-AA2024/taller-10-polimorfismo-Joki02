package problemados;
public class MenuNinos extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(double valorHelado, double valorPastel, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
        calcularValor();
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public void setValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void setValorPastel(double valorPastel) {
        this.valorPastel = valorPastel;
    }
    

    public void calcularValor() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format("Valor helado: %.2f\nValor pastel: %.2f\n", valorHelado, valorPastel);
    }
}