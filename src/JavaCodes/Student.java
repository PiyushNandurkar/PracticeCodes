package JavaCodes;

public class Student {
	private String name;
	private int rollno;
	
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return this.rollno;
	}
	
	public void setRollno(int rollno) {
		if(rollno<=0){
			throw new IllegalArgumentException("Invalid Args");
		}
		this.rollno = rollno;
	}
	
	
	public void display(){
		System.out.println(this.name);
		System.out.println(this.rollno);
	}
}
