package Main;

public class KidUser implements LibraryUser {
	private String bookType;
	private int age;

	public KidUser() {

	}

	public KidUser(String bookType, int age) {
		super();
		this.bookType = bookType;
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "KidUser [bookType=" + bookType + ", age=" + age + "]";
	}

	@Override
	public void registerAccount(String bookType, int age) {

		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, must be less than 12 years old to register as a kid.");
		}
	}

	@Override
	public void requestBook(String bookType, int checkOutTime) {

		if (bookType == "Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}

	}

}
