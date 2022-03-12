package quanlycanbo.com;

import java.util.Scanner;

public class CanBo {

	private String hoTen;
	private Integer tuoi;
	private String gioiTinh;
	private String diaChi;
	
	public CanBo() {
		
	}
	
	public CanBo(String hoTen, Integer tuoi, String gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		
	}

	@Override
	public String toString() {
		return "Canbo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + 
				gioiTinh + ", diaChi=" + diaChi + "]";
	}



	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Integer getTuoi() {
		return tuoi;
	}

	public void setTuoi(Integer tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void thongTinCanBo() {
		System.out.println("Họ Tên: " + hoTen + "\n Tuổi: " + tuoi + "\n Giới Tính: " + 
							gioiTinh + "\n Địa Chỉ: " + diaChi);
	}
	
	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập Họ Tên: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập Tuổi: ");
		tuoi = scanner.nextInt();
		System.out.println("Nhập Giới Tính: ");
		gioiTinh = scanner.nextLine();
		System.out.println("Nhập Địa Chỉ: ");
		diaChi = scanner.nextLine();
		
		
		scanner.close();
	}
	
	public void Xuat() {
		System.out.println("Họ Tên: " + hoTen);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Giới Tính:" + gioiTinh);
		System.out.println("Địa Chỉ: " + diaChi);
		
	}
	
}
