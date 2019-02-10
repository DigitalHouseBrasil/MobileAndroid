package aula5_java_com_objetos.Exercicio4;

class Exercicio4 {
    public static void main(String[] args) {
        Tripe tripe = new Tripe();
        tripe.setAlturaAtual(0);
        tripe.setAlturaMaxima(10);
        tripe.setAlturaMimima(4);

        tripe.desdobrar();
        tripe.usar();
        tripe.dobrar();
    }
}
