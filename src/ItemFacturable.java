public abstract class ItemFacturable {
    private String nombre;
    private double precioBase;

    public ItemFacturable(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public abstract double calcularImpuesto();

    public double calcularPrecioFinal() {
        return precioBase + calcularImpuesto();
    }
}
