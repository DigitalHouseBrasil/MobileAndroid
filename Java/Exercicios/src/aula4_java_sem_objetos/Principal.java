package aula4_java_sem_objetos;

import java.util.ArrayList;

class Principal {

    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();

        exercicios.imprimindoValores();
        exercicios.menorQueOSegundo(1, 2);
        exercicios.imparMaiorQueDez(20);

        ArrayList<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(1);
        minhaLista.add(99);
        minhaLista.add(20);
        minhaLista.add(25);
        minhaLista.add(3);

        exercicios.totalArray(minhaLista);
        exercicios.totalParesArray(minhaLista);
        exercicios.apenasOsParesArray(minhaLista);

        /* TAREFAS */
        Tarefas tarefas = new Tarefas();
        tarefas.maiorDeTresNumeros(20, 2, 15);
        tarefas.cadeiasDeTextoDiferentes("Meu texto", "Meu segundo texto");
        tarefas.par(8);
        tarefas.cemPrimeiros();
        tarefas.algumMaior(1, 58, 4, 10);
    }
}
