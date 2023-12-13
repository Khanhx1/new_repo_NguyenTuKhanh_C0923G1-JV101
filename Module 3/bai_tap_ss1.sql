drop database if exists database_1;
create database if not exists database_1;
use database_1;
create table class(
id int auto_increment primary key,
name_class varchar(45)
);
create table teacher(
id int auto_increment primary key,
name_teacher varchar(45),
age int,
country varchar(45)
);
use database_1;
insert into class (id, name_class) values (1, "khánh");
insert into class (id, name_class) values (2, "thắm");
insert into class (id, name_class) values (3, "pháp");
insert into teacher (id, name_teacher, age, country) values (1, "khánh", 18, "VN");
insert into teacher (id, name_teacher, age, country) values (2, "Pháp", 19, "EN");