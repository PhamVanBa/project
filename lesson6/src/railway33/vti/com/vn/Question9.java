package railway33.vti.com.vn;

import java.util.ArrayList;

public class Question9 {


		
		private static void question9_Pos() {
			System.out.println("Tạo Position");
			Position position = new Position();
			System.out.println("Thông Tin Postion Vừa Nhập: ");
			System.out.println(position);
		}
		
		private static void question9_Departments() {
			Department department1 = new Department();
			Department department2 = new Department();
			Department department3 = new Department();
			ArrayList<Department> listDepartments = new ArrayList<Department>();
			listDepartments.add(department1);
			listDepartments.add(department2);
			listDepartments.add(department3);
			System.out.println("Thông Tin Vừa Nhập: ");
			for (Department department : listDepartments) {
				System.out.println(department);
			}
		}

	}


