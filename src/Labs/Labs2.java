package Labs;

public class Labs2 {

	public static void main(String[] args) {
			Student One = new Student("Paulo", "40359");
		
			One.setCity("Covilha");
			One.setPhone(927797943);
			One.setState("Portugal");
			One.pay(2500);
			One.enroll("- English");
			One.enroll("- Spanish");
			One.enroll("- Software Development");
			System.out.println(One.toString());
	}
	
}
	class Student{
		// Properties of the class
		private static int iD = 4982;
		private String SSN;
		private String email;
		private String SN;   // Student number = static iD + random 4 digits + 4 last SSN
		private String name;
		private int phone;
		private String city;
		private String state;
		private String courses = "";
		private double balance;
		private static final int costCourse = 800;
		
		// Constructor 
		public Student(String name, String SSN){
			this.SSN = SSN;
			System.out.println("Dear " + name + ", your Students' Account has been created! \n");
			setEmail(name);
			setSN();
			iD++;
						

		}
		private void setSN(){
			int random = (int) (Math.random()*8001+1000);
			SN = "" + iD + random + SSN.substring(1);
		}
		private void setEmail(String name){
			this.name = name;
			int random = (int) (Math.random()*99+1);
			email = "" + random + name + "@university.com";
		}
		public void enroll(String course){
			this.courses = this.courses + "\n" + course;
			balance = balance - costCourse;
		}
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}
		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}

		public void showCourses(){
			System.out.println("Your courses are:" + courses);
		}
		
		public void pay(int amount){
			balance = balance + amount;
			System.out.println("You just made a deposit of $" + amount +"\n");
		}
		
		public void checkBalance(){
			System.out.println(balance);
		}
		
		@Override
		public String toString(){
			String ending = "a";
			if (name.endsWith(ending)){
				return "[Mrs. " + name +"]\n[SN: " + SN + "]\n[Email: " + email + "]\n[Balance: $" + balance + "] \n[Phone: "+ phone +"] \n[City: " + city + "] \n[State: " + state +"]";
			}
			else{
			return "[Mr. " + name +"]\n[SN: " + SN + "]\n[Email: " + email + "]\n[Balance: $" + balance + "] \n[Phone: "+ phone +"] \n[City: " + city + "] \n[State: " + state +"]\nCouses:" + courses + "\n";
			}
		}
	}
	
