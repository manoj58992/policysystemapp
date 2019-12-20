create database policy_data;

create table policy(
id bigint auto_increment not null,
number bigint not null unique,
type varchar(100) not null,
startdate date not null,
enddate date not null,
price double,
customerid bigint,
primary key (id));


create table customers(
id bigint auto_increment not null,
name varchar(100) not null,
phone bigint, 
email varchar(100) not null, 
gender varchar(100), 
lastssn varchar(100) not null unique, 
dob date not null,
primary key (id)); 


create table address(
id bigint auto_increment not null,
street1 varchar(100) not null,
street2 varchar(100),
city varchar(100) not null,
state varchar(100) not null,
zipcode int,
customersid bigint,
primary key (id),
foreign key (customersid) references customers(id));
 
 
create table covered_drivers(
id bigint auto_increment not null,
licenseNum varchar(100) not null,
licenseState varchar(100),
policyid bigint,
stat_isActive boolean,
primary key (id),
foreign key (policyid) references policy(id));
  
    
create table covered_vehicles(
id bigint auto_increment not null,
make varchar(100) not null,
model varchar(100) not null,
year int not null,
color varchar(100),
vin varchar(100) not null unique,
policyid bigint,
stat_isActive boolean,
primary key (id),
foreign key (policyid) references policy(id));
    
 
 
 
 