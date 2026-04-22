package modelos;

import java.util.LinkedList;

public class Pedidos {
    // estrutura de dados pra ItemPedido
    private LinkedList<ItemPedido> itens = new LinkedList<ItemPedido>();
    private final Cliente cliente;

    public Pedidos(Cliente c){
        if (c == null){
            throw new IllegalArgumentException("cliente nulo");
        }    
        this.cliente = c;
    }

    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido ip = new ItemPedido(produto, quantidade);
        itens.add(ip);
    }

    public double totalPedido(){
        double total = 0;
        // System.out.println(itens.size());
        // for (int i = 0; i < itens.size(); i++) {
        //     ItemPedido item = itens.get(i); // itens[i]
        //     total += item.subtotal();
        // }
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }
}
