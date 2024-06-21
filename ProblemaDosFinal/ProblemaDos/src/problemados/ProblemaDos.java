package problemados;
import java.util.ArrayList;
import java.util.List;

public class ProblemaDos {
    public static void main(String[] args) {

        String[][] datos001 = {
            {"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"}
        };

        String[][] datos002 = {
            {"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {
            {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"}
        };

        String[][] datos004 = {
            {"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}
        };

        // Lista de Menus
        List<Menu> lista = new ArrayList<>();

        // Inicio de solución
        for (String[] datos : datos001) {
            MenuNinos menuNinos = new MenuNinos(
                Double.parseDouble(datos[2]), 
                Double.parseDouble(datos[3]), 
                datos[0], 
                Double.parseDouble(datos[1])
            );
            lista.add(menuNinos);
        }

        for (String[] datos : datos002) {
            MenuEconomico menuEconomico = new MenuEconomico(
                Double.parseDouble(datos[2]), 
                datos[0], 
                Double.parseDouble(datos[1])
            );
            lista.add(menuEconomico);
        }

        for (String[] datos : datos003) {
            MenuDia menuDia = new MenuDia(
                Double.parseDouble(datos[2]), 
                Double.parseDouble(datos[3]), 
                datos[0], 
                Double.parseDouble(datos[1])
            );
            lista.add(menuDia);
        }

        for (String[] datos : datos004) {
            MenuCarta menuCarta = new MenuCarta(
                Double.parseDouble(datos[2]), 
                Double.parseDouble(datos[3]), 
                Double.parseDouble(datos[4]), 
                datos[0], 
                Double.parseDouble(datos[1])
            );
            lista.add(menuCarta);
        }
        Cuenta miCuenta = new Cuenta("René Elizalde", lista);
        System.out.printf("%s\n", miCuenta);
    }
}