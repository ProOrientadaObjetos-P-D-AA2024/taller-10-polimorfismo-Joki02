package problemados;
import java.util.List;

public class Cuenta {
    private String nombreCliente;
    private List<Menu> menuesSolicitados;
    private double subtotal;
    private double iva;
    private double valorTotal;

    public Cuenta(String nombreCliente, List<Menu> menuesSolicitados) {
        this.nombreCliente = nombreCliente;
        this.menuesSolicitados = menuesSolicitados;
        calcularValores();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<Menu> getMenuesSolicitados() {
        return menuesSolicitados;
    }

    public void setMenuesSolicitados(List<Menu> menuesSolicitados) {
        this.menuesSolicitados = menuesSolicitados;
    }

    public void calcularValores() {
        subtotal = 0;
        for (Menu menu : menuesSolicitados) {
            subtotal += menu.getValorMenu();
        }
        iva = subtotal * 0.15; 
        valorTotal = subtotal + iva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura\n");
        sb.append("Cliente: ").append(nombreCliente).append("\n\n");

        for (Menu menu : menuesSolicitados) {
            sb.append(menu.toString()).append("\n");
        }

        sb.append(String.format("Subtotal: %.2f\n", subtotal));
        sb.append("IVA: 10,0%\n");
        sb.append(String.format("Total a pagar: %.3f\n", valorTotal));

        return sb.toString();
    }
}