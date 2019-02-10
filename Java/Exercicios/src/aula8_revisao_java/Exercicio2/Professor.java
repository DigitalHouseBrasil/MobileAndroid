package aula8_revisao_java.Exercicio2;

class Professor implements Docente{
    private String nome;
    private String rd;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    @Override
    public void darAula() {
        System.out.println("Professor está dando aula :)");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Professor está fazendo a chamda dos alunos :)");
    }
}
