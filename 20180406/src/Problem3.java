
public class Problem3 {
	public static void main(String[] args) {
		int[] lotto=new int[45];
		int num;
		
		for(int i=0;i<6;i++) {
			num=(int)(Math.random()*45);
			
			if(lotto[num]==0) {
				lotto[num]=1;
				System.out.println(num+1);
				continue;
			}
			
			else {
				i--;
			}
		}
	}
}
