import fr.or.dao.Profit;
import fr.or.exo7.Somme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   Profit pr = new Profit();

        pr.setPrixAchat(pr.DemandeSomme("Veuillez saisir le prix d'achat : "));
        pr.setPrixVente(pr.DemandeSomme("Veuillez saisir le prix de vente : "));

        pr.CalculBenefice();*/

        Scanner sc = new Scanner(System.in);

        Somme sm = new Somme();

        System.out.println("Veuillez saisir le premier opérande : ");

        int n1= Integer.valueOf(sc.nextLine());

        sm.setN1(n1);

        System.out.println("Veuillez saisir le deuxieme opérande : ");

        int n2= Integer.valueOf(sc.nextLine());

        sm.setN2(n2);

        System.out.println("Le résultat est : "+sm.Sum());



    }
}

