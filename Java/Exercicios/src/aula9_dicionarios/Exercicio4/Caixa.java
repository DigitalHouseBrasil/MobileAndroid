package aula9_dicionarios.Exercicio4;

public class Caixa extends Peca {

    public Caixa(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void retirada() {
        System.out.println("Caixa da marca '" + getMarca() + "' e modelo '" + getModelo() + "' foi devolvida ");
    }
}
