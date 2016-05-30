
public class Date {
	private int day = 1;
	private int month = 1;
	private int year = 1960;
	
	
	public Date(int day, int month, int year) {
		super();
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

	public static void main(String[] args) {
		Date date1 = new Date(1, 2, 2012); 
		Date date2 = new Date(1, 3, 2013); 
		Date date3 = new Date(1, 4, 2014); 
		Date date4 = new Date(1, 5, 2015); 
		Date date5 = new Date(1, 6, 2016); 
		Employee emp1 = new Employee(1, "Nayeem", date1);
		Employee emp2 = new Employee(2, "Iqubal", date2);
		Employee emp3 = new Employee(3, "Joy", date3);
		Employee emp4 = new Employee(4, "MD.", date4);
		Employee emp5 = new Employee(5, "Shumon", date5);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println(emp5.toString());
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		
		if(day < 1 || day > 31)
		{
			System.out.println("Day Must Be 1 to 31");
			return;
		}
		
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12)
		{
			System.out.println("Month Must Be 1 to 12");
			return;
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}
