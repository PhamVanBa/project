package railway33.vti.com.vn;

import java.util.Scanner;

public class Question6 {
	
	static Scanner scanner = new Scanner(System.in);

	static void inputAge() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int lap = 0;
		while (lap != 2) {
			System.out.println("1: Nhập Số Bất Kỳ 	 ");
			System.out.println("2: Thoát");
			System.out.println("Mời Bạn Nhập ");
			lap = scanner.nextInt();

			switch (lap) {
			case 1:
				nhapSo();
				break;
			case 2:
				System.out.println("Cám Ơn Hẹn Gặp Lại");
				break;
			default:
				break;
			}
		}

	}

	private static void nhapSo() {
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
	// Chuẩn 
	public static int inputIntPositive() {
		while (true) {
			try {
				int intPositiove = Integer.parseInt(scanner.next());
				if (intPositiove >= 0) {
					return intPositiove;
				} else {
					System.out.println("Nhập Lại: ");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Nhập Lại: ");
			}
		}
	}

}
