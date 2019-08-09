package br.com.digitalhouse;

public abstract class Animal implements Brincavel{

    private String raca;
    private int idade;
    private String cor;

    public Animal() {
    }

    public Animal(String newRaca, int newIade, String newCor) {
        raca = newRaca;
        idade = newIade;
        cor = newCor;
    }

    public Animal(String newRaca) {
        raca=newRaca;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;

    }

    public void setRaca(String newRaca) {
        raca = newRaca;
    }

    public void setIdade(int newIdade) {
        idade = newIdade;
    }

    public void setCor(String newCor) {
        cor = newCor;
    }
}