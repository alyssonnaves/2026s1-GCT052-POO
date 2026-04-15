package modelos;

import java.util.LinkedList;

public class Pedidos {
    // estrutura de dados pra ItemPedido
    LinkedList<ItemPedido> itens = new LinkedList<ItemPedido>();

    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido ip = new ItemPedido(produto, quantidade);
        itens.add(ip);
    }

    public double totalPedido(){
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }
}
