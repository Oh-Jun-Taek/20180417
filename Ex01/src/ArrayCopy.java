
public class ArrayCopy {
	public static void main(String[] args) {
		int[] list = {10,20,30,40,50};
		int[] numbers = list;
		// �̷��� �����ϸ� numbers�迭�� ���� �ٲ㵵
		// list�迭�� ���� ���� �ٲ��
		
		numbers[0]=100;
		
		System.out.println(list[0]);
		System.out.println(numbers[0]);
	}

}

