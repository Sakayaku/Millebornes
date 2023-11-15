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
import cartes.Probleme.Type;
import jeu.Joueur;

public class Test3 {
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
		System.out.println(joueur1.getKM());
		collecBorne.add(borne10);
		System.out.println(joueur1.getKM());
		collecBorne.add(borne20);
		System.out.println(joueur1.getKM());
		collecBorne.add(borne30);
		System.out.println(joueur1.getKM());
		
		pileLimite.clear();
		pileBataille.clear();
		collecBorne.clear();
		ensembleBotte.clear();
		Joueur joueur2=new Joueur("Joueur2", pileLimite, pileBataille, collecBorne, ensembleBotte);
		pileLimite=joueur2.getPileLimite();
		pileBataille=joueur2.getPileBataille();
		collecBorne=joueur2.getCollecBorne();
		ensembleBotte=joueur2.getEnsembleBotte();
		System.out.println("Pile de limite vide");
		System.out.println(joueur2.getLimite());
		System.out.println("Sommet de la pile est une fin de limite");
		pileLimite.addFirst(carteFinLimite);
		System.out.println("Le joueur a une botte feu");
		ensembleBotte.add(botteFeu);
		System.out.println(joueur2.getLimite());
		
		Joueur joueur3=new Joueur("Joueur3", pileLimite, pileBataille, collecBorne, ensembleBotte);
		System.out.println(joueur3.getLimite());
		System.out.println("On devrait renvoyer 50");
		pileLimite.addFirst(carteDebutLimite);
		Joueur joueur4=new Joueur("Joueur4", pileLimite, pileBataille, collecBorne, ensembleBotte);
		System.out.println(joueur4.getLimite());
		
		
		
		Attaque accident=new Attaque(1,Type.ACCIDENT);
		Parade essence = new Parade(1,Type.ESSENCE);
		Attaque PanneEssence=new Attaque(1,Type.ESSENCE);
		Joueur joueur5=new Joueur("Joueur5",pileLimite, pileBataille, collecBorne, ensembleBotte);
		
		pileLimite=joueur5.getPileLimite();
		pileBataille=joueur5.getPileBataille();
		collecBorne=joueur5.getCollecBorne();
		ensembleBotte=joueur5.getEnsembleBotte();
		
		pileBataille.addFirst(Carte.FEU_ROUGE);
		System.out.println("On ajoute un feu rouge "+joueur5.estBloque());	
		ensembleBotte.add(Carte.VEHI_PRIO);
		System.out.println("On ajoute le véhicule prio "+joueur5.estBloque());
		pileBataille.addFirst(accident);
		System.out.println("On ajoute un accident "+joueur5.estBloque());
		ensembleBotte.add(Carte.AS_VOLANT);
		System.out.println("On rajoute l'as du volant "+joueur5.estBloque());
		pileBataille.addFirst(PanneEssence);
		System.out.println("On ajoute une panne d'essence "+joueur5.estBloque());
		pileBataille.addFirst(essence);
		System.out.println("On ajoute de l'essence "+joueur5.estBloque());
		ensembleBotte.clear();
		System.out.println("On a effacé les bottes "+joueur5.estBloque());
		pileBataille.addFirst(Carte.FEU_VERT);
		System.out.println("On rajoute un feu vert "+joueur5.estBloque());
		
	}

}
