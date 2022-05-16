package fr.or.ProjetBank;

public class Main {
    public static void main(String[] args) {
        try {
            Client client = new Client("jone","matt",25,0011);
            Compte cmp = new Compte(112233,0);
            cmp.ajouter(45.12);
            System.out.println(cmp);
            cmp.retirer(5);
            Compte cmp1 = new Compte(11233,0);
            cmp1.ajouter(45.12);
            System.out.println(cmp);
            client.ajouterCompte(cmp);
            client.ajouterCompte(cmp1);
            cmp1.retirer(2);
            System.out.println(client);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
