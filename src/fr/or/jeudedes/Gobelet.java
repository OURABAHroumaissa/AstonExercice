package fr.or.jeudedes;

public class Gobelet {
    public static int valeur;
    private de[] des;

    public Gobelet(int nb_des) {
        valeur = 0;
        des = new de[nb_des];
    }

    public static int getValeur() {
        return valeur;
    }

    public void lancer(){
        valeur++;

    }
}
