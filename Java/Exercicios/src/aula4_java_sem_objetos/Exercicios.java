package aula4_java_sem_objetos;

import java.util.ArrayList;

class Exercicios {
    public void imprimindoValores() {
        Integer umNumeroA = 1;
        Double umNumeroB = 2.5;
        String umaCadeiaDeTexto = "Meu texto bonitão";

        System.out.println("____________ Mostrando as variáveis__________________");
        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("____________ Calculando A e B _______________________");
        System.out.println(umNumeroA + umNumeroB);
        System.out.println(umNumeroA - umNumeroB);
    }

    public boolean menorQueOSegundo(int primeiro, int segundo) {
        System.out.println("____________ Primeiro número é menor que segundo ? ______________");
        return primeiro < segundo;
    }

    public boolean imparMaiorQueDez(int numero) {
        System.out.println("____________ Impar maior que 10 ? ______________");
        return numero % 2 > 0 && numero > 10;
    }

    public int totalArray(ArrayList<Integer> lista) {
        System.out.println("____________ Total dos elementos da lista :) ______________");
        int resultado = 0;

        for (int contador : lista) {
            resultado = resultado + contador;
        }
        return resultado;
    }

    public int totalParesArray(ArrayList<Integer>lista){
        System.out.println("____________ Total da soma dos elementos pares da lista :) ______________");
        int resultado = 0;
        for(int contador: lista){
            if(contador % 2 == 0){
                resultado = resultado + contador;
            }
        }
        return resultado;
    }

    public ArrayList<Integer> apenasOsParesArray(ArrayList<Integer> lista) {
        System.out.println("____________ Todos os elementos pares da lista :) ______________");
        ArrayList<Integer> resultado = new ArrayList();

        for (Integer item : lista) {
            if (item % 2 == 0) {
                resultado.add(item);
            }
        }

        for (Integer item : resultado) {
            System.out.println(item);
        }

        return resultado;
    }

}
