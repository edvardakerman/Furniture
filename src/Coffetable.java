
public class Coffetable extends Table{
	private Boolean magazine;
	
	// Multipla konstruktorer
	Coffetable(String name, String room, int articleNumber, int surfaceSize, Boolean magazine){
		super(name, room, articleNumber, surfaceSize);
		this.setMagazine(magazine);
	}
	
	Coffetable(String name, String room, int articleNumber, int surfaceSize){
		super(name, room, articleNumber, surfaceSize);
		this.setMagazine(false);
	}

	public Boolean getMagazine() {
		return magazine;
	}

	public void setMagazine(Boolean magazine) {
		this.magazine = magazine;
	}
	
	// polymorfi
	public void use(String thing, int size) {
		if (magazine) {
			System.out.println(this.getName() + " är fyllt med tidningar, " + thing + " får inte plats...");
		} else {
			super.use(thing, size);
		}

	}
}
