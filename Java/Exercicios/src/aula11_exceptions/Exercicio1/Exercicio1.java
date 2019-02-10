package aula11_exceptions.Exercicio1;

import java.util.ArrayList;

class Exercicio1 {
    public static void main(String[] args) {
        try {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("Pato");
            lista.add("Cachorro");
            lista.add("Gato");

            System.out.println(lista.get(3));
        }catch (Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
