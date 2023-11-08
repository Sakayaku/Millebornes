package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cartes.Carte;

public class MainAsListe implements Main {

	List<Carte> liste = new ArrayList<>(); 
	
	public MainAsListe() {
	}
	
	public void prendre(Carte carte) {
		liste.add(carte);
	}
	public void jouer(Carte carte) {
		assert liste.contains(carte);
		liste.remove(carte);
	}

	@Override
	public Iterator<Carte> iterateur() {
		return ;
	}


}
