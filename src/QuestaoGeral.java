//Geovana Cardoso Silva – 25332
//Giovanna Moreira Fagundes de Oliveira – 25596
//Lana Caroline Molina – 25462
//Maria Eduarda Dorigan Gonçalves – 25683
//Vinícius de Luca Prado – 25793
public abstract class QuestaoGeral {
    protected Long id;
    protected String nome;

    public QuestaoGeral() {
        this.nome = "sem nome";
    }

    public QuestaoGeral(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "QuestaoGeral{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
    public abstract String mensagem();

}
