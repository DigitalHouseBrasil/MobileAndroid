package aula10_equal.Exercicio3;

class Aluno {
    private String nome;
    private int numeroAluno;

    public Aluno(String nome, int numroAluno) {
        this.nome = nome;
        this.numeroAluno = numroAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    // Descomente para  segunda parte do exercicio
    /*@Override
    public boolean equals(Object outroAluno) {
        if (this == outroAluno) {
            return true;
        }

        if (!(outroAluno instanceof Aluno)) {
            return false;
        }

        return this.numeroAluno == ((Aluno) outroAluno).getNumeroAluno();
    }*/
}
