package fr.or.ProjetBank;

public class CompteASeuilRemunere extends CompteRemunere implements IRemunere{
    public CompteASeuilRemunere() {
    }

    public CompteASeuilRemunere(int numCompte, double solde, double taux) throws Exception {
        super(numCompte, solde, taux);
    }

    public double calculerInterets(){
        return super.calculerInterets();
    }
    public void verserInterets(){
        super.verserInterets();
    }
    public double getTaux(){
        return super.getTaux();
    }
    public void setTaux(double unTaux){
        super.setTaux(unTaux);
    }

    public void ajouter(double unMontant){
        super.ajouter(unMontant);
    }
    public void retirer(double unMontant) throws BanqueException  {
        super.retirer(unMontant);
    }

}
