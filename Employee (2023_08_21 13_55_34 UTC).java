package Mypackage;

public class Employee{
 private  String id; 
 private  String name;
 private  String sex;
 private  int age ;
 private  Long phnno;
 private  String email ;       
 private  String shift;
 
 public Employee(String id,String name,String sex,int age,Long phnno,String email,String shift) {
	 this.id=id;
	 this.name=name;
	 this.sex=sex;
	 this.age=age;
	 this.phnno=phnno;
	 this.email=email;
	 this.shift=shift;
 }
 public   String getid() {return id;}
 public   String getname() {return name;}
 public   String getsex() {return sex;}
 public   int getage() {return age;}
 public   Long getphnno() {return phnno;}
 public   String getemail() {return email;}
 public   String getshift() {return shift;}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", phnno=" + phnno + ", email="
			+ email + ", shift=" + shift + "]";
}
 
}

