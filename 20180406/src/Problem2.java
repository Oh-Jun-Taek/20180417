
public class Problem2 {
	public static void main(String[] args) {
		int[][] arr= {{5,5,5,5,5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
		int sum=0;
		double average;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		average = (double)sum/(arr.length*arr[0].length);
		
		System.out.println("총합은 "+sum+"이고 평균은 "+average+"입니다");
	}

}
