package aula7_intefaces.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
    List<Imprimivel> imprimiveis = new ArrayList<>();

    public void adicionarImprimivel(Imprimivel imprimivel) {
        imprimiveis.add(imprimivel);
    }

    public void imprimirTudo() {
        for (Imprimivel imprimivel : imprimiveis) {
            imprimivel.imprimir();
        }
    }
}
