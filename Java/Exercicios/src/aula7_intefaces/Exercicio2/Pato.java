package aula7_intefaces.Exercicio2;

class Pato implements Voador{
    private int energia;

    Pato(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        this.energia -= 5;
        System.out.println("Estou voando como um pato");
    }
}
