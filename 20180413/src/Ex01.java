import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex01 {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("scan �Է�");
		String a = scan.nextLine();
		System.out.println("a = "+a);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("BufferedReader �Է�");
		String b = br.readLine();
		int f = br.read(); //���� �ϳ��� �ƽ�Ű �ڵ�� �޴´�
		System.out.println("b = "+b);
		System.out.println("f = "+f);
		
		System.out.println("JOptionPane �Է�");
		String c = JOptionPane.showInputDialog("�Է��ϼ���");
		System.out.println("c = "+c);
		
	}
	
}
