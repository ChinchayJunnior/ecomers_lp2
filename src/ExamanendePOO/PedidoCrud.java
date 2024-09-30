package ExamanendePOO;

import java.util.ArrayList;
import java.util.List;

public class PedidoCrud implements Interface<Pedido> {
    private final List<Pedido> pedidos = new ArrayList<>();

    public void crear(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido creado: " + pedido.getId());
    }

    public Pedido leer(int id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }
        System.out.println("Pedido no encontrado.");
        return null;
    }

    public void actualizar(Pedido pedido) {
        Pedido pedidoExistente = leer(pedido.getId());
        if (pedidoExistente != null) {
            pedidos.set(pedidos.indexOf(pedidoExistente), pedido);
            System.out.println("Pedido actualizado: " + pedido.getId());
        }
    }

    public void eliminar(int id) {
        Pedido pedido = leer(id);
        if (pedido != null) {
            pedidos.remove(pedido);
            System.out.println("Pedido eliminado: " + id);
        }
    }
}

