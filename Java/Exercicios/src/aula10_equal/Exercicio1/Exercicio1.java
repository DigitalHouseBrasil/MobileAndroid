package aula10_equal.Exercicio1;

class Exercicio1 {
    public static void main(String[] args) {
        Pessoa tairo = new Pessoa("Tairo", 123456);
        Pessoa jessica = new Pessoa("Jessica", 123456);

        System.out.println("Pessoas são iguais? \n" + tairo.equals(jessica));
    }
}
