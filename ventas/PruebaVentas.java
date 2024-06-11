package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("** Sistema de Venta **");
        var camisa1 = new Producto("Camisa", 50.00);
        System.out.println(camisa1);
        var pantalon1 = new Producto("pantalon", 100.00);
        System.out.println(pantalon1);

        // Primera Orden
        var orden1 = new Orden();
        orden1.agregarProducto(camisa1);
        orden1.agregarProducto(pantalon1);
        orden1.mostrarOrden();
    }
}
