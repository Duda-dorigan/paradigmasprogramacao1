package Produtos;

public class TestaProduto {
    public static void main(String[] args) {
        Produto n1 = new  Produto();
        n1.comprar(4);
        n1.vender(2);
        n1.subir(2);
        n1.descer(1);
        n1.mostra();

        Produto n2 = new  Produto();
        n2.id = 1;
        n2.descricao = "Caneta";
        n2.quantidade = 10;
        n2.preco = 2;
        n2.comprar(2);
        n2.vender(7);
        n2.subir(2);
        n2.descer(1);
        n2.mostra();
    }
}
