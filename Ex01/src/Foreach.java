
public class Foreach {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};
		
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		
		// ���� ����� for each ����
		for(int value:numbers) {
			System.out.print(value+" ");
		}
		
	}

}
