import javax.swing.JOptionPane;
import com.ojt1210.org.Student;

public class StudentManager {
	public static void main(String[] args){
		/*
		 * 1번 학생입력
		 * 2번 학생출력
		 * 3번 학생수정
		 * 4번 종료
		 */
		
		Student[] student = new Student[19];
		int num=0;
		
		for(int i=0;i<student.length;i++){
			student[i]=new Student();
		}
		
		while (true) {
			String select = JOptionPane.showInputDialog("1번 학생입력\n2번 학생출력\n3번 학생수정\n4번 학생삭제\n5번 종료");
			
			if (select.equals("1")) {
				String name=JOptionPane.showInputDialog("학생의 이름 입력하세요");
				String kor=JOptionPane.showInputDialog("학생의 국어성적 입력하세요");
				String eng=JOptionPane.showInputDialog("학생의 영어성적 입력하세요");
				String math=JOptionPane.showInputDialog("학생의 수학성적 입력하세요");
				student[num].name=name;
				student[num].kor=Integer.parseInt(kor);
				student[num].eng=Integer.parseInt(eng);
				student[num].math=Integer.parseInt(math);
				num++;
			}
			
			else if (select.equals("2")) {
				for (int i = 0; i < student.length; i++) {
					System.out.print((i + 1) + "번째 학생 이름 : " + student[i].name);
					System.out.print(" 국어 : " + student[i].kor);
					System.out.print(" 영어 : " + student[i].eng);
					System.out.println(" 수학 : " + student[i].math);
				}
			}
			else if (select.equals("3")) {
				String change = JOptionPane.showInputDialog("몇번째 학생을 수정하시겠습니까?");
				String name = JOptionPane.showInputDialog("수정할 이름을 입력하세요");
				String kor = JOptionPane.showInputDialog("수정할 국어성적을 입력하세요");
				String eng = JOptionPane.showInputDialog("수정할 영어성적을 입력하세요");
				String math = JOptionPane.showInputDialog("수정할 수학성적을 입력하세요");
				student[Integer.parseInt(change)-1].name=name;
				student[Integer.parseInt(change)-1].kor=Integer.parseInt(kor);
				student[Integer.parseInt(change)-1].eng=Integer.parseInt(eng);
				student[Integer.parseInt(change)-1].math=Integer.parseInt(math);
			}
			
			else if (select.equals("4")){
				String delete = JOptionPane.showInputDialog("몇번째 학생을 삭제하시겠습니까?");
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
