import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args){
		int computer_number=(int)(Math.random()*100)+1;
		int count = 0;
		int number;
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("1�� 100������ ���ڸ� �Է��ϼ���");
			number = scan.nextInt();
			count++;
			if(computer_number>number){
				System.out.println(number+" up");
				continue;
			}
			else if(computer_number<number){
				System.out.println(number+" down");
				continue;
			}
			else{				
				System.out.println("�¾ҽ��ϴ� ��"+count+"�� ���� ������ϴ�");
				break;
			}
		}
	}

}
