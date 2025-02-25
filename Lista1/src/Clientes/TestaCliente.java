package Clientes;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente num1 = new Cliente();
        num1.numeroConta = 25683;
        num1.numeroAgencia = 31;
        num1.nome = "Pedro";
        num1.saldo = 500;
        num1.realizarDeposito(200);
        num1.realizarSaque(100);
        num1.dadosCliente();

        Cliente num2 = new Cliente();
        num2.numeroConta = 25684;
        num2.numeroAgencia = 31;
        num2.nome = "João";
        num2.saldo = 300;
        num2.realizarDeposito(400);
        num2.realizarSaque(100);
        num2.dadosCliente();

    }
}


