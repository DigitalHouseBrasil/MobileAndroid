package aula8_revisao_java.Exercicio3;

class Exercicio3 {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        fatura.getItems().add(new Item(1, "Celular", 1, 1560.0));
        fatura.getItems().add(new Item(2, "Placa de video Gforce 1080", 1, 3600.0));
        fatura.getItems().add(new Item(2, "Mémoria RAM 16GB", 2, 630.0));

        System.out.println("\n\nTotal da fatura: " + fatura.getTotalFatura());
    }
}
