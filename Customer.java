package Mypackage;

public class Customer {
	
	private String id;
	private String name;
	private int room;
	private String sex;
	private int age;
	private String phnno;
	private String email;
	private String bookingid;
	

	public Customer(String id,String name,int room,String sex,int age,String phnno,String email,String bookingid) {
		this.id=id;
		this.name=name;
		this.room=room;
		this.sex=sex;
		this.age=age;
		this.phnno=phnno;
		this.email=email;
		this.bookingid=bookingid;
	}

	public String getid() {return id;}
	public String getname() {return name;}
	public int getroom() {return room;}
	public String getsex() {return sex;}
	public int getage() {return age;}
	public String getphnno() {return phnno;}
	public String getemail() {return email;}
	public String getbookingid() {return bookingid;}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", room=" + room + ", sex=" + sex + ", age=" + age + ", phnno="
			+ phnno + ", email=" + email + ", bookingid=" + bookingid + "]";
}
}
