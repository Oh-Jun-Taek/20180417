import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� �� �� �ҷ�?");
		int row=scan.nextInt();
		System.out.println("�� �� �� �ҷ�?");
		int col=scan.nextInt();
		
		int a[][]=new int[row][col];
		// int a[][]=new int[][col]; �� ũ�� �Ⱦ��°� ����
		
		for(int i=0;i<a.length;i++) { //�� ������ŭ
			for(int j=0;j<a[i].length;j++) { //�� ������ŭ
				System.out.println("a["+i+"]["+j+"] �� �Է��ϼ���");
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) { //�� ������ŭ
			for(int j=0;j<a[i].length;j++) { //�� ������ŭ
				System.out.println("a["+i+"]["+j+"] = "+a[i][j]);
			}
		}
	}

}
