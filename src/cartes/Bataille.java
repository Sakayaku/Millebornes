package cartes;

public abstract class Bataille extends Probleme {

	protected Bataille(int nombre, Type type) {
		super(nombre, type);
	}
	@Override
	public String toString() {
		return "Bataille [type=" + type + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Bataille){
			Bataille bataille = (Bataille) obj;
		return type.equals(bataille.type);
		}else {
			return false;
		}
	}

}
