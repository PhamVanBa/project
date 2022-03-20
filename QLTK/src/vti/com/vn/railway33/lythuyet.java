package vti.com.vn.railway33;

public class lythuyet {
	
	DATATYPE
	Có 2 loại data type : Primitive(nguyên Thuỷ) , Tự định nghĩa (đối tượng)
	pimitive : Số Nguyên : byte, short, int, long
			Số Thực : float, double
			Kí Tự : char (để lưu 1 kí tự)
				    String (để lưu 1 chỗ kí tự)
			Logic : boolean(1 bit)
	DATE : gồm có 3 loại : Data, LocalDate, Calendar
	Enum: Sử dụng để định nghĩa ra kiểu dữ liệu của người dùng
	Array: Để lưu 1 danh sách các giá trị
	Object: Bao gồm property (thuộc tính) và method (phương thức)
	Cách đặt tên thuộc tính
		o Tên thuộc tính phải là danh từ
		o Không viết hoa chữ cái đầu tiên và viết hoa các chữ cái đầu tiên của mỗi từ tiếp theo
		o Đối với datatype kiểu là boolean thì phải có is ở trước (VD: isCorrect)
		o Đối với datatype là ENUM thì phải viết hoa tất cả các ký tự và các từ phân biệt nhaubằng dấu _
Flow control
		if…else dùng đk ít trường họp còn Sưitch…..Case dùng đk nhiều trường hợp hơn
	a. If.. else
		 Biểu thức điều kiện có giá trị là true hoặc false
		Thực hiện từng trường hợp 1
		Tối đa là 3 if else. Nếu 4 if else thì dùng switch case
	b. Switch…Case
		Thực hiện tất cả case cùng lúc
		Nhanh hơn, tốn hiệu năng nhiều hơn
	c. For
		Tối thiểu không chạy lần nào
	d. While
		Trong khi mệnh đề điều kiện còn đúng thì còn thực hiện công việc
		Lặp ít nhất 0 lần
	e. Do while
		Thực hiện trước rồi kiểm tra điều kiện
		Lặp ít nhất 1 lần
	f. Continue
		Continue sẽ tiếp tục vòng lượt tiếp theo của vòng for (không chạy các câu lệnh ở dưới)
	g. Break
		được sử dụng để thoát ra khỏi switch, loop hoặc block
	% Phép Lấy modul (giá trị trả về là phần dư của phép chia ) 5%2 (4/2= 2 dư 1)
Comparable (interface)
		Để so sánh chỉ 1 option 
		1 class chỉ implement 1 comparable
		Chỉ chứa method CompareTo() 
		Không tách được các tiêu chí so sánh ra
CompareTo(Object obj) 
		Dùng để so sánh đối tượng hiện tại với 1 đối tượng khác, sắp xếp list đối tượng
		Phải implement ở đối tượng cần so sánh
		Note: Check Object = null
		Using: Collections.sort(list); 
Comparator (interface) 
		Định nghĩa so sánh multi-option
		Chứa 2 method Compare() và equals()
Compare(Object obj1, Object obj2)
		Compare() định nghĩa chính xác cách sắp xếp, so sánh giữa nhiều đối tượng
		Không nhất thiết phải implement ở đối tượng cần so sánh, có thể tách ra inner class
Equals(Object obj)
	Equals() là so sánh giá trị (== là so sánh địa chỉ)
Constructor
	Sử dụng để khởi tạo các property của object
	Được gọi khi khởi tạo object
		VD: new Department()
		Object obj = new Object()  sẽ gọi method constructor của Object
	Mỗi 1 object luôn có 1 constructor default (không parameter)
	Khi khai báo constructor khác thì constructor default sẽ mất đi
	Có thể có nhiều Constructor trong 1 Object (overloading)
Access modifier
	Áp dụng cho variable, method, constructor

	Access
	Modifier  	Class  Package Subclass World
	public 	          Y      	Y 	Y 		Y
	protected 	Y 		Y 	Y 		N
	default 	.        Y.		Y 	N 		N
	private              Y	         N	 N		 N

