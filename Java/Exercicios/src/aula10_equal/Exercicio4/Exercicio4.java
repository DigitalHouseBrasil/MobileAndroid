package aula10_equal.Exercicio4;

import java.util.ArrayList;
import java.util.List;

class Exercicio4 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João", 123));
        funcionarios.add(new Funcionario("Maria", 456));
        funcionarios.add(new Funcionario("Jose", 789));

        Funcionario pedro = new Funcionario("Pedro", 123);

        System.out.println("O funcionário " + pedro.getNome() + " está na lista de funcionarios? \n" + funcionarios.contains(pedro));
    }
}
