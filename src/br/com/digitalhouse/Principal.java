package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Poodle");


        boolean retornoMetodo = cachorro.animalSaudavel("doente");

        System.out.println(retornoMetodo);


        cachorro.setIdade(10);
        int idadeAnimal = cachorro.calculoIdadeAnimal(90);

        System.out.println(idadeAnimal);

    }
}
