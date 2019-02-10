package aula7_intefaces.Exercicio2;

import java.util.ArrayList;
import java.util.List;

class TorreDeControle {
    List<Voador> voadores = new ArrayList<>();

    public void voemTodos() {
        for (Voador voador : voadores) {
            voador.voar();
        }
    }

    public void adicionarVoador(Voador voador) {
        this.voadores.add(voador);
    }
}
