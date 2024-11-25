public class TelefoneCelular {
    private String marca;
    private String modelo;
    private String dataFabricacao;
    private float valor;
    private String sistemOperacional;

    public TelefoneCelular(String marca, String modelo, String dataFabricacao, float valor, String sistemOperacional) {
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabricacao = dataFabricacao;
        this.valor = valor;
        this.sistemOperacional = sistemOperacional;
        status();
        System.out.println("");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getSistemOperacional() {
        return sistemOperacional;
    }

    public void setSistemOperacional(String sistemOperacional) {
        this.sistemOperacional = sistemOperacional;
    }

    public void status () {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Data Fabricação: " + this.getDataFabricacao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Sistema Operacional: " + this.getSistemOperacional());




    }
}
