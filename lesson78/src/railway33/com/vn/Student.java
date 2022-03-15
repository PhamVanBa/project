package railway33.com.vn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	public static int COUNT = 0;
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = ++COUNT;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student(1, "Pham Ba Dao"));
		listStudent.add(new Student(2, "Pham Mat Dao"));
		listStudent.add(new Student(3, "Pham Ba Dao"));
		listStudent.add(new Student(4, "Pham Ba Nhay"));
		listStudent.add(new Student(5, "Pham Tu Toi"));

		// a) In ra tổng số phần tử của students
		System.out.println("In ra tổng số phần tử của students");
		for (Student student : listStudent) {
			System.out.println(student);
		}
		System.out.println("-----------***----------------");

		// b) Lấy phần tử thứ 4 của students
		System.out.println("Lấy phần tử thứ 4 của students");
		System.out.println(listStudent.get(3));
		System.out.println("-----------***----------------");

		// c) In ra phần tử đầu và phần tử cuối của students

		System.out.println("In ra phần tử đầu và phần tử cuối của students");
		System.out.println(listStudent.get(0));
		System.out.println(listStudent.get(listStudent.size() - 1));
		System.out.println("-----------***----------------");

		// d) Thêm 1 phần tử vào vị trí đầu của students

		System.out.println("Thêm 1 phần tử vào vị trí đầu của students");

		//listStudent.unshift( new Student(0,"Pham Ba Chay");
		//String name1 = ScannerUltis.inputString();
		String name1 = "Pham Ba Chay";
		listStudent.add(0, new Student(COUNT, name1));
		for (Student student : listStudent) {
			System.out.println(student);
		}
		System.out.println("-----------***----------------");

		// e) Thêm 1 phần tử vào vị trí cuối của students

		System.out.println("Thêm 1 phần tử vào vị trí cuối của students");

		//listStudent.push( new Student(0, "Pham Tieu Vien"));
		
		listStudent.add(new Student(0, "Pham Tieu Vien"));
		for (Student student : listStudent) {
			System.out.println(student);
		}
		System.out.println("-----------***----------------");

		// f) Đảo ngược vị trí của students

		System.out.println("Đảo ngược vị trí của students");
		for (Student student : listStudent) {
			System.out.println(student);
		}
		System.out.println("Sau khi dao nguoc-------------------------------");
		Collections.reverse(listStudent);
		for (Student student : listStudent) {
			System.out.println(student);
		}
		System.out.println("-----------***----------------");
		
		// g) Tạo 1 method tìm kiếm student theo id
		
		System.out.println("Tạo 1 method tìm kiếm student theo id");
		int id = 1;
		for (Student student : listStudent) {
			if (student.getId() == 1) {
				System.out.println(student);
			}
		}
		System.out.println("-----------***----------------");
		
		// h) Tạo 1 method tìm kiếm student theo name
		
		System.out.println("Tạo 1 method tìm kiếm student theo id");
		String name = "Pham Ba Chay";
		for (Student student : listStudent) {
			if (student.getName() == "Pham Ba Chay") {
				System.out.println(student);
			}
		}
		System.out.println("-----------***----------------");
		
		// i) Tạo 1 method để in ra các student có trùng tên
		
		System.out.println("Tạo 1 method để in ra các student có trùng tên");
		for (int i = 0; i < listStudent.size(); i++) {
			for (int j = 0; j < listStudent.size(); j++) {
				if (listStudent.get(i).getName().equals(listStudent.get(j).getName())) {
					System.out.println(listStudent.get(i).toString());
				}
			}
			
		}
		System.out.println("-----------***----------------");
		
		// j) Xóa name của student có id = 2;
		
		System.out.println("Xóa name của student có id = 2");
		int id1 = 2;
		for (Student student : listStudent) {
			if (student.getId() == 2) {
				student.setName(null);
			}
		}
		System.out.println("-----------***----------------");
		
		
		// k) Delete student có id = 5;
		
		System.out.println("Delete student có id = 5");
		int id2 = 5;
		listStudent.removeIf(student -> student.getId() == 5);
		System.out.println("-----------***----------------");
		
		// l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
		// studentCopies

		System.out.println("Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies");
		List<Student> arrayCopy = new ArrayList<Student>();
		arrayCopy.addAll(listStudent);
		for (Student student : arrayCopy) {
			System.out.println(student);
		}
	}

}
