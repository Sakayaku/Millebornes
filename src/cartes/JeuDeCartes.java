package cartes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import cartes.Probleme.Type;

public class JeuDeCartes {
	private Carte[] typesDeCartes=new Carte[19];
	List<Carte> listeCartes = new ArrayList<>();
	
	public JeuDeCartes() {
		typesDeCartes[0] = new Botte(1, Type.FEU);
        typesDeCartes[1] = new Botte(1, Type.ESSENCE);
        typesDeCartes[2] = new Botte(1, Type.CREVAISON);
        typesDeCartes[3] = new Botte(1, Type.ACCIDENT);
        typesDeCartes[4] = new Attaque(5, Type.FEU);
        typesDeCartes[5] = new Attaque(3, Type.ESSENCE);
        typesDeCartes[6] = new Attaque(3, Type.CREVAISON);
        typesDeCartes[7] = new Attaque(3, Type.ACCIDENT);
        typesDeCartes[8] = new Parade(14, Type.FEU);
        typesDeCartes[9] = new Parade(6, Type.ESSENCE);
        typesDeCartes[10] = new Parade(6, Type.CREVAISON);
        typesDeCartes[11] = new Parade(6, Type.ACCIDENT);
        typesDeCartes[12] = new Borne(10, 25);
        typesDeCartes[13] = new Borne(10, 50);
        typesDeCartes[14] = new Borne(10, 75);
        typesDeCartes[15] = new Borne(12, 100);
        typesDeCartes[16] = new Borne(4, 200);
        typesDeCartes[17] = new FinLimite(6);
        typesDeCartes[18] = new DebutLimite(4);
        //Collections.addAll(listeCartes, typesDeCartes);
        for (int i=0;i<typesDeCartes.length;i++) {
        	for (int j=0;j<typesDeCartes[i].getNombre();j++) {
        		listeCartes.add(typesDeCartes[i]);
        	}
        }
	}

	public Carte[] getTypesDeCartes() {
		return typesDeCartes;
	}

	public void setTypesDeCartes(Carte[] typesDeCartes) {
		this.typesDeCartes = typesDeCartes;
	}

	public List<Carte> getListeCartes() {
		return listeCartes;
	}

	public void setListeCartes(List<Carte> listeCartes) {
		this.listeCartes = listeCartes;
	}
	
	public boolean checkCount() {
		for (int i=0;i<typesDeCartes.length;i++) {
				if ((Collections.frequency(listeCartes, typesDeCartes[i]) !=typesDeCartes[i].getNombre())) {
					return false;
				}
			}
		return true;
	}
	
	

}
