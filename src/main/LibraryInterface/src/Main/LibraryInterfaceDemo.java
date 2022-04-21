package Main;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {

		AdultUser Ronnie = new AdultUser("Fiction", 72);
		Ronnie.registerAccount(Ronnie.getBookType(), Ronnie.getAge());
		
		AdultUser Brian = new AdultUser("kids", 22);
		
		KidUser Lilly = new KidUser("kids", 11);
		KidUser Bernard = new KidUser("kids", 11);
		
		System.out.println(Brian);
		System.out.println(Lilly);
		System.out.println(Bernard);
		
		
		
	}

}
