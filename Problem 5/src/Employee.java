
public class Employee {
	private int number;
	private String name;
	private Date joiningDate;
	public Employee(int number, String name, Date joiningDate) {
		super();
		this.number = number;
		this.name = name;
		this.joiningDate = joiningDate;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name
				+ ", joiningDate=" + joiningDate.toString() + "]";
	}
	
	
}	
