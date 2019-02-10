package aula11_exceptions.Exercicio3;

class CalculoMatematico {

    public int divisao(int numero, int divisor) throws ArithmeticException {

        // Primeira parte do exercicio
        try {
            return numero / divisor;
        }catch (ArithmeticException e){
            System.out.println("Operação não pode ser realizada :(");
            e.printStackTrace();
            return 0;
        }

        // Descomente Segunda parte do exercicio
       /* if (divisor == 0) {
            throw new ArithmeticException("Divisor não pode ser zero");
        }

        return numero / divisor;*/
    }
}
