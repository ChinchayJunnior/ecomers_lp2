package ExamanendePOO;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new ProductoElectronico("Laptop", 1000, "Dell");
        Producto producto2 = new ProductoRopa("Camiseta", 20, "M");

        // Crear un pedido
        Pedido pedido1 = new Pedido(1, "Juan", Arrays.asList(producto1, producto2), "pendiente");

        // Crear el CRUD de pedidos
        PedidoCrud pedidoCRUD = new PedidoCrud();

        // Operaciones CRUD
        pedidoCRUD.crear(pedido1); // Crear
        Pedido pedidoLeido = pedidoCRUD.leer(1); // Leer
        if (pedidoLeido != null) {
            pedidoLeido.mostrarDetalles(); // Mostrar detalles del pedido
        }

        // Actualizar el estado del pedido
        pedido1 = new Pedido(1, "Juan", Arrays.asList(producto1, producto2), "enviado");
        pedidoCRUD.actualizar(pedido1);

        // Eliminar el pedido
        pedidoCRUD.eliminar(1);
    }
}
