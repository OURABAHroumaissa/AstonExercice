package fr.or.ProjetBank;

import java.util.Arrays;
import java.util.Objects;

public class Client implements IClient{
    /**
     * Nom du client
     */
    private String nom;
    /**
     * Prenom du client
     */
    private String prenom;
    /**
     * Age du Client
     */
    private int age;
    /**
     * Numero du Client
     */
    private int numero;
    /**
     * Le tableau des Comptes Client
     */
    private Compte[] tabComptes;

    public Client() {
    }

    public Client(String nom, String prenom, int age, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
        this.tabComptes = new Compte[5];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Compte[] getTabComptes() {
        return tabComptes;
    }



    public Compte getCompte(int index){
        return tabComptes[index];
    }

    public void setTabComptes(Compte[] tabComptes) {
        this.tabComptes = tabComptes;
    }

    @Override
    public void ajouterCompte(Compte compte) {
        int i = getIndexLibre();

        if (i<getTabComptes().length)
            this.tabComptes[i] = compte;
    }

    private int getIndexLibre() {
        int i=0;
        for (Object o : tabComptes) // pour chaque objet o de monTableau
            if (o!=null) i++;
        return i;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", tabComptes=" + Arrays.toString(tabComptes) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && numero == client.numero && Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom) && Arrays.equals(tabComptes, client.tabComptes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nom, prenom, age, numero);
        result = 31 * result + Arrays.hashCode(tabComptes);
        return result;
    }
}
