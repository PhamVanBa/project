package railway33.vti.com.vn;

import java.util.Scanner;

public class Department {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int COUNT;
	private int id;
	private String name;
	
	public Department(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}
	
	public Department() {
		super();
		COUNT++;
		this.id = COUNT;
		System.out.println("Nhập Tên Phòng: ");
		this.name = ScannerUltis.inputString();
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	

}
