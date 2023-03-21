
public class Table extends Furniture {
	private int surfaceSize;

	Table(String name, String room, int articleNumber, int surfaceSize) {
		super(name, room, articleNumber);
		this.surfaceSize = surfaceSize;
	}

	// Abstrakt metod
	public void printInfo() {
		System.out.println(this.getName() + " är ett bord som finns i " + this.getRoom()
				+ ", bordet har en bordsyta på " + this.getSurfaceSize() + " cm2");
	}

	public Boolean checkSize(int size) {
		if (size <= surfaceSize) {
			return true;
		} else {
			return false;
		}
	}

	// polymorfi
	public void use(String thing, int size) {
		// placer sak på bord;
		if (checkSize(size)) {
			System.out.println(thing + " placerades på " + this.getName());
		} else {
			System.out.println(thing + " får inte plats på " + this.getName());
		}
	}

	public int getSurfaceSize() {
		return surfaceSize;
	}

}
