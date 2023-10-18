package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Utils {

	public static <T> T extraireListe(List<T> liste) {
		Random random=new Random();
		int randomIndex=random.nextInt(liste.size());
		T element=liste.get(randomIndex);
		liste.remove(randomIndex);
		return element;
	}
	
	public static <T> T extraireListeIterator(List<T> liste) {
		Random random=new Random();
		int randomIndex=random.nextInt(liste.size());
		T element=liste.get(randomIndex);
		for (ListIterator<T> listIterateur =liste.listIterator();listIterateur.hasNext();) {
			if (listIterateur.next()==element) {
				listIterateur.remove();
				return element;
			}
		}
		return null;
	}
	
	public static <T> List<T>  melanger(List<T> liste){
		List<T> resultat =new ArrayList<>();
		while (!liste.isEmpty()) {
			resultat.add(extraireListeIterator(liste));
		}
		return resultat;
	}
	
	public static <T> boolean verifierMelange(List<T> liste1, List<T> liste2){
		if (liste1.size()!=liste2.size()) {
			System.out.println("Les listes ne font pas les mêmes tailles");
			System.out.println("Taille de la liste 1 "+liste1.size()+" taille de la liste 2 "+liste2.size());
			return false;
		}
		for (T elemList:liste1) {
			if (Collections.frequency(liste1, elemList)!=Collections.frequency(liste2, elemList)) {
				return false;
			}
		}
		return true;
	}
	public static <T> List<T> rassembler(List<T> liste){
		List<T> resultat =new ArrayList<>();
		for (ListIterator<T> listIterateur1 =liste.listIterator();listIterateur1.hasNext();) {
			for (ListIterator<T> listIterateur2 =liste.listIterator();listIterateur2.hasNext();) {
				if (listIterateur2.next().equals(listIterateur1.next())) {
					resultat.add(listIterateur2.next());
					//listIterateur2.set(listIterateur1.next());
					System.out.println("Y'a deux élements consécutifs là");
				}
			}
		}
		System.out.println("On affiche le resultat "+resultat);
		return resultat;
		}
	
	
	public static <T> boolean verifierRassemblement(List <T> liste) {
		return true;
	}
}
