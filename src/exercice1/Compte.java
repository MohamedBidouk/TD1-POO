package exercice1;

public class Compte {
	int numero;
	double solde;

	void retrait(double m) {
	solde = solde - m;
	}
	void depot(double m){
	solde = solde + m;
	}
	public double compareBySolde(Compte a, Compte b) {
		return a.solde - b.solde;
	}
}
