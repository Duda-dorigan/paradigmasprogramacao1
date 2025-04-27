//Geovana Cardoso Silva – 25332
//Giovanna Moreira Fagundes de Oliveira – 25596
//Lana Caroline Molina – 25462
//Maria Eduarda Dorigan Gonçalves – 25683
//Vinícius de Luca Prado – 25793
public class QuestaoNumerica extends QuestaoGeral {

    private int numero;

    public QuestaoNumerica(Long id, String nome, int numero) {
        super(id,nome);
        this.numero = numero;
    }
    public QuestaoNumerica() {
        super();//chama o construtor do superclasse
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override // anulação de método da superclasse
    public String toString() {
        return "\n QuestaoNumerica" +
                super.toString() +
                ", Número = " + numero +
                '}';
    }
    public String mensagem(){
        return "Numérica";
    }
}
