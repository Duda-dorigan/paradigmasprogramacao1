package exe0;

import javax.swing.*;

public class Carro {
    //variaveis
    //do tipo primitivo
    public int ano;
    public float velocidade;
    //do tipo classe
    public String marca, modelo;

    //métodos construtores
    public Carro(){//sem parametros
        this.marca = "Marca invalida";
        this.modelo = "Modelo invalido";
    }
    public Carro (int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //métodos
    public void exibirDetalhes(){
        //this representa o objeto que chama o metodo
        JOptionPane.showMessageDialog(null,"Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Ano: " + this.ano +
                " Velocidade: " + this.velocidade);
    }
    //vai acelerar o carro de x unidades
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }
    public void frear(float x){
        if(this.velocidade - x >=0) {
            this.velocidade -= x;
        }
        else{
            System.out.println("Não é possível frear");
        }
    }
}
