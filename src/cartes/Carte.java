package cartes;

public abstract class Carte {
	public static final FEU_ROUGE 
	protected Carte(int nombre) {
		this.nombre = nombre;
	}

	private int nombre;

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getNombre() {
		return nombre;
	}
}
