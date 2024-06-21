package problemados;
import java.util.ArrayList;
import java.util.List;

public class CuentaPorPagar {
    private String nombreCliente;
    private List<Menu> menuesSolicitados;
    private double subtotal;
    private double iva;
    private double valorTotal;
    
    public CuentaPorPagar(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.menuesSolicitados = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        menu.calcularValor();
        menuesSolicitados.add(menu);
    }

    public void calcularValores() {
        subtotal = 0;
        for (Menu menu : menuesSolicitados) {
            subtotal += menu.getValorMenu();
        }
        iva = subtotal * 0.12;
        valorTotal = subtotal + iva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta por pagar de: ").append(nombreCliente).append("\n");
        sb.append("Menús solicitados:\n");
        for (Menu menu : menuesSolicitados) {
            sb.append(menu).append("\n");
        }
        sb.append("Subtotal: $").append(String.format("%.2f", subtotal)).append("\n");
        sb.append("IVA (12%): $").append(String.format("%.2f", iva)).append("\n");
        sb.append("Valor Total: $").append(String.format("%.2f", valorTotal)).append("\n");
        return sb.toString();
    }
}
