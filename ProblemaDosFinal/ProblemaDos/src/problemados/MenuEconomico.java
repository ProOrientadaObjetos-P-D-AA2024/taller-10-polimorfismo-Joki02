package problemados;
public class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(double porcentajeDescuento, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
        calcularValor();
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void calcularValor() {
        valorMenu = valorInicialMenu - (valorInicialMenu * porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format("Porcentaje Descuento: %.2f\n", porcentajeDescuento);
    }
}
