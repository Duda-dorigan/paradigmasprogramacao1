package exe1;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    public Cliente() {
        this.nome = "sem nome";
        this.nroConta = "111111-1";
        this.nroAgencia = "1111-1";
    }

    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setNroConta(String nroConta) {
        //metodo de instancia
        if(nroConta.length() == 8){
            if(nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else System.out.println("Problema no DV");
            this.nroConta = "111111-1";

        }
        else System.out.println("Problema no tamanho");
        this.nroConta = "111111-1";


    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public void setNroAgencia(String nroAgendia) {
        if(nroAgendia.length() == 6){
            if(nroAgendia.charAt(4) == '-'){
                this.nroAgencia = nroAgendia;
            }
            else System.out.println("Problema no DV");
            this.nroAgencia = "1111-1";
        }
        else  System.out.println("Problema no tamanho");
        this.nroAgencia = "1111-1";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length()<=30){
            this.nome = nome;
        }
        else System.out.println("Número de caracteres excedido");

    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo>=0) {
            this.saldo = saldo;
        }
        else System.out.println("Saldo insuficiente");
    }
    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }
    public void sacar(float valor){
        this.setSaldo(this.saldo - valor);
    }

    public String exibeCliente() {
        return "Cliente{" +
                "nroConta='" + nroConta + '\'' +
                ", nroAgencia='" + nroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
