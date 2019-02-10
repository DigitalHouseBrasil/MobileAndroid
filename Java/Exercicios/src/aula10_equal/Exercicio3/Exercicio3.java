package aula10_equal.Exercicio3;

import java.util.ArrayList;
import java.util.List;

class Exercicio3 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João", 123));
        alunos.add(new Aluno("Maria", 456));
        alunos.add(new Aluno("Jose", 789));

        Aluno pedro = new Aluno("Pedro", 123);

        System.out.println("O aluno " + pedro.getNome() + " está na lista de alunos? \n" + alunos.contains(pedro));

    }
}
