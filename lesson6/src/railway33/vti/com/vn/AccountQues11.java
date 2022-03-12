package railway33.vti.com.vn;

public class AccountQues11 {

	public static int COUNT = 0;
	private int id;
	private String email;
	private String userName;
	private int age;
	
	
	@Override
	public String toString() {
		return "AccountQues11 [id=" + id + ", email=" + email + ", userName=" + userName + ", age=" + age + "]";
	}

	public AccountQues11() throws InvalidAgeInputingException {
		super();
		System.out.println("Mời bạn nhập thông tin account cần tạo mới.");
		this.id = COUNT++;
		System.out.println("Email: ");
		this.email = ScannerUltis.inputString();
		System.out.println("UserName: ");
		this.userName = ScannerUltis.inputString();
		this.age = inputAccountAge();
	}

	private int inputAccountAge() throws InvalidAgeInputingException{
		System.out.println("Age: ");
		while (true) {
			int ageInput = ScannerUltis.inputInt();
			if (ageInput <= 0) {
				throw new InvalidAgeInputingException("The age must be greater than 0, please input again.");
			} else {
				if (ageInput < 18) {
					System.err.println("Your age must be greater than 18, input again: ");
				} else {
					return ageInput;
				}
			}
		}
	}
	
}
