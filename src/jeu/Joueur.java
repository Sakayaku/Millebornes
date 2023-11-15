package jeu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import cartes.Attaque;
import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.FinLimite;
import cartes.Limite;
import cartes.Parade;
import cartes.Probleme.Type;

public class Joueur {

	private String nom;
	LinkedList<Limite> pileLimite = new LinkedList<>();
	LinkedList<Bataille> pileBataille = new LinkedList<>();
	List<Borne> collecBorne = new ArrayList<>();
	HashSet<Botte> ensembleBotte = new HashSet<>();
	private MainAsListe main;

	public Joueur(String nom, LinkedList<Limite> pileLimite, LinkedList<Bataille> pileBataille, List<Borne> collecBorne,
			HashSet<Botte> ensembleBotte) {
		this.nom = nom;
		this.pileLimite = pileLimite;
		this.pileBataille = pileBataille;
		this.collecBorne = collecBorne;
		this.ensembleBotte = ensembleBotte;
	}

	public String getNom() {
		return nom;
	}

	public LinkedList<Limite> getPileLimite() {
		return pileLimite;
	}

	public LinkedList<Bataille> getPileBataille() {
		return pileBataille;
	}

	public List<Borne> getCollecBorne() {
		return collecBorne;
	}

	public HashSet<Botte> getEnsembleBotte() {
		return ensembleBotte;
	}

	public MainAsListe getMain() {
		return main;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Joueur) {
			Joueur joueur = (Joueur) obj;
			return nom.equals(joueur.nom);
		} else {
			return false;
		}
	}

	@Override 
	public int hashCode() {    
		return 31 * nom.hashCode(); 
	}

	
	public String toString() {
		return nom;
	}

	public void donner(Carte carte) {
		main.prendre(carte);
	}

	public Carte prendreCarte(List<Carte> sabot) {
		if (sabot.isEmpty()) {
			return null;
		}
		Carte carte = sabot.get(0);
		sabot.remove(carte);
		donner(carte);
		return carte;

	}

	public int getKM() {
		int resultat = 0;
		for (Borne borne : collecBorne) {
			resultat += borne.getKm();
		}
		return resultat;
	}

	public int getLimite() {
		Botte botteFeu = new Botte(1, Type.FEU);
		if (pileLimite.isEmpty() || pileLimite.get(0) instanceof FinLimite
				|| ensembleBotte.contains(botteFeu)) {
			return 200;
		} else {
			return 50;
		}
	}

	public Boolean estBloque() {
		boolean vehiPrio=ensembleBotte.contains(Carte.VEHI_PRIO);
		if ((pileBataille.isEmpty() && vehiPrio)) {
			return false;
		}
		if (pileBataille.isEmpty()) {
			return true;
		}
		Bataille sommet = pileBataille.get(0);
		//System.out.println("La carte du sommet est "+sommet);
		if (sommet.equals(Carte.FEU_VERT)) {
			return false;
		}
		if (sommet instanceof Parade && vehiPrio) {
			return false;
		}
		if (sommet.equals(Carte.FEU_ROUGE) && vehiPrio) {
			return false;
		}
		Carte sommetBotte = null;
		switch (sommet.getType()) {
			case FEU:
				sommetBotte = Carte.VEHI_PRIO;
				break;
			case ACCIDENT:
				sommetBotte = Carte.AS_VOLANT;
				break;
			case ESSENCE:
				sommetBotte = Carte.CITERNE_ESSENCE;
				break;
			case CREVAISON:
				sommetBotte = Carte.INCREVABLE;
				break;
			default:
				break;
		}
		if (sommet instanceof Attaque && ensembleBotte.contains(sommetBotte)
				&& vehiPrio) {
			return false;
		}
		return true;
	}

}
