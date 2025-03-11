import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        System.out.println("Media do aluno " + obj1.nomeAluno + " é " + obj1.notaFinal());
        Aluno obj2 = new Aluno(1,"Maria",23,9,10);
        System.out.println("Media do aluno " + obj2.nomeAluno + " é " + obj2.notaFinal());
        obj1.dadosAlunos();
        obj2.dadosAlunos();
    }

}