package fr.or.ProjetBank;

import java.util.List;

public interface IClient {
    public void ajouterCompte(Compte compte) throws BanqueException ;
    public Compte getCompte(int nuNUm);
    public List<Compte> getTabComptes();
}
