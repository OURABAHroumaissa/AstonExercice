package fr.or.ProjetBank;

public class Main {
    public static void main(String[] args) {
        try {
            Compte cmp = new Compte(112233,0);
            cmp.ajouter(45.12);
            System.out.println(cmp);
            cmp.retirer(5);
            System.out.println(cmp);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
