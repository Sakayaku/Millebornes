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
			resultat.add(extraireListe(liste));
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
		if (liste.isEmpty()) {
			return resultat;
		}
		for (ListIterator<T> listIterateur1 =liste.listIterator();listIterateur1.hasNext();) {
			T elementCourantListe=listIterateur1.next();
			if (resultat.contains(elementCourantListe)) {
				resultat.add(resultat.lastIndexOf(elementCourantListe), elementCourantListe);
			}else {
				resultat.add(elementCourantListe);
			}
		}
		return resultat;
		}
	
	
	public static <T> boolean verifierRassemblement(List <T> liste) {
		return true;
	}
}
