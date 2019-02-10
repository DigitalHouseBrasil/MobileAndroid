package aula10_equal.Exercicio2;

class Exercicio2 {
    public static void main(String[] args) {
        Coca lata = new Coca(350, 5.5);
        Coca latinha = new Coca(350, 12.5);

        System.out.println("As duas coca-colas são iguais? \n" + lata.equals(latinha));

    }
}
