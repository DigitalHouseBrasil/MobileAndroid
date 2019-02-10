package aula9_dicionarios.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {

        //Criamos o guarda volume
        GuardaVolumes guardaVolumes = new GuardaVolumes();

        //Criamos as pecas
        Bolsa mochila = new Bolsa("Bolsa Barata", "não sei");
        Caixa caixaSapato = new Caixa("AllStart", "tenis");

        //Criamos a primeira lista de deças com 2 items
        List<Peca> pecas = new ArrayList<>();
        pecas.add(mochila);
        pecas.add(caixaSapato);

        //Criamos a segunda lista de deças com 1 item
        List<Peca> pecas2 = new ArrayList<>();
        pecas2.add(mochila);

        //Guardamos a primeira e segunda lista de peças
        int numero = guardaVolumes.guardarPecas(pecas);
        int numero2 = guardaVolumes.guardarPecas(pecas2);

        //Mostramos as peças do guarda volumes
        guardaVolumes.mostrarPecas();

        //devolvemos as peças do numero 1
        guardaVolumes.devolverPecas(numero);

        //Mostramos as peças do guarda volumes
        guardaVolumes.mostrarPecas();
    }
}
