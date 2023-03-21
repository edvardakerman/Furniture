
public abstract class Furniture {
	private String name;
	private String room;
	private int articleNumber;
	private static int count = 0; 
	
	Furniture(String name, String room, int articleNumber){
		this.name = name;
		this.room = room;
		this.articleNumber = articleNumber;
		Furniture.increaseCount();
	}

	public String getName() {
		return name;
	}

	public String getRoom() {
		return room;
	}

	public int getArticleNumber() {
		return articleNumber;
	}
	
	// Abstrakt metod
	public abstract void printInfo();
	

	public static int getCount() {
		return count;
	}

	public static void increaseCount() {
		Furniture.count++;
	}
	
}
