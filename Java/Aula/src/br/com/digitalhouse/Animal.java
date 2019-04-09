package br.com.digitalhouse;

public abstract class Animal {

    private String tamanho;
    private String raca;

    public Animal(){

    }

    public Animal(String novoTamanho, String novaRaca){
        tamanho = novoTamanho;
        raca = novaRaca;
    }

    public void setTamanho(String novoTamanho){
        tamanho = novoTamanho;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setRaca(String novaRaca){
        raca = novaRaca;
    }

    public String getRaca(){
        return raca;
    }

    public abstract boolean ehMamifero();
}
