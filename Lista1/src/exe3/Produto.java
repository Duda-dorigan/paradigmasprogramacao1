package exe3;

public class Produto {
    public int id;
    public String descricao;
    public int quantidade;
    public float preco;

    public  Produto(int id, String descricao, int quantidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public  Produto() {
        this.id = 0;
        this.descricao = "Sem descricao";
        this.quantidade = 0;
        this.preco = 0;
    }

    public void comprar(int quant){
        this.quantidade+=quant;
    }
    public void vender(int venda){
        this.quantidade-=venda;
    }
    public void subir(float valor){
        this.preco+=valor;
    }
    public void descer(float valor){
        this.preco-=valor;
    }
    public void mostra(){
        System.out.println("ID: "+this.id
                + " Descricao: "+this.descricao
                +" Quantidade: "+this.quantidade
                +" Preco: "+this.preco);
    }
}
