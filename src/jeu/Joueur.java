package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.FinLimite;
import cartes.Limite;
import cartes.Probleme.Type;

public class Joueur{

	private String nom;
	List<Limite> pileLimite = new ArrayList<>();
	List<Carte> pileBataille = new ArrayList<>();
	List<Borne> collecBorne = new ArrayList<>();
	Set<Botte> ensembleBotte = new HashSet<>();
	private MainAsListe main;
		
	public Joueur(String nom, List<Limite> pileLimite, List<Carte> pileBataille, List<Borne> collecBorne, HashSet<Botte> ensembleBotte ) {
		this.nom=nom;
		this.pileLimite=pileLimite;
		this.pileBataille=pileBataille;
		this.collecBorne=collecBorne;
		this.ensembleBotte=ensembleBotte;
	}

	public String getNom() {
		return nom;
	}

	public List<Limite> getPileLimite() {
		return pileLimite;
	}

	public List<Carte> getPileBataille() {
		return pileBataille;
	}

	public List<Borne> getCollecBorne() {
		return collecBorne;
	}

	public Set<Botte> getEnsembleBotte() {
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
		main.prendre(carte);
	}
	
	public Carte prendreCarte(List<Carte> sabot) {
		if (sabot.isEmpty()) {
			return null;
		}else {
			donner(sabot.get(0));
			return sabot.get(0);
		}
	}
	
	public int getKM() {
		int resultat=0;
		for (Iterator <Borne> iter = collecBorne.iterator(); iter.hasNext();) {
			Borne borne = iter.next();
			resultat+=borne.getKm();
		}
		return resultat;
	}
	public int getLimite() {
		Botte botteFeu=new Botte(1,Type.FEU);
		if (pileLimite.isEmpty() || pileLimite.get(pileLimite.size()-1) instanceof FinLimite || ensembleBotte.contains(botteFeu)){
			return 200;
		}else {
			return 50;
		}
	}
	public Boolean estBloque() {
		Botte bottePrio=new Botte(1,Type.FEU);
		if ((pileBataille.isEmpty() && ensembleBotte.contains(bottePrio))) {
			return false;
		}else {
			return true;
		}
	}
	
}
