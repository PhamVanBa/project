package railway33.vti.com.vn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class QuanLyAccount {
	static Scanner scanner = new Scanner(System.in);
	static List<Account> danhSachAccount = new ArrayList<Account>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------ * * * ---------------------------");
		System.out.println("Chao mung ban den voi he thong phan mem quan ly Tai khoan ngan hang!!");
		int idChucNang = 0;
		while (idChucNang != 6) {
			System.out.println("1. Them moi tài khoản");
			System.out.println("2. Tìm kiếm theo số tài khoản");
			System.out.println("3. Hiện thị thông tin về danh sách các tài khoản");
			System.out.println("4. Nhập vào số tài khoản bộ và delete ");
			System.out.println("5. Sap xep theo số tài khoản");
			System.out.println("6. Thoat chuong trinh");
			System.out.print("Moi ban nhap vao chuc nang: ");
			idChucNang = scanner.nextInt();

			switch (idChucNang) {
			case 1:
				themMoiAccount();
				break;
			case 2:
				timKiemTheoSTK();
				break;
			case 3:
				hienThiDanhSachAccount();
				break;
			case 4:
				xoaTheoSTK();
				break;
			case 5:
				sapXepTheoSTK();
				break;
			case 6:
				System.out.println("Cam on ban da su dung dich vu cua chung toi, xin chao va hen gap lai !!!!");
				break;
			default:
				break;
			}
		}
	}

	private static void sapXepTheoSTK() {
		danhSachAccount.sort(Comparator.comparing(Account::getStk));
		System.out.println("Thong tin tai khoan: ");
		for (Account account : danhSachAccount) {
			System.out.println(account);
		}

	}

	private static void xoaTheoSTK() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Nhap stk can xoa: ");
		String stk =sc.nextLine();
		if(stk == null || stk.equals("")) {
			System.out.println("Khong co stk nao trong");
		} else {
			List<Account> danhSachXoa = new ArrayList<Account>();
			for (Account account : danhSachAccount) {
				if(account.getStk().equals(stk)) {
					danhSachXoa.add(account);
				}
			}
			if(danhSachXoa.size() > 0) {
				danhSachAccount.removeAll(danhSachXoa);
				System.out.println("Ban da xoa tat ca stk: " + stk);
			} else {
				System.out.println("Khong tim thay stk: " + stk);
				xoaTheoSTK();
			}
		}

	}

	private static void hienThiDanhSachAccount() {
		for (Account account : danhSachAccount) {
			System.out.println(account);
		}
	}

	private static void timKiemTheoSTK() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Nhap stk can tim kiem: ");
		String stk =sc.nextLine();
		if(stk == null || stk.equals("")) {
			System.out.println("Khong co stk trong");
		} else {
			boolean timThay = false;
			for (Account account : danhSachAccount) {
				if(account.getStk().contains(stk)) {
					System.out.println(account);
					timThay = true;
				}
			}
			if(timThay != true) {
				System.out.println("Khong co tai khoan nao co stk: " + stk);
			}
		}

	}

	private static void themMoiAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon loai tai khoan!!!");
		System.out.println("1. Tai khoan thuong");
		System.out.println("2. Tai khoan VIP");
		System.out.println("3. Tai khoan quoc te");
		int loaiCanBo = sc.nextInt();
		switch (loaiCanBo) {
		case 1:
			themMoiAccountThuong();
			break;
		case 2:
			themMoiAccountVip();
			break;
		case 3:
			themMoiAccountQuocTe();
			break;
		default:
			break;
		}
	}

	private static void themMoiAccountQuocTe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap vao thong tin cho tai Vip!!!");
		System.out.println("So tai khoan: ");
		String stk = sc.nextLine();
		System.out.println("Ho va ten: ");
		String hoTen = sc.nextLine();
		System.out.println("Gioi tinh: ");
		String gender = sc.nextLine();
		Gender gioiTinh = Gender.fromValue(gender);
		System.out.println("Chung minh thu: ");
		String cmt = sc.nextLine();
		System.out.println("So dien thoai: ");
		String sdt = sc.nextLine();
		System.out.println("Dia chi: ");
		String queQuan = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("NgaySinh: ");
		String ngaySinhString = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ngaySinh = LocalDate.parse(ngaySinhString, formatter);
		System.out.println("Co chuyen khoan khong gioi han: ");
		boolean coGioiHan = sc.nextBoolean();
		System.out.println("Co thanh toan quoc te: ");
		boolean coThanhToanQuocTe = sc.nextBoolean();
		System.out.println("So du: ");
		float soDu = sc.nextFloat();

		AccountInter account = new AccountInter();
		account.setStk(stk);
		account.setHoTen(hoTen);
		account.setCmt(cmt);
		account.setEmail(email);
		account.setGioiTinh(gioiTinh);
		account.setNgaySinh(ngaySinh);
		account.setQueQuan(queQuan);
		account.setSdt(sdt);
		account.setSoDu(soDu);
		account.setCoGioiHan(coGioiHan);
		account.setCoThanhToanQuocTe(coThanhToanQuocTe);
		danhSachAccount.add(account);

	}

	private static void themMoiAccountVip() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap vao thong tin cho tai Vip!!!");
		System.out.println("So tai khoan: ");
		String stk = sc.nextLine();
		System.out.println("Ho va ten: ");
		String hoTen = sc.nextLine();
		System.out.println("Gioi tinh: ");
		String gender = sc.nextLine();
		Gender gioiTinh = Gender.fromValue(gender);
		System.out.println("Chung minh thu: ");
		String cmt = sc.nextLine();
		System.out.println("So dien thoai: ");
		String sdt = sc.nextLine();
		System.out.println("Dia chi: ");
		String queQuan = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("NgaySinh: ");
		String ngaySinhString = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ngaySinh = LocalDate.parse(ngaySinhString, formatter);
		System.out.println("Co chuyen khoan khong gioi han: ");
		boolean coGioiHan = sc.nextBoolean();
		System.out.println("So du: ");
		float soDu = sc.nextFloat();

		AccountVip account = new AccountVip();
		account.setStk(stk);
		account.setHoTen(hoTen);
		account.setCmt(cmt);
		account.setEmail(email);
		account.setGioiTinh(gioiTinh);
		account.setNgaySinh(ngaySinh);
		account.setQueQuan(queQuan);
		account.setSdt(sdt);
		account.setSoDu(soDu);
		account.setCoGioiHan(coGioiHan);
		danhSachAccount.add(account);

	}

	private static void themMoiAccountThuong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap vao thong tin cho tai khoan thuong!!!");
		System.out.println("So tai khoan: ");
		String stk = sc.nextLine();
		System.out.println("Ho va ten: ");
		String hoTen = sc.nextLine();
		System.out.println("So dien thoai: ");
		String sdt = sc.nextLine();
		System.out.println("Gioi tinh: ");
		String gender = sc.nextLine();
		Gender gioiTinh = Gender.fromValue(gender);
		System.out.println("Chung minh thu: ");
		String cmt = sc.nextLine();
		System.out.println("Dia chi: ");
		String queQuan = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("NgaySinh: ");
		String ngaySinhString = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ngaySinh = LocalDate.parse(ngaySinhString, formatter);
		System.out.println("So du: ");
		float soDu = sc.nextFloat();

		Account account = new Account();
		account.setStk(stk);
		account.setHoTen(hoTen);
		account.setCmt(cmt);
		account.setEmail(email);
		account.setGioiTinh(gioiTinh);
		account.setNgaySinh(ngaySinh);
		account.setQueQuan(queQuan);
		account.setSdt(sdt);
		account.setSoDu(soDu);
		danhSachAccount.add(account);
	}
}
