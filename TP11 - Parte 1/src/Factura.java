import java.util.ArrayList;
import java.util.Date;

public class Factura {
    // Atributos
    private int nroFactura;
    private Date fechaEmision;
    private String cliente;
    private ArrayList<String> articulos;
    private ArrayList<Double> precioUnitario;
    private ArrayList<Integer> cantidad;
    private double subtotal;
    private double iva;
    private double total;

    // Constructor
    public Factura(int nroFactura, Date fechaEmision, String cliente) {
        this.nroFactura = nroFactura;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.precioUnitario = new ArrayList<>();
        this.cantidad = new ArrayList<>();
    }

    // Agregar artículo a la factura
    public void agregarArticulo(String articulo, double precioUnitario, int cantidad) {
        this.articulos.add(articulo);
        this.precioUnitario.add(precioUnitario);
        this.cantidad.add(cantidad);
    }

    // Calcular subtotal
    public double calcularSubtotal() {
        subtotal = 0.0;
        for (int i = 0; i < articulos.size(); i++) {
            subtotal += precioUnitario.get(i) * cantidad.get(i);
        }
        return subtotal;
    }

    // Calcular IVA
    public double calcularIVA(double porcentajeIVA) {
        iva = calcularSubtotal() * (porcentajeIVA / 100);
        return iva;
    }

    // Calcular total (con IVA)
    public double calcularTotal(double porcentajeIVA) {
        total = calcularSubtotal() + calcularIVA(porcentajeIVA);
        return total;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Número de Factura: " + nroFactura);
        System.out.println("Fecha de Emisión: " + fechaEmision);
        System.out.println("Cliente: " + cliente);
        System.out.println("Artículos: ");
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println(articulos.get(i) + " - Precio Unitario: " + precioUnitario.get(i) + " - Cantidad: " + cantidad.get(i));
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        Factura miFactura = new Factura(220405, new Date(), "Uriel Vera");

        // Agregar artículos
        miFactura.agregarArticulo("Memoria RAM", 40000, 2);
        miFactura.agregarArticulo("Parlantes", 20000, 4);
        miFactura.agregarArticulo("Gabinete", 10000, 1);

        // Calcular gastos
        double porcentajeIVA = 21.0;
        miFactura.calcularSubtotal();
        miFactura.calcularIVA(porcentajeIVA);
        miFactura.calcularTotal(porcentajeIVA);

        // Mostrar Información
        miFactura.mostrarInformacion();
    }
}