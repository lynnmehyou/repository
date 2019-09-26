
public class BuddyInfo {

		private String name;
		private String address;
		private int number;

		public BuddyInfo(){
		//BuddyInfo buddyInfo= new BuddyInfo();
		this.name= null;
		this.address=null;
		this.number=0;
		}

		public BuddyInfo( String name, String address, int number){
		//BuddyInfo buddyInfo= new BuddyInfo();
		this.name=name;
		this.address=address;
		this.number= number;

		}


		public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
		}

		public String getAddress() {
		return address;
		}

		public void setAddress(String address) {
		this.address = address;
		}

		public int getNumber() {
		return number;
		}

		public void setNumber(int number) {
		this.number = number;
		} 
		
		public static void main(String[] args) {

		BuddyInfo buddyInfo= new BuddyInfo();
		buddyInfo.setName("Homer");
		buddyInfo.setAddress("Carleton University");
		buddyInfo.setNumber(911);
		System.out.println("Hello "+ buddyInfo.getName()+ "!");
		System.out.println("Your number is " + buddyInfo.getNumber());
		System.out.println("Your address is " + buddyInfo.getAddress());

		// TODO Auto-generated method stub

		}

}
