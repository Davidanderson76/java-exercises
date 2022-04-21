package Main;

public class AdultUser implements LibraryUser {
	private String bookType;
	private int age;

	public AdultUser() {

	}

	public AdultUser(String bookType, int age) {
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
		return "AdultUser [bookType=" + bookType + ", age=" + age + "]";
	}

	@Override
	public void registerAccount(String bookType, int age) {

		if (age > 12) {
			System.out.println("You have successfully registered uner an adult account.");
		} else {
			System.out.println("Sorry, age must be greater than 12 to register as an adult.");
		}

	}

	@Override
	public void requestBook(String bookType, int checkOutTime) {

		if (bookType == "Fiction") {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		} else {
			System.out.println("“Oops, you are allowed to take only adult Fiction books");
		}

	}

}
