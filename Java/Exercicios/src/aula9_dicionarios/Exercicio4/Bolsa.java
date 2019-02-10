package aula9_dicionarios.Exercicio4;

public class Bolsa extends Peca {

    public Bolsa(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void retirada() {
        System.out.println("Bolsa da marca '" + getMarca() + "' e modelo '" + getModelo() + "' foi devolvida ");
    }
}
