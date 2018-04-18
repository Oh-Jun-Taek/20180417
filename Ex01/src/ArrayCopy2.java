import java.util.Arrays;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		int[] copyarray = Arrays.copyOf(array, array.length); // Arrays.copyOf(배열이름,몇개 복사할지)
		
		// Arrays.copyOf 사용해서 배열 복사한 경우에는
		// 복사된 배열의 값을 바꿔도 원래 배열의 값이 바뀌지 않는다
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

