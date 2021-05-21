/*
 *javac -d . *.java
 *javac -d . Main.java
 *java Pojo.Main
 */
package Pojo;


public class Main {
    public static void main(String[] args) {
	SunglassesShop sunglass = new SunglassesShop(1,1804,"Black","Ray-Ban","China",450,true);
	System.out.println("Sunglass! ");
	System.out.println("ID : " + sunglass.getId());
	System.out.println("Article : " + sunglass.getArticle());
	System.out.println("Color : " + sunglass.getColor());
	System.out.println("Brand : " + sunglass.getBrand());
	System.out.println("Manufacturer : " + sunglass.getManufacturer());
	System.out.println("Price : " + sunglass.getPrice());
	System.out.println("Polaroid : " + sunglass.getPolaroid());
	
	System.out.println();
	
	Customers customers_1 = new Customers(2,"Monika","Female","Berdibaeva street","0770851200");
	System.out.println("Customers! ");
	System.out.println("ID : " + customers_1.getId());
	System.out.println("Name : " + customers_1.getName());
	System.out.println("Gender : " + customers_1.getGender());
	System.out.println("Address : " + customers_1.getAddress());
	System.out.println("PhoneNumber : " + customers_1.getPhoneNumber());
	
	System.out.println();
	Orders order = new Orders(3,"Send",customers_1,sunglass);
	System.out.println("Orders! ");
	System.out.println("ID : " + order.getId());
	System.out.println("Status : " + order.getStatus());
	System.out.println("Customer orders : " + order.getCustomers());
	System.out.println("SunglassesShop orders : " + order.getSunglassesShop());
	
	
	}
}
