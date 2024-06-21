package problemados;
public class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(double valorGuarnicion, double valorBebida, double porcentajeServicio, String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
        calcularValor();
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeServicio() {
        return porcentajeServicio;
    }

    public void setPorcentajeServicio(double porcentajeServicio) {
        this.porcentajeServicio = porcentajeServicio;
    }

    public void calcularValor() {
        valorMenu = valorInicialMenu + valorGuarnicion + valorBebida + (valorInicialMenu * porcentajeServicio / 100);
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format("Valor guarnición: %.2f\nValor bebida: %.2f\nPorcentaje Adicional: %.2f\n", valorGuarnicion, valorBebida, porcentajeServicio);
    }
}
