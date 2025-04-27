package exe4;

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
    }
    public void chover(float elevacao){
        this.nivel += elevacao;
    }
    public void ensolarar(float queda){
        if (this.nivel >= queda) {
            this.nivel -= queda;
        }
        else{
            System.out.println("Nivel do rio não foi alterado");
        }
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public void mostra(){
        System.out.println("Nome: "+this.nome
        +" Nivel: "+this.nivel+ " Poluido: "+(this.poluido?"true":"false"));
    }

}
