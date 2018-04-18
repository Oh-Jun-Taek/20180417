
public class Foreach {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};
		
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		
		// 같은 출력의 for each 구문
		for(int value:numbers) {
			System.out.print(value+" ");
		}
		
	}

}
