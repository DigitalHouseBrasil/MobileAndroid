package aula9_dicionarios.Exercicio4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
    private Map<Integer, List<Peca>> dicionarioPecas = new HashMap<>();
    private int contador;


    public Integer guardarPecas(List<Peca> pecas) {
        contador++;

        dicionarioPecas.put(contador, pecas);

        for (Peca peca : pecas) {
            System.out.println("Peça guardada! Marca: " + peca.getMarca() + ", Modelo: " + peca.getModelo());
        }

        return contador;
    }

    public void mostrarPecas() {
        for (Integer numero : dicionarioPecas.keySet()) {
            List<Peca> pecas = dicionarioPecas.get(numero);

            System.out.println("\nNo guarda volumes do numero " + numero + " possui todas essas peças:");

            for (Peca peca : pecas) {
                System.out.println("Marca: " + peca.getMarca() + ", Modelo: " + peca.getModelo());
            }
        }
    }

    public void mostrarPecas(Integer numero) {
        List<Peca> pecas = dicionarioPecas.get(numero);

        System.out.println("\nNo guarda volumes do numero " + numero + " possui todas essas peças: \n");

        for (Peca peca : pecas) {
            System.out.println("Marca: " + peca.getMarca() + ", Modelo: " + peca.getModelo());
        }
    }

    public List<Peca> devolverPecas(Integer numero) {
        List<Peca> pecas = dicionarioPecas.get(numero);
        for (Peca peca : pecas) {
            peca.retirada();
        }
        dicionarioPecas.remove(numero);
        return pecas;
    }
}
