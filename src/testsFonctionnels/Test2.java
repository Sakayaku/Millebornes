package testsFonctionnels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import cartes.Attaque;
import cartes.Bataille;
import cartes.Botte;
import cartes.Carte;
import cartes.JeuDeCartes;
import cartes.Parade;
import cartes.Probleme;
import cartes.Probleme.Type;
import utils.Utils;

public class Test2 {
	public static void main(String[] args) {
		Type accident=Type.ACCIDENT;
		Type paradeAccident=Type.ACCIDENT;
		Type botteAccident=Type.ACCIDENT;
		Probleme carteAccident1 = new Attaque(3, accident);
		Probleme carteAccident2 = new Attaque(3, accident);
		Attaque carteAccident3 = new Attaque(3,accident);
		Parade carteReparation1= new Parade(3,paradeAccident);
		Parade carteReparation2= new Parade(3,paradeAccident);
		Bataille carteReparation3 =new Parade(3,paradeAccident);
		Botte carteAs1= new Botte(1,botteAccident);
		Botte carteAs2= new Botte(1,botteAccident); 
		/*System.out.println(carteAccident1.equals(carteAccident1));
		System.out.println(carteAccident1.equals(carteAccident2));
		System.out.println(carteAccident1.equals(carteReparation2));
		System.out.println(carteAccident1.equals(carteAccident3));
		System.out.println(carteReparation2.equals(carteReparation2));
		System.out.println(carteReparation2.equals(carteReparation1));
		System.out.println(carteReparation2.equals(carteAccident1));
		System.out.println(carteReparation2.equals(carteReparation2));
		System.out.println(carteAs1.equals(carteAs1));
		System.out.println(carteAs1.equals(carteAs2));
		System.out.println(carteAs1.equals(carteAccident1));*/
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> listCarte=jeu.getListeCartes();
		/*System.out.println("Affichage de la liste\n");
		System.out.println(listCarte);
		for (Carte carte:listCarte) {
			System.out.println(carte);
			
		}
		System.out.println("CheckCount du jeu sans modification "+jeu.checkCount());
		listCarte.remove(0);
		System.out.println("CheckCount du jeu aprÃ¨s modification "+jeu.checkCount());*/
		testMethodesUtils();
		System.out.println(jeu.checkCount());
		}
		public static void testMethodesUtils(){
			JeuDeCartes jeu=new JeuDeCartes(); 
			List<Carte>listeCarteNonMelangee=jeu.getListeCartes();
			List<Carte>listeCarteAvecModifs=new ArrayList<>(listeCarteNonMelangee);
			System.out.println("~Liste avant mélange\n"+listeCarteAvecModifs); 
			listeCarteAvecModifs=Utils.melanger(listeCarteAvecModifs);
			System.out.println("~Liste après mélange\n"+listeCarteAvecModifs);
			System.out.println("~Liste mélangée sans erreur : "+Utils.verifierMelange(listeCarteNonMelangee,listeCarteAvecModifs));
			listeCarteAvecModifs=Utils.rassembler(listeCarteAvecModifs); 
			System.out.println("~Liste après rassemblement\n"+listeCarteAvecModifs);
			System.out.println("~Liste rassemblée sans erreur : "+Utils.verifierRassemblement(listeCarteAvecModifs)); 
		}
}
