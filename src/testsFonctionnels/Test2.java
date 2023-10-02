package testsFonctionnels;

import cartes.Attaque;
import cartes.Bataille;
import cartes.Botte;
import cartes.Parade;
import cartes.Probleme;
import cartes.Probleme.Type;

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
		System.out.println(carteAccident1.equals(carteAccident1));
		System.out.println(carteAccident1.equals(carteAccident2));
		System.out.println(carteAccident1.equals(carteReparation2));
		System.out.println(carteAccident1.equals(carteAccident3));
		System.out.println(carteReparation2.equals(carteReparation2));
		System.out.println(carteReparation2.equals(carteReparation1));
		System.out.println(carteReparation2.equals(carteAccident1));
		System.out.println(carteReparation2.equals(carteReparation2));
		System.out.println(carteAs1.equals(carteAs1));
		System.out.println(carteAs1.equals(carteAs2));
		System.out.println(carteAs1.equals(carteAccident1));

	}

}
