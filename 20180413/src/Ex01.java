import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex01 {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("scan 입력");
		String a = scan.nextLine();
		System.out.println("a = "+a);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("BufferedReader 입력");
		String b = br.readLine();
		int f = br.read(); //숫자 하나를 아스키 코드로 받는다
		System.out.println("b = "+b);
		System.out.println("f = "+f);
		
		System.out.println("JOptionPane 입력");
		String c = JOptionPane.showInputDialog("입력하세요");
		System.out.println("c = "+c);
		
	}
	
}
