import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args){
		int computer_number=(int)(Math.random()*100)+1;
		int count = 0;
		int number;
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("1과 100사이의 숫자를 입력하세요");
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
				System.out.println("맞았습니다 총"+count+"번 만에 맞췄습니다");
				break;
			}
		}
	}

}
