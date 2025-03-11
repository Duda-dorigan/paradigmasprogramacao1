package exe1;

public class Aluno {
    public int numeroAluno, idade;
    public  String nomeAluno;
    public float p1, p2, media;

    public Aluno(){//sem parametros
        this.nomeAluno = "sem nome";
    }
    public Aluno (int numeroAluno, String nomeAluno, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        // this representa o objeto que chama o metodo
    }
    public float notaFinal(){
        return (this.p1+this.p2)/2;
    }

    public String passou(){
        return (this.notaFinal()>=6) ? "Passou" : "Não passou"; // Operador ternario
    }
    public void dadosAlunos() {//Quando utilizar System utilizar void
        System.out.println("Numero do Aluno: " + this.numeroAluno +
                " Nome do Aluno: " + this.nomeAluno +
                " Situação: " + this.passou());

    }

}

