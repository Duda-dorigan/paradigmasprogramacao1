package Clientes;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente() {
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "Sem descricao";
        this.saldo = 0;
    }

    public void realizarDeposito(float deposito){
        this.saldo+=deposito;
    }

    public void realizarSaque(float saque){
        this.saldo-=saque;
    }

    public void dadosCliente(){
        System.out.println("Numero da conta: " + this.numeroConta
                + " Nome: "+this.nome + " Saldo: "+this.saldo);
    }
}
