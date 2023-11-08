package cartes;

import java.util.ArrayList;
import java.util.List;

public class MainAsListe implements Main {

	List<Carte> liste = new ArrayList<>(); 
	
	public MainAsListe() {
	}
	
	void prendre(Carte carte) {
		liste.add(carte);
	}
	void jouer(Carte carte) {
		assert liste.contains(carte);
		liste.remove(carte);
	}

}
