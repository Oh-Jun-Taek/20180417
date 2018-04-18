
public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date();
		
		// private 형 이기 때문에
		// date1.year = 2018; 이렇게 쓸수가 없음
		
		Date date2 = new Date(2018);
		Date date3 = new Date(2018,"4월",16);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
				
	}

}

