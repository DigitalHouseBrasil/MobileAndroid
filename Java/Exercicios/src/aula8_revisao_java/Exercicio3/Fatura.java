package aula8_revisao_java.Exercicio3;

import java.util.ArrayList;
import java.util.List;

class Fatura {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalFatura() {

        System.out.println("Calculando valor de Fatura...");

        double total = 0;

        for (Item item : items) {
            double valor = item.getQuantidade() * item.getPreco();
            System.out.println(item.getDescricao() + ": " + item.getQuantidade() + " x " + item.getPreco() + " = " + valor);
            total += valor;
        }

        return total;
    }
}
