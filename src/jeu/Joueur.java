package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import cartes.Attaque;
import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.FinLimite;
import cartes.Limite;
import cartes.Parade;
import cartes.Probleme.Type;

public class Joueur{

	private String nom;
	List<Limite> pileLimite = new ArrayList<>();
	List<Bataille> pileBataille = new ArrayList<>();
	List<Borne> collecBorne = new ArrayList<>();
	Set<Botte> ensembleBotte = new HashSet<>();
	private MainAsListe main;
		
	public Joueur(String nom, List<Limite> pileLimite, List<Bataille> pileBataille, List<Borne> collecBorne, HashSet<Botte> ensembleBotte ) {
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

	public List<Bataille> getPileBataille() {
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
		Bataille sommet=pileBataille.get(pileBataille.size()-1);
		Carte sommetBotte=null;
		switch (sommet.getType()){
			case FEU:
				sommetBotte=Carte.VEHI_PRIO;
				break;
			case ACCIDENT:
				sommetBotte=Carte.AS_VOLANT;
				break;
			case ESSENCE:
				sommetBotte=Carte.CITERNE_ESSENCE;
				break;
			case CREVAISON:
				sommetBotte=Carte.INCREVABLE;
				break;
			default:
				break;
		}
		if ((pileBataille.isEmpty() && ensembleBotte.contains(Carte.VEHI_PRIO))) {
			return false;
		}
		if (sommet.equals(Carte.FEU_Vert)){
			return false;
		}
		if (sommet instanceof Parade && ensembleBotte.contains(Carte.VEHI_PRIO)) {
			return false;
		}
		if (sommet.equals(Carte.FEU_ROUGE) && ensembleBotte.contains(Carte.VEHI_PRIO)){
			return false;
		}
		if (sommet instanceof Attaque && ensembleBotte.contains(sommetBotte) && ensembleBotte.contains(Carte.VEHI_PRIO)){
			return false;
		}
		return true;
	}
	
}
