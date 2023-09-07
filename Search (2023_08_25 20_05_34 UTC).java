package Mypackage;

import java.util.Scanner;

public class Search {
	
	  private String booking_id;
	  private String customer_name;
	  private String room_id;
	  private String checkin;
	  private String checkout;
	  private String booking_amount;
	  private int room_no;
	  private String room_status;
	  private int room_price;
	  private String room_type;
	  private String room_floor;
	  private String cust_id;
	  private String cust_name;
	  private String cust_sex;
	  private String cust_age;
	  private String cust_phnno;
	  private String email;
	  private String recent_booking;
	  
	   

	public Search(String cust_id, String cust_name, String cust_sex, String cust_age, String cust_phnno, String email,String recent) {
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_sex = cust_sex;
		this.cust_age = cust_age;
		this.cust_phnno = cust_phnno;
		this.email = email;
		this.recent_booking = recent;
	}


	public Search(String booking_id, String customer_name, String room_id, String checkin, String checkout,
			String booking_amount) {
		this.booking_id = booking_id;
		this.customer_name = customer_name;
		this.room_id = room_id;
		this.checkin = checkin;
		this.checkout = checkout;
		this.booking_amount = booking_amount;
	}
	    	  
		  
		 public Search(String room_id, int room_no, String room_status, int room_price, String room_type,String room_floor) {
				this.room_id = room_id;
				this.room_no = room_no;
				this.room_status = room_status;
				this.room_price = room_price;
				this.room_type = room_type;
				this.room_floor = room_floor;
			}


}