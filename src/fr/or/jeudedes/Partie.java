package fr.or.jeudedes;

import java.util.ArrayList;
import java.util.List;

public class Partie{
    private List<Joueur> tabJoueurs = new ArrayList<Joueur>();
    private int nbTours;
    private Gobelet goblet;

    public Partie(int nbTours,int nbDes) {
        goblet = new Gobelet(nbDes);
        this.nbTours = nbTours;
    }
    public void initialiser(Joueur joueur){
        tabJoueurs.add(joueur);
    }

    public void lancer() throws Exception {
        System.out.println("Partie Lancée !! ");
        for (int i = 0 ; i <nbTours ;i++){
            System.out.println("Tour numéro : "+(i+1));
            for (Joueur joueur:tabJoueurs
                 ) {

                joueur.jouer(goblet);
                System.out.println("cest le tour de "+joueur);
            }

        }
        afficheGagnant();
    }

    public void afficheGagnant(){
        Joueur gagant=null;

        if(tabJoueurs.size() != 0) {
            for (Joueur joueur : tabJoueurs
            ) {
                if (gagant == null || joueur.get_score() > gagant.get_score())
                    gagant = joueur;
            }
            System.out.println(gagant);
        }

    }

}
