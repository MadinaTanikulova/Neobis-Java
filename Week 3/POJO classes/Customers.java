package Pojo;

//Class Customers
public class Customers {
     private int Id;
	 private String Name;
	 private String Gender;
	 private String Address;
	 private String PhoneNumber;
	 
	 public Customers(){
		 //default constructor
	 }
	 
	 //Constructor by argument
	 public Customers(int id,String name,String gender,String address,String phoneN){
		 this.Id = id;
		 this.Name = name;
		 this.Gender = gender;
		 this.Address = address;
		 this.PhoneNumber = phoneN;	 
	 }
	 
	 //Setter/Getter
	 public void setId(int id){
		 this.Id = id;
	 }
	 public int getId(){
		 return Id;
	 }
	 
	 public void setName(String name) {
		 this.Name = name;
	 }
	 public String getName(){
		 return Name;
	 }
	 
	 public void setGender(String gender) {
		 this.Gender = gender;
	 }
	 public String getGender(){
		 return Gender;
	 }
	 
	 public void setAddress(String address) {
		 this.Address = address; 
	 }
	 public String getAddress(){
		 return Address;
	 }
	 
	 public void setPhoneNumber(String phoneN) {
		 this.PhoneNumber = phoneN;	  
	 }
	 public String getPhoneNumber() {
		 return PhoneNumber;
	 }
 
}