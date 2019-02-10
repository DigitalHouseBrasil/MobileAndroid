package aula5_java_com_objetos.Exercicio3;

class Prova {
    private int dificudade;
    private int energiaNecessaria;

    public int getDificudade() {
        return dificudade;
    }

    public void setDificudade(int dificudade) {
        this.dificudade = dificudade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta) {
        return atleta.getNivel() >= this.dificudade && atleta.getEnergia() > this.energiaNecessaria;
    }
}
