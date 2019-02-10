package aula9_dicionarios.Exercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> elementos = new ArrayList<>();
        elementos.add(1);
        elementos.add(5);
        elementos.add(5);
        elementos.add(6);
        elementos.add(7);
        elementos.add(8);
        elementos.add(8);
        elementos.add(8);
        System.out.println(elementos.toString());

        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);

        System.out.println(conjunto.toString());
    }
}
