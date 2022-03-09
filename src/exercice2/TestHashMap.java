package exercice2;
import java.util.*;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String, Integer> vehicules = new HashMap<String, Integer>();
		vehicules.put("BMW", 5);
		vehicules.put("Mercedes", 3);
		vehicules.put("Audi", 4);
		vehicules.put("Ford", 6);
		System.out.println("total des vehicules est "+ vehicules.size());
		
		//on veut parcourir et afficher les cles de la hashMap
		Set<String> Cles = vehicules.keySet();
		ArrayList<String> keys= new ArrayList<String>(Cles);
		for( Object key :keys)
		System.out.println(key);
		//on veut parcourir et afficher les valeurs de la hashMap
		Collection<Integer> valeurs = vehicules.values() ;
		for ( Object val : valeurs )
		System.out.println( " la valeur est : " +val) ;
		//on fait la recherche de la valeur de la clé "Audi"
		String searchKey = "Audi";
		if(vehicules.containsKey(searchKey))
		System.out.println("le total " + vehicules.get(searchKey) +" "+ searchKey + " voitures!\n");
		//effacer tous les valeurs de la hashMap
		vehicules.clear();
		System.out.println("apres l'operation clear , size: " + vehicules.size());
		}
		
}
