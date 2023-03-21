
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Skapar möbler
		Table matbord = new Table("Matbord", "matsalen", 1234, 150);
		Coffetable soffbord = new Coffetable("Soffbord", "vardagsrummet", 5678, 50);
		Coffetable soffbord2 = new Coffetable("Soffbord", "vardagsrummet", 5678, 30, true);
		
		System.out.println("Det finns just nu: " + Furniture.getCount() + " möbler");
		
		System.out.println("Skriver ut info om möbler: ");
		matbord.printInfo();
		soffbord.printInfo();
		soffbord2.printInfo();
		
		
		System.out.println("Använder möbler: ");
		matbord.use("tallrik", 20);
		soffbord.use("mug", 6);
		soffbord2.use("fat", 45);
	}

}
