package aula8_revisao_java.Exercicio4;

class Exercicio4 {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Algodão", 10, 2);

        estoque.darBaixa(5);
        estoque.mudarNome("Algodão Verde");
        estoque.mudarQtdMinima(3);
        System.out.println("precisa repor o estoque? " + estoque.precisaRepor());

        System.out.println(estoque.mostra());
    }
}
