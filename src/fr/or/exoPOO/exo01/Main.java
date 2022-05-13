package fr.exo01;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle01 = new Rectangle();

        // Instancier l'objet rectancle02 de type Rectangle
        Rectangle rectangle02 = new Rectangle(10, 30);

        // Modifier la valeur de la largeur initialisée à 10
        rectangle02.largeur = 8;
        // Strocker le resultat de l'appel de la methode surface
        double surface = rectangle02.calculerSurface();

        // Afficher la surface
        System.out.println("La surface est de : " + surface);
    }
}
