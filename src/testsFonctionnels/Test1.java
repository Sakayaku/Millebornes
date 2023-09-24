package testsFonctionnels;

import java.util.Iterator;

import cartes.Attaque;
import cartes.Botte;
import cartes.Probleme;
import cartes.Probleme.Type;
import cartes.Carte;
import cartes.Parade;
import jeu.Sabot;

public class Test1 {
	public static void main(String args[]) {
		Sabot sabot =new Sabot(110);
		Type accident=Type.ACCIDENT;
		Type paradeAccident=Type.ACCIDENT;
		Type botteAccident=Type.ACCIDENT;
		Probleme carteAccident = new Attaque(3, accident);
		Parade carteReparation= new Parade(3,paradeAccident);
		Botte carteAs= new Botte(1,botteAccident);
		sabot.ajouterFamilleCarte(carteAccident,carteReparation,carteAs);
		Iterator<Carte> iterateur=sabot.iterator();
		System.out.println("Avec une suite de piocher():");
		System.out.println(sabot.piocher().toString());
		System.out.println(sabot.piocher().toString());
		System.out.println(sabot.piocher().toString());
		System.out.println(sabot.piocher().toString());
		System.out.println(sabot.piocher().toString());
		System.out.println(sabot.piocher().toString());
		System.out.println(sabot.piocher().toString());
		System.out.println("Avec un iterateur et remove():");
		sabot.ajouterFamilleCarte(carteAccident,carteReparation,carteAs);
		while(!sabot.estVide()) {
			System.out.println("je pioche "+iterateur.next().toString());
			iterateur.remove();
		}
		sabot.piocher();
		sabot.ajouterFamilleCarte(carteAs);
	}
}
