package quanlycanbo.com;

import java.util.Scanner;

public class KySu extends CanBo{
	
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
	public void thongTinCanBo() {
		// TODO Auto-generated method stub
		super.thongTinCanBo();
		System.out.println("Ngành Đào Tạo Là: " + this.nganhDaoTao);
	}

	@Override
	public void Nhap() {
		// TODO Auto-generated method stub
		super.Nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập Ngành Đào Tạo: " + nganhDaoTao);
		nganhDaoTao = scanner.nextLine();
		System.out.println("\n");
		
		scanner.close();
	}
	
	@Override
	public void Xuat() {
		// TODO Auto-generated method stub
		super.Xuat();
		System.out.println("Ngành Đào Tạo Là: " + nganhDaoTao);
	}
	
	
}
