package exercice1;
import java.util.*;
public class Titulaire extends Compte implements Comparable{
	String nom;
	Compte c;
	HashSet <Compte> SetCompte = new HashSet<Compte>();
	Iterator<Compte> mesComptes = SetCompte.iterator();
	List<Compte> listComptes = new ArrayList<Compte>(SetCompte);
	
	public Titulaire(String nom, HashSet<Compte> setCompte) {
		super();
		this.nom = nom;
		SetCompte = setCompte;
	}
	
	void addCompte(Compte c) {
		SetCompte.add(c);
	}
	
	void afficheCompte() {
			System.out.println(mesComptes.next());
	}
	
	void depotCompte(Compte c,double m) {
		c.solde = solde + m;
	}
	
	void retraitCompte(Compte c,double m) {
		c.solde = solde - m;
	}
	
	

	
	public int maxSolde(Iterator<Compte> h) {
		int max = 0;
		while(h.hasNext()) {
			if(h.next().solde > max) max = h.next().numero;
		}
		return max;
	}
	

	
}
