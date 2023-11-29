package testsFonctionnels;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import cartes.Attaque;
import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.Limite;
import cartes.Parade;
import cartes.Probleme;
import cartes.Probleme.Type;
import jeu.Joueur;

public class Test4 {
	public static void main(String[] args) {
		LinkedList<Limite> pileLimite = new LinkedList<>();
		LinkedList<Bataille> pileBataille = new LinkedList<>();
		List<Borne> collecBorne = new ArrayList<>();
		HashSet<Botte> ensembleBotte = new HashSet<>();
		Borne borne10=new Borne(1, 10);
		Borne borne20=new Borne(1,20);
		Borne borne30=new Borne(1,30);
		FinLimite carteFinLimite=new FinLimite(1);
		DebutLimite carteDebutLimite=new DebutLimite(1);
		Botte botteFeu=new Botte(1,Type.FEU);
		
		Joueur joueur1=new Joueur("Joueur1", pileLimite, pileBataille, collecBorne, ensembleBotte);
		pileLimite=joueur1.getPileLimite();
		pileBataille=joueur1.getPileBataille();
		collecBorne=joueur1.getCollecBorne();
		ensembleBotte=joueur1.getEnsembleBotte();
		
		Carte c1=new Parade(0,Probleme.Type.FEU);
		System.out.println("appliquer "+c1+":"+c1.appliquer(joueur1));
		System.out.println("appliquer "+c1+":"+c1.appliquer(joueur1));
		Carte c2=new Attaque(0,Probleme.Type.FEU);
		System.out.println("appliquer "+c2+":"+c2.appliquer(joueur1));
		Borne borne100=new Borne(1,100);
		System.out.println("appliquer "+borne100+":"+borne100.appliquer(joueur1));
		System.out.println("appliquer "+Carte.VEHI_PRIO+":"+Carte.VEHI_PRIO.appliquer(joueur1));
		System.out.println("appliquer "+borne100+":"+borne100.appliquer(joueur1));
		System.out.println("appliquer "+borne100+":"+borne100.appliquer(joueur1));
		System.out.println("appliquer "+carteDebutLimite+":"+carteDebutLimite.appliquer(joueur1));
		Attaque panneEssence = new Attaque(0,Type.ESSENCE);
		System.out.println("appliquer "+panneEssence+":"+panneEssence.appliquer(joueur1));
		System.out.println("appliquer "+borne100+":"+borne100.appliquer(joueur1));
		Parade reparation = new Parade(0,Type.ACCIDENT);
		System.out.println("appliquer "+reparation+":"+reparation.appliquer(joueur1));
		Parade essence = new Parade(0,Type.ESSENCE);
		System.out.println("appliquer "+essence+":"+essence.appliquer(joueur1));

		
		
		
	}
}
