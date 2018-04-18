
public class ArrayCopy {
	public static void main(String[] args) {
		int[] list = {10,20,30,40,50};
		int[] numbers = list;
		// 이렇게 복사하면 numbers배열의 값을 바꿔도
		// list배열의 값이 같이 바뀐다
		
		numbers[0]=100;
		
		System.out.println(list[0]);
		System.out.println(numbers[0]);
	}

}

