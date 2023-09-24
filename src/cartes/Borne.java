package cartes;

public class Borne extends Carte {

	public Borne(int nombre) {
		super(nombre);
	}
	private int km;
	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}
	public int getKm() {
		return km;
	}


}
