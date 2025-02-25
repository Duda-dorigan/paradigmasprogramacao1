package Rios;

public class TestaRio {
    public static void main(String[] args) {
        Rio n1 = new Rio();
        n1.chover(100);
        n1.ensolarar(10);
        n1.limpar();
        n1.sujar();
        n1.mostra();

        Rio n2 = new Rio();
        n2.nome = "Nilo";
        n2.nivel = 250;
        n2.poluido = true;
        n2.chover(100);
        n2.ensolarar(10);
        n2.limpar();
        n2.sujar();
        n2.mostra();
    }
}
