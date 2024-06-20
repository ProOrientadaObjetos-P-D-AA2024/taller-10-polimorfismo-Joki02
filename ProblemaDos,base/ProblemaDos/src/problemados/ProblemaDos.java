package problemados;

public class ProblemaDos {
    public static void main(String[] args) {
        MenuCarta menuCarta = new MenuCarta( 15.0, 5.0, 2.0,"Lomo Saltado", 10.0);
        MenuDia menuDia = new MenuDia( 12.0, 3.0,"Pollo a la Brasa", 2.0);
        MenuNinos menuNinos = new MenuNinos(8.0, 1.5,"Hamburguesa", 2.0);
        MenuEconomico menuEconomico = new MenuEconomico( 10.0,"Ensalada", 20.0);

        CuentaPorPagar cuenta = new CuentaPorPagar("Juan Perez");
        cuenta.agregarMenu(menuCarta);
        cuenta.agregarMenu(menuDia);
        cuenta.agregarMenu(menuNinos);
        cuenta.agregarMenu(menuEconomico);

        cuenta.calcularValores();
        System.out.println(cuenta);
    }
}
