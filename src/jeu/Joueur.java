package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.Limite;
import cartes.Main;
import cartes.MainAsListe;

public class Joueur{

	private String nom;
	List<Limite> pileLimite = new ArrayList<>();
	List<Limite> pileFinLimite = new ArrayList<>();
	List<Carte> pileBataille = new ArrayList<>();
	List<Borne> collecBorne = new ArrayList<>();
	HashSet<Botte> ensembleBotte = new HashSet<>();
	private MainAsListe main;
		
	public Joueur(String nom) {
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}

	public List<Limite> getPileLimite() {
		return pileLimite;
	}

	public List<Limite> getPileFinLimite() {
		return pileFinLimite;
	}

	public List<Carte> getPileBataille() {
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
		if(obj instanceof Joueur){
			Joueur joueur = (Joueur) obj;
		return nom.equals(joueur.nom);
		}else {
			return false;
		}
	}
	public String toString () {
		return nom;
	}
	
	public void donner(Carte carte) {
		
	}
	
	public Carte prendreCarte(List<Carte> sabot) {
		if (sabot.isEmpty()) {
			return null;
		}else {
			donner(sabot.get(0));
			return sabot.get(0);
		}
	}
	
}
