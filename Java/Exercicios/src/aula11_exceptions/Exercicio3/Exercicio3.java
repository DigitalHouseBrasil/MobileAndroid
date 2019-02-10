package aula11_exceptions.Exercicio3;

class Exercicio3 {
    public static void main(String[] args) {

        CalculoMatematico calculoMatematico = new CalculoMatematico();

        calculoMatematico.divisao(4,0);

        // Descomente para a segunda parte do exercicio
        /*try {
            calculoMatematico.divisao(4,0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }*/
    }
}
