package railway33.vti.com.vn;

import java.time.LocalDate;

public class Account {

	private String stk;
	private String hoTen;
	private Gender gioiTinh;
	private String cmt;
	private String sdt;
	private String queQuan;
	protected float soDu;
	private String email;
	private LocalDate ngaySinh;
	public String getStk() {
		return stk;
	}
	public void setStk(String stk) {
		this.stk = stk;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Gender getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(Gender gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public float getSoDu() {
		return soDu;
	}
	public void setSoDu(float soDu) {
		this.soDu = soDu;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public void truyVanSoDu() {
		System.out.println("Số dư tài khoản " + this.stk + "la: " + this.soDu);
	}
	
	public void vayTien(float soTienVay) {
		this.soDu += soTienVay;
	}
	

	@Override
	public String toString() {
		return "Thông tin Account [stk=" + stk + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", cmt=" + cmt + ", sdt=" + sdt
				+ ", queQuan=" + queQuan + ", soDu=" + soDu + ", email=" + email + ", ngaySinh=" + ngaySinh + "]";
	}
}
