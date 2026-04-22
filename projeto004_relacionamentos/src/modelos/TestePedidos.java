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

        Cliente cli1 = new Cliente("1234", "Astrogildo");
        Cliente cli2 = new Cliente("5678", "Filisbina");
        Cliente cli3 = new Cliente("8889", "Kerrynston");

        Pedidos pedido = new Pedidos(cli1);
        pedido.adicionarItem(obj1, 1);
        pedido.adicionarItem(obj2, 2);
        pedido.adicionarItem(obj3, 1);
        System.out.println("PRECO TOTAL " + pedido.totalPedido());

        Pedidos novoPedidoTemp = new Pedidos(cli2);
        novoPedidoTemp.adicionarItem(obj1, 4);
        System.out.println("TOTAL NOVO PEDIDO TEMP " + novoPedidoTemp.totalPedido() );
        obj1.setPreco(60);
        System.out.println("TOTAL NOVO PEDIDO TEMP APOS " + novoPedidoTemp.totalPedido() );
        // System.out.println("PRECO TOTAL " + pedido.totalPedido());

        Pedidos novoPedido = new Pedidos(cli3);
        novoPedido.adicionarItem(obj1, 4);
        System.out.println("TOTAL NOVO PEDIDO " + novoPedido.totalPedido() );

        System.out.println("Pedido 1");
        Cliente c = novoPedido.getCliente();
        System.out.println("Cliente: " + c.getId() + " " + c.getNome());
        System.out.println("Total do pedido: R$ " + novoPedido.totalPedido());
        
    }
}
