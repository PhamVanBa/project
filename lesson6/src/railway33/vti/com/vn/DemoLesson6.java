package railway33.vti.com.vn;

public class DemoLesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question1 try, catch, finally Hãy xử lý ễcption cho VD trên, khi bị lỗi thì in ra text "cannot divide 0"
		// Question 2: tiếp tục Question 1
		//Sau khi thực hiện xong method divide dù có lỗi hay không sẽ in ra text
		//"divide completed!"
		
		try {
			float result = divide(7,0);
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cannot divide 0");
		}finally {
			System.out.println("divide completed!");
		}
	}
	
	public static float divide(int a, int b) {
		
			return a/b;
	}
	
}
