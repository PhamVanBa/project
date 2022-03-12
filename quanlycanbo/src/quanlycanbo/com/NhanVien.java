package quanlycanbo.com;

import java.util.Scanner;

public class NhanVien extends CanBo {

	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public void thongTinCanBo() {
		// TODO Auto-generated method stub
		super.thongTinCanBo();
		System.out.println("Công Việc Là: " + this.congViec);
	}

	@Override
	public void Nhap() {
		// TODO Auto-generated method stub
		super.Nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập Công Việc: ");
		congViec = scanner.nextLine();
		System.out.println("\n");

		scanner.close();
	}

	@Override
	public void Xuat() {
		// TODO Auto-generated method stub
		super.Xuat();
		System.out.println("Công Việc Là: " + congViec);
	}
	
}
