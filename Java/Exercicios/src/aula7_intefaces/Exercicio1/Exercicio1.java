package aula7_intefaces.Exercicio1;

class Exercicio1 {
    public static void main(String[] args) {
        Contrato contrato = new Contrato("Contrato maroto", "cont");
        Documento documento = new Documento("Aluguel", "docx");
        Foto foto = new Foto("Jantar-em-familia", "JPEG");

        Impressora impressora = new Impressora();
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);
        impressora.adicionarImprimivel(foto);

        impressora.imprimirTudo();
    }
}
