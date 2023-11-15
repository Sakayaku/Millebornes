package testsFonctionnels;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.Limite;
import cartes.Probleme.Type;
import jeu.Joueur;

public class Test3 {
	public static void main(String[] args) {
		List<Limite> pileLimite = new ArrayList<>();
		List<Bataille> pileBataille = new ArrayList<>();
		List<Borne> collecBorne = new ArrayList<>();
		HashSet<Botte> ensembleBotte = new HashSet<>();
		Borne borne10=new Borne(10, 10);
		Borne borne20=new Borne(10,20);
		Borne borne30=new Borne(10,30);
		collecBorne.add(borne10);
		collecBorne.add(borne20);
		collecBorne.add(borne30);
		FinLimite carteFinLimite=new FinLimite(2);
		DebutLimite carteDebutLimite=new DebutLimite(2);
		Botte botteFeu=new Botte(1,Type.FEU);
		
		Joueur joueur1=new Joueur("Hellow", pileLimite, pileBataille, collecBorne, ensembleBotte);
		System.out.println(joueur1.getKM());
		System.out.println("Pile de limite vide");
		System.out.println(joueur1.getLimite());
		System.out.println("Sommet de la pile est une fin de limite");
		pileLimite.add(carteFinLimite);
		Joueur joueur2=new Joueur("Hellow", pileLimite, pileBataille, collecBorne, ensembleBotte);
		System.out.println(joueur2.getLimite());
		System.out.println("Le joueur a une botte feu");
		ensembleBotte.add(botteFeu);
		Joueur joueur3=new Joueur("Hellow", pileLimite, pileBataille, collecBorne, ensembleBotte);
		System.out.println(joueur3.getLimite());
		System.out.println("On devrait renvoyer 50");
		pileLimite.add(carteDebutLimite);
		Joueur joueur4=new Joueur("Hellow", pileLimite, pileBataille, collecBorne, ensembleBotte);
		System.out.println(joueur4.getLimite());
		
		pileLimite.clear();
		pileBataille.clear();
		collecBorne.clear();
		ensembleBotte.clear();
		Joueur joueur5=new Joueur("Joueur5",pileLimite, pileBataille, collecBorne, ensembleBotte);
		System.out.println(joueur5.estBloque());		
		
		
	}

}
