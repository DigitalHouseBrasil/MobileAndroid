package aula5_java_com_objetos.Exercicio1;

class Exercicio1 {

    public static void main(String[] args) {
        Cliente tairo = new Cliente();
        tairo.setNome("Tairo");
        tairo.setSobrenome("Roberto");
        Conta contaTairo = new Conta();
        contaTairo.setSaldo(100);
        contaTairo.setTitular(tairo);

        Cliente tadashi = new Cliente();
        tadashi.setNome("Fabio");
        tadashi.setSobrenome("Tadashi");
        Conta contaTadashi = new Conta();
        contaTadashi.setSaldo(150);
        contaTadashi.setTitular(tadashi);

        contaTairo.deposito(1200);
        contaTadashi.saque(200);
    }
}
