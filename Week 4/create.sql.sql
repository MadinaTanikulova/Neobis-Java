drop database Shop;
create database Shop;
use Shop;

create table SunglassesShop (
	Id  int,
	Article int,
	Color varchar(50) not null,
	Brand varchar(50) not null,
	Manufacturer varchar(50) not null,
	Price INT not null
);

create table Customers(
      Id int ,
	 Name_Surname varchar(50),
	  Gender varchar(50),
	  Address varchar(100),
	   PhoneNumber varchar(30)
);
 
create table Orders(
       Id int ,
	   Status varchar(30),
	  order_customer int,
	   order_sunglass int
);

insert into SunglassesShop 
values (1,1254,"Black","Ray Ban","China",450),
(2,1255,"Gold","Ciosako","China",400),
(3,1256,"Brown","Armani","China",850),
(4,1257,"Black","Xiomai","China",350),
(5,1259,"White","Porsh","China",1000),
(6,1260,"Red","Dior","China",580);

insert into Customers 
values (1,"Arsen Abylov","male","Kasymbekov street 48","0550147895"),
(2,"Ayperi Kadyrbekova","female","Lenin street 122","0550147895"),
(3,"Zeynep Sultanova","female","Ahunbeva street 237","0550147895"),
(4,"Ayana Muhammedova","female","Gagarina street 25","0550147895"),
(5,"Rysbek Almazbeov","male","Ayni street 112","0550147895");

insert into Orders 
values(1,"Recieved",1,4),
(2,"Not verifed",4,6),
(3,"Sent",5,5),
(4,"Verifed",2,2),
(5,"Processed",3,1);
