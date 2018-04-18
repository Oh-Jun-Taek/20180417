
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(int _hour,int _minute,int _second){
		if(_hour>=0 && _hour<24) {
			hour=_hour;
		}
		else
			hour = 0;
		
		if(_minute>=0 && _minute<60) {
			minute=_minute;
		}
		else
			minute = 0;
		
		if(_second>=0 && _second<60) {
			second=_second;
		}
		else
			second = 0;
	}
	
	@Override
	public String toString() {
		return hour+" "+minute+" "+second;
	}

}
