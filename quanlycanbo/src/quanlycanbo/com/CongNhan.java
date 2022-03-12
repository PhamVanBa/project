package quanlycanbo.com;

import java.util.Scanner;

public class CongNhan extends CanBo{
	
	private String capBacCongNhan;

	public String getCapBacCongNhan() {
		return capBacCongNhan;
	}

	public void setCapBacCongNhan(String capBacCongNhan) {
		this.capBacCongNhan = capBacCongNhan;
	}
	
	
	@Override
	public void thongTinCanBo() {
		// TODO Auto-generated method stub
		super.thongTinCanBo();
		System.out.println("Cấp Bậc Hiện Tại Là: " + this.capBacCongNhan);
	}
	
	@Override
	public void Nhap() {
		// TODO Auto-generated method stub
		super.Nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập Cấp Bậc: ");
		capBacCongNhan = scanner.nextLine();
		System.out.println("\n");
		
		scanner.close();
	}
	
	@Override
	public void Xuat() {
		// TODO Auto-generated method stub
		super.Xuat();
		System.out.println("Cấp Bậc Hiện Tại Là: " + capBacCongNhan);
	}
	
	
}
