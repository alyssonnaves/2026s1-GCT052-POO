package modelos;

public class TestePedidos {
    public static void main(String[] args) {
        Produto obj1 = new Produto("123");
        obj1.setNome("A");
        obj1.setPreco(40);
        Produto obj2 = new Produto("653");
        obj2.setNome("B");
        obj2.setPreco(55);
        Produto obj3 = new Produto("345");
        obj3.setNome("C");
        obj3.setPreco(80);

        Pedidos pedido = new Pedidos();
        pedido.adicionarItem(obj1, 1);
        pedido.adicionarItem(obj2, 2);
        pedido.adicionarItem(obj3, 1);
        System.out.println("PRECO TOTAL " + pedido.totalPedido());
        
    }
}
