package aula9_dicionarios.Exercicio3;

import java.util.HashSet;
import java.util.Set;

class Exercicio3 {
    public static void main(String[] args) {
        Set<Integer> elementos = new HashSet<>();
        elementos.add(1);
        elementos.add(5);
        elementos.add(6);
        elementos.add(7);

        Prova prova = new Prova();
        prova.somaTotal(elementos);

    }
}
