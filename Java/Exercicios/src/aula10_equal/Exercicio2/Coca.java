package aula10_equal.Exercicio2;

class Coca {
    private int tamanho;
    private double preco;

    public Coca(int tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Descomente para  segunda parte do exercicio
    /*@Override
    public boolean equals(Object outraCoca) {
        if (this == outraCoca) {
            return true;
        }

        if (!(outraCoca instanceof Coca)) {
            return false;
        }

        return this.tamanho == ((Coca) outraCoca).getTamanho();
    }*/
}
