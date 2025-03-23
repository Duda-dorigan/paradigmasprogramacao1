import exe2.Aluno;
public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(256830, "Lucas", 20,9,8);
        obj1.notaFinal();
        System.out.println(obj1.dadosAluno());
        //obj1.nome();  Se eu chamar o variáveis sem os métodos o programa bloqueia o acesso ao valor
    }
}
