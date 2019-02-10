package aula9_dicionarios.Exercicio3;

import java.util.Set;

class Prova {
    public void somaTotal(Set<Integer> valores) {
        double total = 0;
        for (Integer valor : valores) {
            total += valor;
        }

        System.out.println("Valor total: " + total);
    }
}
