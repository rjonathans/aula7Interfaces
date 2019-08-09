package br.com.digitalhouse;

import java.sql.SQLOutput;

public class Cachorro extends Animal implements Saudavel {

    private String raca;
    private int idade;
    private String cor;

    public Cachorro(){}

    public Cachorro(String newRaca){
        super(newRaca);
    }

    @Override
    public boolean animalSaudavel(String diagnostico) {

        if (diagnostico != null || !diagnostico.equals("")) {
            System.out.println("Sem diagnóstico");
            return true;
        } else {
            System.out.println("O Cachorro está Saldável");
        }return false;
        /*
        System.out.println("O cachorro é:\n "+getRaca()+" está com o seguinte diagnótico: \n"+diagnostico);
        return false;*/
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("soma as idades");
        int resultado=getIdade()+novaIdade;
        return resultado;
    }

    @Override
    public void brincar() {
        System.out.println("O cachorro");

    }
}

