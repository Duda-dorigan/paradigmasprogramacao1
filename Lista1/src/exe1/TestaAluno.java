package exe1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestaAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.numeroAluno = 1;
        obj1.nomeAluno = "Maria";
        obj1.idade = 23;
        obj1.p1 = 9;
        obj1.p2 = 10;
        obj1.notaFinal();
        obj1.dadosAlunos();
        obj1.passou();
    }

}