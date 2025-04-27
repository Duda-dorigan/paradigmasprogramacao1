import exe0.Carro;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro obj1 = new Carro();
        obj1.setMarca("Fiat");//setter e getter são publicos
        obj1.setModelo("Palio");
        obj1.setAno(2018);
        obj1.setVelocidade(150);
        System.out.println("Modelo " + obj1.getModelo() +
                ", Marca " + obj1.getMarca());
        Carro obj2 = new Carro("Chevrolet","Corsa",-2006,60);
        System.out.println("Ano " + obj2.getAno() +
                ", Velocidade " + obj2.getVelocidade());
        obj2.acelerar(80);
        obj2.frear(30);
        System.out.println(obj2.exibiDetalhes());
    }

}