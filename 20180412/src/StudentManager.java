import javax.swing.JOptionPane;
import com.ojt1210.org.Student;

public class StudentManager {
	public static void main(String[] args){
		/*
		 * 1�� �л��Է�
		 * 2�� �л����
		 * 3�� �л�����
		 * 4�� ����
		 */
		
		Student[] student = new Student[19];
		int num=0;
		
		for(int i=0;i<student.length;i++){
			student[i]=new Student();
		}
		
		while (true) {
			String select = JOptionPane.showInputDialog("1�� �л��Է�\n2�� �л����\n3�� �л�����\n4�� �л�����\n5�� ����");
			
			if (select.equals("1")) {
				String name=JOptionPane.showInputDialog("�л��� �̸� �Է��ϼ���");
				String kor=JOptionPane.showInputDialog("�л��� ����� �Է��ϼ���");
				String eng=JOptionPane.showInputDialog("�л��� ����� �Է��ϼ���");
				String math=JOptionPane.showInputDialog("�л��� ���м��� �Է��ϼ���");
				student[num].name=name;
				student[num].kor=Integer.parseInt(kor);
				student[num].eng=Integer.parseInt(eng);
				student[num].math=Integer.parseInt(math);
				num++;
			}
			
			else if (select.equals("2")) {
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "��° �л� �̸� : " + student[i].name);
					System.out.print(" ���� : " + student[i].kor);
					System.out.print(" ���� : " + student[i].eng);
					System.out.println(" ���� : " + student[i].math);
				}
			}
			else if (select.equals("3")) {
				String change = JOptionPane.showInputDialog("���° �л��� �����Ͻðڽ��ϱ�?");
				String name = JOptionPane.showInputDialog("������ �̸��� �Է��ϼ���");
				String kor = JOptionPane.showInputDialog("������ ������� �Է��ϼ���");
				String eng = JOptionPane.showInputDialog("������ ������� �Է��ϼ���");
				String math = JOptionPane.showInputDialog("������ ���м����� �Է��ϼ���");
				student[Integer.parseInt(change)-1].name=name;
				student[Integer.parseInt(change)-1].kor=Integer.parseInt(kor);
				student[Integer.parseInt(change)-1].eng=Integer.parseInt(eng);
				student[Integer.parseInt(change)-1].math=Integer.parseInt(math);
			}
			
			else if (select.equals("4")){
				String delete = JOptionPane.showInputDialog("���° �л��� �����Ͻðڽ��ϱ�?");
				student[Integer.parseInt(delete)-1].name=null;
				student[Integer.parseInt(delete)-1].kor=0;
				student[Integer.parseInt(delete)-1].eng=0;
				student[Integer.parseInt(delete)-1].math=0;
			}
			else {
				System.exit(1);
			}
		}	
	}

}
