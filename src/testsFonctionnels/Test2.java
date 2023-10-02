package testsFonctionnels;

import cartes.Attaque;
import cartes.Botte;
import cartes.Parade;
import cartes.Probleme;
import cartes.Probleme.Type;

public class Test2 {
	public static void main(String[] args) {
		Type accident=Type.ACCIDENT;
		Type paradeAccident=Type.ACCIDENT;
		Type botteAccident=Type.ACCIDENT;
		Probleme carteAccident = new Attaque(3, accident);
		Parade carteReparation= new Parade(3,paradeAccident);
		Botte carteAs= new Botte(1,botteAccident);

	}

}
