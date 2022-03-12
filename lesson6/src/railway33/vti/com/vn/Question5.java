package railway33.vti.com.vn;

import java.util.Scanner;

public class Question5 {
	
	static void inputAge() {

		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("NHập Số Bất Kỳ: ");
		try {
			int inputAge = scanner.nextInt();
			System.out.println("Số Vừa Nhập Là: " +inputAge);
			
			return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("wrong inputing! Please input an age as int, input again.");
		}
		
		}

	//Chuẩn

	private static void question5() {
		System.out.println("Nhập Vào Tuổi Của Sinh Viên: ");
		int age = ScannerUltis.inputIntPositive();
		System.out.println("Tuổi Của Sinh Viên Là; " + age);
	}
}
