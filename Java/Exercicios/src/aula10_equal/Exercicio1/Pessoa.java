package aula10_equal.Exercicio1;

class Pessoa {
    private String nome;
    private int rg;

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    // Descomente para  segunda parte do exercicio
    /*@Override
    public boolean equals(Object outraPessoa) {
        if (this == outraPessoa) {
            return true;
        }

        if (!(outraPessoa instanceof Pessoa)) {
            return false;
        }

        return this.rg == ((Pessoa) outraPessoa).getRg();
    }*/
}
