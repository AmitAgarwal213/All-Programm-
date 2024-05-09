package Encapsulation;
class login{
	private String EmailID = "contact@grotechminds";
	public String getEmailId() {
		
		return EmailID;
	}
	public void setEMail_id(String EmailID) {
	
	this.EmailID= EmailID;	
	
	}
	private String Password = "amit@1234";
	public String getPassword() {
		return Password;
	}
	 public void setPassword(String Password) {
		this.Password =Password;
	
}
	 
	}
public class AccessSpecifireForClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
login L1= new login();
L1.getEmailId();
L1.setEMail_id("amit@gmail.com");
System.out.println(L1.getEmailId());
System.out.println();
L1.setPassword("amit@12345");
System.out.println(L1.getPassword());
	}

}
