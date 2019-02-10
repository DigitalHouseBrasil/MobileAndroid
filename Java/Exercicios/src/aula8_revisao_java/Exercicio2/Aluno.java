package aula8_revisao_java.Exercicio2;

import java.util.Set;

class Aluno {
    private String nome;
    private String sobrenome;
    private String ra;

    public Aluno(String nome, String sobrenome, String ra) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void assistirAula(Set<Aula> aulas) {
        for (Aula aula : aulas) {
            System.out.println(this.nome + " : assistindo a aula: " + aula.getMateria().getNome());
        }
    }

    public void fazerLicaoDeCasa() {
        System.out.println(this.nome + " : fazendo lição de casa :)");
    }
}
