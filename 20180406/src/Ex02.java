import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("행 몇 개 할래?");
		int row=scan.nextInt();
		System.out.println("열 몇 개 할래?");
		int col=scan.nextInt();
		
		int a[][]=new int[row][col];
		// int a[][]=new int[][col]; 행 크기 안쓰는건 오류
		
		for(int i=0;i<a.length;i++) { //행 개수만큼
			for(int j=0;j<a[i].length;j++) { //열 개수만큼
				System.out.println("a["+i+"]["+j+"] 를 입력하세요");
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) { //행 개수만큼
			for(int j=0;j<a[i].length;j++) { //열 개수만큼
				System.out.println("a["+i+"]["+j+"] = "+a[i][j]);
			}
		}
	}

}
