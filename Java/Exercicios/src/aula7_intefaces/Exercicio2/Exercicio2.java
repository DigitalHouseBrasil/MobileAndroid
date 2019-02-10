package aula7_intefaces.Exercicio2;

class Exercicio2 {
    public static void main(String[] args) {
        Pato pato = new Pato(15);
        SuperHomem superHomem = new SuperHomem(25);
        Aviao aviao = new Aviao(45);

        TorreDeControle torreDeControle = new TorreDeControle();
        torreDeControle.adicionarVoador(pato);
        torreDeControle.adicionarVoador(superHomem);
        torreDeControle.adicionarVoador(aviao);

        torreDeControle.voemTodos();
    }
}
