package Mypackage;

public class Booking {

	private int bookingid;
	private String custname;
	private int roomid;
	private int roomno;
	private String checkindate;
	private String checkoutdate;
	private int amount;
	
	public Booking(int bookingid,String custname,int roomid,int roomno,String checkindate,String checkoutdate,int amount) {
		this.bookingid=bookingid;
		this.custname=custname;
		this.roomid=roomid;
		this.roomno=roomno;
		this.checkindate=checkindate;
		this.checkoutdate=checkoutdate;
		this.amount=amount;
	}
	
	public int getbookingid() {return bookingid;}
	public String getcustname() {return custname;}
	public int getroomid() {return roomid;}
	public int getroomno() {return roomno;}
	public String getcheckindate() {return checkindate;}
	public String getcheckoutdate() {return checkoutdate;}
	public int amount() {return amount;}
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", roomid=" + roomid + ", roomno=" + roomno + ", checkindate="
				+ checkindate + ", checkoutdate=" + checkoutdate + ", amount=" + amount + "]";
}
}
