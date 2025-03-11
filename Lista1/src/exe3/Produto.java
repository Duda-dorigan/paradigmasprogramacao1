package exe3;

public class Produto {
    public int id, quantidade;
    public String descricao;
    public float preco;

    public  Produto(int id, String descricao, int quantidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public  Produto() {
        this.descricao = "Sem descricao";
    }

    public void comprar(int quant){
        this.quantidade+=quant;
    }
    public void vender(int venda){
        if (this.quantidade>=venda) {
            this.quantidade -= venda;
        }
        else{
            System.out.println("Estoque  insuficiente");
        }
    }
    public void subir(float valor){
        this.preco+=valor;
    }
    public void descer(float valor){
        if(this.preco>=valor) {
            this.preco -= valor;
        }
        else{
            System.out.println("Preço não pode ser negativo");
        }
    }
    public void mostra(){
        System.out.println("ID: "+this.id
                + " Descricao: "+this.descricao
                +" Quantidade: "+this.quantidade
                +" Preco: "+this.preco);
    }
}
