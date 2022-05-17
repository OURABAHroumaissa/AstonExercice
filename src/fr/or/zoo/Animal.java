package fr.or.zoo;

public abstract class Animal implements IAnimal{
    public static int compteur;

    @Override
    public void manger() {
        System.out.println("Je mange");
    }
    public void dormir() {
        System.out.println("Je dors");
    }
}
