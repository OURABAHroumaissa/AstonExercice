package fr.or.ProjetBank;

public interface ICompteASeuil {
    public void retirer(double uneValeur) throws Exception;
    public boolean verifier(double uneValeur);
}
