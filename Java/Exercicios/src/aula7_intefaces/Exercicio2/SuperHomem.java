package aula7_intefaces.Exercicio2;

class SuperHomem implements Voador {
    private int experiencia;

    SuperHomem(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        this.experiencia += 3;
        System.out.println("Estou voando como um campeão");
    }
}
