drop database if exists database_2;
create database if not exists database_2;
use database_2;

create table customer(
customer_id int auto_increment primary key,
name varchar(50) not null,
age int not null
);

create table order_product(
order_id int,
customer_id int,
order_date date not null,
order_total_price bigint not null,
primary key(order_id, customer_id),
foreign key(customer_id) references customer(customer_id)
);

create table invoice(
invoice_id int,
customer_id int,
quantity int default 0,
primary key(invoice_id, customer_id),
foreign key(customer_id) references customer(customer_id)
); 

create table product(
product_id int,
invoice_id int,
name varchar(50) not null,
price bigint not null,
primary key(product_id, invoice_id),
foreign key(invoice_id) references invoice(invoice_id)
);

create table order_detail(
order_id int,
product_id int,
quantity int not null,
primary key(order_id, product_id),
foreign key(order_id) references order_product(order_id),
foreign key(product_id) references product(product_id)
);







