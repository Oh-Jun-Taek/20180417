package com.ojt1210.org;

public class Student {
	public String name;
	public int math;
	public int kor;
	public int eng;
	public int tot;
	public double avg;
	
	public void doStudy(){
		System.out.println("���� ���ϰ� ����");
	}
	
	public void doPlay(){
		System.out.println("��� ����");
	}
	
	public void doOut(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+math);
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
	}
		
}
