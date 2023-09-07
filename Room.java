package Mypackage;

public class Room {

	private String id;
	private int roomno;
	private String status;
	private int price;
	private String type;
	
	public Room(String id,int roomno, String status,int price,String type) {
		this.id=id;
		this.roomno=roomno;
		this.status=status;
		this.price=price;
		this.type=type;
	}
	public String getid() {return id;}
	public int getroomno() {return roomno;}
	public String getstatus() {return status;}
	public int getprice() {return price;}
	public String gettype() {return type;}
	@Override
	public String toString() {
		return "Room [id=" + id + ", roomno=" + roomno + ", status=" + status + ", price=" + price + ", type=" + type
				+ "]";
	}
}
