public class Convidado {
    private String nome;
    private String dataNasc;
    private String comidaFavorita;
    private String bebidaFavorita;
    private float valorContribuicao;

    public Convidado(String nome, String dataNasc, String comidaFavorita, String bebidaFavorita, float valorContribuicao) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.comidaFavorita = comidaFavorita;
        this.bebidaFavorita = bebidaFavorita;
        this.valorContribuicao = valorContribuicao;
        pessoa();
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public String getBebidaFavorita() {
        return bebidaFavorita;
    }

    public void setBebidaFavorita(String bebidaFavorita) {
        this.bebidaFavorita = bebidaFavorita;
    }

    public float getValorContribuicao() {
        return valorContribuicao;
    }

    public void setValorContribuicao(float valorContribuicao) {
        this.valorContribuicao = valorContribuicao;
    }

    public void pessoa() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getDataNasc());
        System.out.println("Comida Favorita: " + this.getComidaFavorita());
        System.out.println("Bebida Favorita: " + this.getBebidaFavorita());
        System.out.println("Valor Contribuição: " + this.getValorContribuicao());
    }
}
