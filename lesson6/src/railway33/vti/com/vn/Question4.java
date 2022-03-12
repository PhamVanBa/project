package railway33.vti.com.vn;


public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String business = "Business";
		String sales = "sales";
		String services = "services";
		String [] departments = {business, sales, services};
		
		System.out.println(departments[0]);
		System.out.println(departments[1]);
		
		try {
			System.out.println(departments[5]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot find department.");
		}
		
	}
}
