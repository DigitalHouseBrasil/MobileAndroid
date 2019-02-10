package aula8_revisao_java.Exercicio1;

import java.util.HashSet;
import java.util.Set;

class IntegerSet {
    private Set<Integer> conjunto = new HashSet<>();

    public Set<Integer> uniao(Set<Integer> outroConjunto) {
        System.out.println("União dos conjuntos Conjunto");
        this.conjunto.addAll(outroConjunto);
        return this.conjunto;
    }

    public Set<Integer> interseccao(Set<Integer> outroConjunto) {
        System.out.println("intersecção dos conjuntos Conjunto");
        Set<Integer> iguais = new HashSet<>();

        for (Integer item : outroConjunto) {

            if (this.conjunto.contains(item)) {
                iguais.add(item);
            }
        }
        return iguais;
    }

    public Set<Integer> diferenca(Set<Integer> outroConjunto) {
        System.out.println("Diferença dos conjuntos Conjunto");
        Set<Integer> diferentes = new HashSet<>();

        for (Integer item : outroConjunto) {

            if (!this.conjunto.contains(item)) {
                diferentes.add(item);
            }
        }
        return diferentes;
    }

    public void addItem(Integer item) {
        if (this.conjunto.size() < 50) {
            this.conjunto.add(item);
        } else {
            System.out.println("Conjunto já esta completo");
        }
    }

    public void removetem(Integer item) {
        this.conjunto.remove(item);
        System.out.println(item + ": Removido do conjunto");
    }

    @Override
    public String toString() {
        return this.conjunto.toString();
    }
}
