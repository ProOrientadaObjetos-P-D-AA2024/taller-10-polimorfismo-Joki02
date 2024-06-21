package problemados;
public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(double valorPostre, double valorBebida, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
        calcularValor();
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }
    
    public void calcularValor() {
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format("Valor bebida: %.2f\nValor postre: %.2f\n", valorBebida, valorPostre);
    }
}
