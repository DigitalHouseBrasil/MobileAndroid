package aula8_revisao_java.Exercicio4;

class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    void mudarNome(String nome) {
        System.out.println("Antigo nome: " + this.nome);
        System.out.println("Novo nome: " + nome);
        this.nome = nome;
    }

    void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    void repor(int qtd) {
        this.qtdAtual += qtd;
    }

    void darBaixa(int qtd) {
        this.qtdAtual -= qtd;
    }

    String mostra() {
        return "Produto: " + this.nome +
                "\nQuantidade atual: " + this.qtdAtual +
                "\nQuantidade minima: " + this.qtdMinima;
    }

    boolean precisaRepor() {
        return this.qtdAtual <= this.qtdMinima;
    }

}