	Private: Chỉ truy cập được trong class
			Muốn lấy/thay đổi giá trị của thuộc tính Private thì thông qua phương thức getter/setter
			 (có thể chỉnh sửa logic ở đây)
	Protected: Chỉ xảy ra trong quan hệ kế thừa (có thể khác package) và trong cùng 1 package
	Default: Không Khai báo VD: int a;  Dùng trong 1 package
	Pubilc: Sử dụng ở mọi nơi trong project
OOP
	a. Phân tích bài toán lập trình
	Lập trình hướng đối tượng là
		 Phân tích bài toán thành các đối tượng
		Mỗi đối tượng sẽ gồm các thuộc tính và phương thức.
		o Để giải quyết bài toán chúng ta xây dựng mối quan hệ giữa các đối tượng
		o Và cho các đối tượng thực thi phương thức của chính nó
	Đối tượng là 1 thực thể sống, hành vi(method) của mình, đặc điểm của mình( thuộc tính)
	b. Xây dựng các mối quan hệ giữa các đối tượng
		 Is-a
			Kế thừa hoặc đa hình thể hiện cho is-a
			VD: A is-a B // Tức là Object A extends (implement) Object B
		Has-a (phụ thuộc)
			Nếu đối tượng A phụ thuộc vào đối tượng B thì đối tượng B trở thành
			thuộc tính đối tượng A
		Song Song
			Xảy ra khi các đối tượng không liên quan gì tới nhau cả nhưng lại muốn
			lấy thông tin của nhau thì phải qua 1 đối tượng trung gian
Các tính chất của OOP
	Encapsulation (Tính đóng gói ,che giấu thông tin):
		o Thể hiện qua access modifier Private
		o Không cho phép người sử dụng các đối tượng thay đổi trực tiếp trạng thái của
		đối tượng. Chỉ có các phương thức getter/setter của đối tượng đó mới cho
		phép thay đổi trạng thái của nó.  bảo đảm tính toàn vẹn của đối tượng
	Inheritance (Kế thừa)
		Những thuộc tính chung ở Super Class thì Sub Class không được viết vào
		 Các class con thừa kế tất cả các phương thức và thuộc tính của lớp cha cho phép
	Abstraction (Tính trìu tượng hóa)
		Thể hiện qua Abstract và interface
			Abstract class, Abstract method
			Interface
	Polymorphism (Đa hình)
		Thể hiện qua Override và Overload
		Quy về thằng cha để quản lý, khi cần thì có thể ép kiểu dữ liệu về thằng con
		Khi kế thừa xảy ra, thay vì quản lý danh sách các đối tượng con, chúng ta
		khi cần ép kiểu thì phải check kiểu dữ liệu bằng keyword instanceof

		Override (ghi đè phương thức)
			mô tả việc ghi lại, ghi đè hoặc viết lại phương thức đã được xây dựng ở class cha trong class con
		Overload (nạp chồng phương thức)
			Là phương thức có cùng tên nhưng khác tham số truyền vào (có thể khác số
			lượng tham số hoặc khác datatype)
Try…..catch…….finally
	Cho phép chạy câu lệnh sai mà không bị chết đứng chương trình khi đang chạy
	finally lúc nào cũng hiển thị thực hiện khối câu lệnh đó
Throw và Throws
	Throw: &quot;quăng ra&quot;, có thể &quot;quăng&quot; ở bất kỳ dòng nào trong phương thức.
		Nếu method đó có khả năng xử lý lỗi thì ta xử lý luôn bằng cách đặt try
		catch, nếu method đó không có khả năng xử lý thì ta sẽ ném lên method
		cha để xử lý bằng cách throw lên trên
	Throws: &quot;Ném đi&quot;, chỉ có phương thức mới sử dụng throws, cảnh báo
		method cha là method con có lỗi, method cha bắt buộc phải xử lý lỗi của method con
Stack trace
	Ngăn xếp Stack Trace mô tả cơ chế thực thi các method và xử lý exception

	1	static
		Tất cả các static property, static method sẽ được load lên đầu tiên khi chương trình bắt đầu chạy
		Property, method có static thì sẽ thuộc về Object
	1	final
		Khai báo 1 số không thể thay đổi (là giá trị cuối cùng ) không thể đổi
1. HashTable (bảng băm)
	Các method insert và search rất nhanh (kể cả khi data lớn)
2. Collection
	Collection là một đối tượng java cung cấp sẵn để lưu trữ và thao tác trên dữ liệu có
		cấu trúc (chỉ quản lý các Object, ko quản lý dữ liệu primitive)
	Kiểu dữ liệu của Collection phải đồng nhất (kế thừa hoặc đa hình)
	a. List (interface)
		Là danh sách cấu trúc dữ liệu tuyến tính trong đó các phần tử được sắp sếp theo 1 thứ tự nhất định
		Các phần tử trong list có thể trùng nhau
		Có thể convert sang array
		Các method hay dùng : size(), add(), get(index), remove(index), clear()
		Stack vào trước ra sau
	b. Set (interface)
		Mỗi phần tử trong set chỉ xuất hiện duy nhất một lần
3. Map
	Quản lý dữ liệu theo dạng key - value.
	Truy cập data theo key
	Giống Set nhưng giá trị các phần tử trong map có thể trùng nhau nhưng key thì phải khác nhau
	Chuyển đổi qua Set thông qua method keySet();



1 B step over
2 A 
3 B 1 loi 2 chay
4 B 55
5 D method main ko the
6 B Test Test() {}
7 C tat ca
8 A //Looks like a comment
9 B A-Z,a-z
10 C null
11 object o1 cua Islas A try cap
	C class cha cua A
12 
	A Interface
13 C 3
14 ket qua cua việc compile va run Doan code sau la gi?
	C Error: 
15 interface la gi
	C la 1 loai abstract class
16 A
17 C compile


}
