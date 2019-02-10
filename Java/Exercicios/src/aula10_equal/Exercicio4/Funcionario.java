package aula10_equal.Exercicio4;

class Funcionario {
    private String nome;
    private int numeroregistro;

    public Funcionario(String nome, int numeroregistro) {
        this.nome = nome;
        this.numeroregistro = numeroregistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroregistro() {
        return numeroregistro;
    }

    public void setNumeroregistro(int numeroregistro) {
        this.numeroregistro = numeroregistro;
    }

    // Descomente para  segunda parte do exercicio
    /*@Override
    public boolean equals(Object outroFuncionario) {
        if (this == outroFuncionario) {
            return true;
        }

        if (!(outroFuncionario instanceof Funcionario)) {
            return false;
        }

        return this.numeroregistro == ((Funcionario) outroFuncionario).getNumeroregistro();
    }*/
}
