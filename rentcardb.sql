create database rentacardb;

use rentacardb;

create table cars (
	car_id Integer not null primary key auto_increment,
    car_name varchar (255) not null
);

select * from cars;

insert into cars (car_name) values ('GOL'), ('CIVIC');

update cars set car_name = 'NEW-CIVIC' where car_id = 3;

delete from cars where car_id = 2;

insert into cars (car_name) values ('COROLA'), ('CORSA');