import java.util.Arrays;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		int[] copyarray = Arrays.copyOf(array, array.length); // Arrays.copyOf(�迭�̸�,� ��������)
		
		// Arrays.copyOf ����ؼ� �迭 ������ ��쿡��
		// ����� �迭�� ���� �ٲ㵵 ���� �迭�� ���� �ٲ��� �ʴ´�
		copyarray[0] = 100;
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

		System.out.println();
		
		for(int i=0;i<copyarray.length;i++) {
			System.out.print(copyarray[i]+" ");
		}
		
		
	}
}

