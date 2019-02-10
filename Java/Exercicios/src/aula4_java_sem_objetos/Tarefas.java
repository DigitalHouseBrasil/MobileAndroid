package aula4_java_sem_objetos;

class Tarefas {
    public void maiorDeTresNumeros(int primeiro, int segundo, int terceiro) {

        System.out.println("____________ Maior de três inteiros :) ______________");
        if (primeiro > segundo && primeiro > terceiro) {

            System.out.println(primeiro);

        } else if (segundo > primeiro && segundo > terceiro) {
            System.out.println(segundo);

        } else {
            System.out.println(terceiro);
        }
    }

    public boolean cadeiasDeTextoDiferentes(String texto1, String texto2) {
        System.out.println("____________ Um é igual ao outro ? ______________");
        return !texto1.equals(texto2);
    }

    public boolean par(int numero) {
        System.out.println("____________ È par ? ______________");
        return numero % 2 == 0;
    }

    public void cemPrimeiros() {
        System.out.println("____________ Mostrando os 100 primeiros impares ______________");
        int contador = 1;

        for (int i = 0; i < 200; i++) {
            if (i % 2 != 0 && contador <= 100) {
                System.out.println("Contando: " + contador + ": o número impar é" + i);
                contador++;
            }
        }
    }

    public boolean algumMaior(int numA, int numB, int numC, int numD) {
        System.out.println("____________ Tem algum maior ? ______________");
        return numA > numC && numA > numD || numB > numC && numB > numD;
    }
}
