package Polymorphism;

public class Students {
	public void getstudentinfo(int id,String name) {
	System.out.println(id+name);		
	}public void getstudentinfo(String email,long phonenumber) {
	System.out.println(email+phonenumber);	
	}public static void main(String[] args) {
	 Students std=new Students();
	 std.getstudentinfo(16121, "tamilvanan");
	 std.getstudentinfo("tamilvanankumar13@gmail.com",7358520346L);
	}

}
