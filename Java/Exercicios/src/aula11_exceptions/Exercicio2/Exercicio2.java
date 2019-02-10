package aula11_exceptions.Exercicio2;

import java.util.ArrayList;

class Exercicio2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> lista = null;
            lista.add("Pato");
            lista.add("Cachorro");
            lista.add("Gato");

            System.out.println(lista.get(5));

        }catch (NullPointerException e){
            System.out.println("A lista não pode ser nula :(");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
