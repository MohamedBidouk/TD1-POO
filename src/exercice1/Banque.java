package exercice1;
import java.util.*;

public class Banque	{
	String nom;
	ArrayList<Compte> ListComptes =new ArrayList<Compte>() ;
	Titulaire t;
	Compte c;
	Iterator<Compte> comptesBanque = ListComptes.iterator();
	
	public Banque(String nom, ArrayList<Compte> listComptes) {
		super();
		this.nom = nom;
		ListComptes = listComptes;
	}
	public void creerCompte (Titulaire t,Compte c) {
		
	}
	public void Affiche() {
		System.out.println(comptesBanque.next());
	}
}
	
