/*
 *POJO class
 *
 */
 package Pojo;
 //Class SunglassesShop
 public class SunglassesShop {
	 private int Id;
	 private int Article;
	 private String Color;
	 private String Brand;
	 private String Manufacturer;
	 private int Price;
	 private boolean Polaroid;
	 
	 public SunglassesShop(){
		 //default constructor
	 }
	 
	 //Constructor by argument
	 public SunglassesShop(int id,int article,String color,String brand,String manufacturer,int price,boolean polaroid){
		 this.Id = id;
		 this.Article = article;
		 this.Color = color;
		 this.Brand = brand;
		 this.Manufacturer = manufacturer;
		 this.Price = price;
		 this.Polaroid = polaroid; 
	 }
	 
	 //Setter/Getter
	 public void setId(int id){
		 this.Id = id;
	 }
	 public int getId() {
		 return Id;
	 }
	 
	 public void setArticle(int article) {
		 this.Article = article;
	 }
	 public int getArticle() {
		 return Article;
	 }
	 
	  public void setColor(String color) {
		 this.Color = color;
	 }
	 public String getColor() {
		 return Color;
	 }
	 
	 public void setBrand(String brand) {
		 this.Brand = brand;
	 }
	 public String getBrand() {
		 return Brand;
	 }
	 
	 public void setManufacturer(String manufacturer) {
		 this.Manufacturer = manufacturer;
	 }
	 public String getManufacturer() {
		 return Manufacturer;
	 }
	 
	 public void setPrice(int price) {
		 this.Price = price;
	 }
	 public int getPrice() {
		 return Price;
	 }
	 public void setPolaroid(boolean polaroid) {
		 this.Polaroid = polaroid;
	 }
	 public boolean getPolaroid() {
		 return Polaroid;
	 }
	 
 }