import exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio n1 = new Rio();
        n1.mostra();
        n1.sujar();
        n1.ensolarar(0.5f);
        n1.mostra();

        Rio n2 = new Rio("Nilo",1.4f,true);
        n2.chover(100);
        n2.ensolarar(10);
        n2.limpar();
        n2.sujar();
        n2.mostra();
    }
}
