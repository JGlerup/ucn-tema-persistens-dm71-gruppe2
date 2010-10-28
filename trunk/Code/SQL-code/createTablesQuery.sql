use dm71_2
create table Customer
(id int not null,
 name varchar(30) not null,
 address varchar(30) not null,
 zipcode int not null,
 city varchar(15) not null,
 phoneno int not null,
 customertype varchar(15) not null,
 email varchar(30) not null,
 customerno int not null,
 primary key (id),
 unique(customerno));
 
create table SalesOrder
(id int not null,
 date datetime not null,
 totalamount decimal(10,2) not null,
 deliverystatus varchar(9) not null,
 deliverydate datetime not null,
 orderno int not null,
 customerid int not null,
 primary key (id),
 unique(customerid),
 foreign key(customerid) references Customer(id)); 
 
 create table Discount
(id int not null,
 discount int not null,
 minamount int not null,
 saleorderid int not null,
 primary key (id),
 foreign key(saleorderid) references SalesOrder(id)); 
 
 create table MonthlyInvoice
(id int not null,
 invoiceno int not null,
 paymentdate datetime not null,
 totalamount decimal(10,2) not null,
 primary key (id),
 unique(invoiceno));
 
 create table SalesOrderMonthlyInvoice
(id int not null,
 salesorderid int not null,
 monthlyinvoiceid int not null,
 primary key (id),
 foreign key(salesorderid) references SalesOrder(id),
 foreign key(monthlyinvoiceid) references MonthlyInvoice(id));
 
 create table ClubDiscount
(id int not null,
 discount int not null,
 minamount int not null,
 monthlyinvoiceid int not null,
 primary key (id),
 foreign key(monthlyinvoiceid) references MonthlyInvoice(id));
 
 create table Supplier
(id int not null,
 name varchar(30) not null,
 address varchar(30) not null,
 country varchar(15) not null,
 phoneno int not null,
 email varchar(30) not null,
 primary key (id));
 
 create table Product
(id int not null,
 name varchar(30) not null,
 purchaseprice decimal(10,2) not null,
 salesprice decimal(10,2) not null,
 rentprice decimal(10,2) not null,
 countryoforigin varchar(30) not null,
 minstock int not null,
 quantity int not null,
 barcode int not null,
 size varchar(30),
 colour varchar(15),
 type varchar(15),
 description varchar(50),
 fabric varchar(30),
 caliber varchar(30),
 supplierid int not null,
 primary key (id),
 unique(barcode),
 foreign key(supplierid) references Supplier(id));
 
 create table SalesLineItem
(id int not null,
 quantity int not null,
 totalamount decimal(10,2) not null,
 salesorderid int not null,
 productid int not null,
 primary key (id),
 foreign key(salesorderid) references SalesOrder(id),
 foreign key(productid) references Product(id));     