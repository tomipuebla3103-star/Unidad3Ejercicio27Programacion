//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

void main() {
    List<ItemFacturable> items = new ArrayList<>();

    items.add(new ProductoImportado("Computadora", 100000));
    items.add(new ServicioProfesional("Consultoria", 50000));
    items.add(new AlimentoBasico("Leche", 2000));

    for (ItemFacturable item : items) {
        System.out.println("Nombre: " + item.getNombre());
        System.out.println("Precio base: $" + item.getPrecioBase());
        System.out.println("Impuesto: $" + item.calcularImpuesto());
        System.out.println("Precio final: $" + item.calcularPrecioFinal());
        System.out.println("--------------------");
    }
}
