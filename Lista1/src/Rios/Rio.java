package Rios;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public Rio(){
        this.nome = "Sem nome";
        this.nivel = 0;
        this.poluido = false;
    }
    public void chover(float elevacao){
        this.nivel += elevacao;
    }
    public void ensolarar(float queda){
        this.nivel -= queda;
    }
    public void limpar(){
        if(this.poluido == true) {
            this.poluido = false;
        }
    }
    public void sujar(){
        if(this.poluido == false) {
            this.poluido = true;
        }
    }
    public void mostra(){
        System.out.println("Nome: "+this.nome
        +" Nivel: "+this.nivel+ " Poluido: "+this.poluido);
    }
}
