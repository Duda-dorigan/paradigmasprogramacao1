package exe1;

public class Aluno {
    public int numeroAluno;
    public  String nomeAluno;
    public  int idade;
    public float p1, p2;
    public float media;

    public Aluno(){//sem parametros
        this.p1 = -1;
        this.p2 = -1;
    }
    public Aluno (int numeroAluno, String nomeAluno, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void notaFinal(){
        this.media = (this.p1+this.p2)/2;
        System.out.println("Média: "+ this.media);
    }
    public void dadosAlunos() {
        System.out.println("Numero do Alunos.Aluno: " + this.numeroAluno +
                " Nome do Alunos.Aluno: " + this.nomeAluno +
                " Idade: " + this.idade);

    }
    public void passou(){
        if(this.media>=6){
            System.out.println("Passou");
        }
        else{
            System.out.println("Não Passou");
        }
    }


}

