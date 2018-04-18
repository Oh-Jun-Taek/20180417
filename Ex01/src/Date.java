
public class Date {
	private int year;
	private String month;
	private int day;
	
	public Date() {
		year=1900;
		month="1��";
		day=1;
	}
	
	public Date(int _year) {
		year = _year;
		month = "1��";
		day = 1;
	}
	
	public Date(int _year,String _month,int _day) {
		year=_year;
		month=_month;
		day=_day;
	}
	
	@Override
	public String toString(){
		return year+", "+month+", "+day;
	}
}
