//Geovana Cardoso Silva – 25332
//Giovanna Moreira Fagundes de Oliveira – 25596
//Lana Caroline Molina – 25462
//Maria Eduarda Dorigan Gonçalves – 25683
//Vinícius de Luca Prado – 25793

public class QuestaoBooleana extends QuestaoGeral{
    private boolean marcado;

    public QuestaoBooleana() {
        super(); // chama construtor da superclasse
    }

    public QuestaoBooleana(Long id, String nome, boolean marcado) {
        super(id, nome);
        this.marcado = marcado;
    }

    public boolean getMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    @Override // anulação do método do pai
    public String toString() {
        return "\n QuestaoBooleana{" +
                super.toString() +
                ", marcado =" + marcado +
                '}';
    }
    public String mensagem(){
        return "Booleana";
    }
}