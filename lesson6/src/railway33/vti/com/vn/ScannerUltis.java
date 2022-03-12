package railway33.vti.com.vn;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerUltis {

	public static Scanner scanner = new Scanner(System.in);
	
	
	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(scanner.next().trim());
			} catch (Exception e) {
				System.err.println("Nhập Lại: ");
			}
		}
	}
	
	public static int inputIntPositive() {
		while (true) {
			try {
				int intPositive = Integer.parseInt(scanner.next());
				if (intPositive >= 0) {
					return intPositive;
				} else {
					System.err.println("Nhập Lại: ");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Nhập Lại: ");
			}
		}
	}
	
	public static Float inputFloat(String mes) {
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			try {
				return Float.parseFloat(scanner.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Nhập Lại: ");
			}
		}
	}
	
	public static double inputDouble() {
		while (true) {
			try {
				return Double.parseDouble(scanner.next());
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Nhập Lại: ");
			}
		}
	}
	
	public static String inputString() {
		while (true) {
			String string = scanner.nextLine().trim();
			if (!string.isEmpty()) {
				return string;
			} else {
				System.err.println("Nhập Lại: ");
			}
		}
	}
	public static LocalDate inputLocalDate() {
		System.out.println("Nhập Theo Định Dạng yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			String localdate = scanner.next().trim();
			try {
				if (format.parse(localdate) != null) {
					LocalDate lc = LocalDate.parse(localdate);
					return lc;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Nhập Lại: ");
			}
		}
	}
	
}
