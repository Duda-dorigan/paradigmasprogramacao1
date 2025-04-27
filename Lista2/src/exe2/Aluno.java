package exe2;
public class Aluno {
    private int nroAluno;
    private String nome;
    private int idade;
    private float p1,p2;

    public Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    public Aluno() {
        this.nome = "Sem nome";
    }
    public int getNroAluno() {
        return nroAluno;
    }
    public void setNroAluno(int nroAluno) {
        //metodo de classe
        String auxiliar = String.valueOf(nroAluno);
        if(auxiliar.length() == 6) {
            this.nroAluno = nroAluno;
        }
        else System.out.println("Problema no tamanho");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        String auxiliar = String.valueOf(nome);
        if(auxiliar.length() <= 30) {
            this.nome = nome;
        }
        else System.out.println("Problema no tamanho");
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
        else System.out.println("Idade deve ser positiva");
    }
    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if(p1 >= 0) {
            this.p1 = p1;
        }
        else System.out.println("P1 deve ser positiva");
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 >= 0) {
            this.p2 = p2;
        }
        else System.out.println("P2 deve ser positiva");
    }
    public void notaFinal(){
        float media = (this.p1 + this.p2)/2;
        System.out.println("Nota final: " + media);
    }

    public String dadosAluno() {
        return "Aluno: " +
                "Numero=" + nroAluno +
                ", nome='" + nome + '\'' +
                ", idade=" + idade;
    }
}
