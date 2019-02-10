package aula7_intefaces.Exercicio2;

class Aviao implements Voador {
    private int horasVoo;

    Aviao(int horasVoo) {
        this.horasVoo = horasVoo;
    }

    @Override
    public void voar() {
        this.horasVoo += 13;
        System.out.println("Estou voando como um avião");
    }
}
