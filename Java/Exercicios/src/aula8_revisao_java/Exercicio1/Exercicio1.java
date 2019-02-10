package aula8_revisao_java.Exercicio1;

import java.util.HashSet;
import java.util.Set;

class Exercicio1 {
    public static void main(String[] args) {
        IntegerSet integerSet = new IntegerSet();
        for (int i = 0; i < 50; i++) {
            integerSet.addItem(i);
        }

        Set<Integer> outroConjunto = new HashSet<>();
        outroConjunto.add(1);
        outroConjunto.add(3);
        outroConjunto.add(5);

        System.out.println(integerSet.uniao(outroConjunto));
        System.out.println(integerSet.diferenca(outroConjunto));
        System.out.println(integerSet.interseccao(outroConjunto));
        integerSet.addItem(20);
        integerSet.removetem(20);
        System.out.println(integerSet.toString());
    }
}
