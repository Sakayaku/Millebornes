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
		System.out.println("CheckCount du jeu après modification "+jeu.checkCount());*/
		Test(listCarte);
		}
		public static <T> void Test(List<T> listeOriginale){
			List<T> listeOriginaleSansModif=new ArrayList<>();
			List<T> listeOriginaleAvecModif=new ArrayList<>();
			List<T> nouvelleListe=new ArrayList<>();
			List<T> listeRassembler=new ArrayList<>();
			List listeRassemblerTest=new ArrayList();
			listeOriginaleSansModif.addAll(listeOriginale);
			listeOriginaleAvecModif.addAll(listeOriginale);
			System.out.println("Affichage de l'ancienne liste");
			System.out.println(listeOriginaleSansModif);
			System.out.println("On mélange la liste");
			nouvelleListe.addAll(Utils.melanger(listeOriginaleAvecModif));
			System.out.println("Affichage de la nouvelle liste");
			System.out.println(nouvelleListe);
			/*for (Carte carte:nouvelleListe) {
				System.out.println(carte);
				
			}*/
			System.out.println("On vérifie que la liste avant mélange a le même nombre d'occurence que celle après le mélange: ");
			System.out.println(Utils.verifierMelange(listeOriginaleSansModif, nouvelleListe));
			Collections.addAll(listeRassemblerTest, 1,1,2,1,3);
			System.out.println("Affichage de la liste rassemblement "+listeRassemblerTest);
			System.out.println("Vérification du rassemblement sur la liste");
			System.out.println(Utils.rassembler(listeRassemblerTest));
		}
}
