package Pojo;


public class Orders {
       private int Id;
	   private String Status;
	   private Customers order_customer;
	   private SunglassesShop order_sunglass;
	   
	   public Orders() {
		 //default constructor
	   }
	 
	   //Constructor by argument
	   public Orders(int id,String status,Customers customers,SunglassesShop sunglass) {
		 this.Id = id;
		 this.Status = status;
		 this.order_customer = customers;
		 this.order_sunglass = sunglass;
	   }
	   //Setter/Getter
	   public void setId(int id) {  
	   this.Id = id;
	   }
	   public int getId() {
	   return Id;
	   }
	   
	   public void setStatus(String status) {  
	   this.Status = status;
	   }
	   public String getStatus() {
	   return Status;
	   }
	   
	   public void setCustomers(Customers customers) {  
	   this.order_customer = customers;
	   }
	   public Customers getCustomers() {
	   return order_customer;
	   }
	   
	   public void setSunglassesShop(SunglassesShop sunglass) {  
	   this.order_sunglass = sunglass;
	   }
	   public SunglassesShop getSunglassesShop() {
	   return order_sunglass;
	   }
	
}






















