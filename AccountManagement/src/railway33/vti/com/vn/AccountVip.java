package railway33.vti.com.vn;

public class AccountVip extends Account{
	
	private boolean coGioiHan;
	
	
	public boolean isCoGioiHan() {
		return coGioiHan;
	}


	public void setCoGioiHan(boolean coGioiHan) {
		this.coGioiHan = coGioiHan;
	}


	@Override
	public String toString() {
		return super.toString() + " [coGioiHan=" + coGioiHan + "]";
	}


	public void chuyenTienKhongGioiHan(float soTienChuyen) {
		if(coGioiHan == true) {
			this.soDu -= soTienChuyen;
		}else {
			System.out.println("Tai khoan khong co chuc chuyen khoan so tien lon");
		}
	}
	
	
}
