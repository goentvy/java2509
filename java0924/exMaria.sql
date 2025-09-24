show tables;

select now();

select * from departments;

--drop table test;
--
--create table test(
--	id varchar(50),
--	name varchar(100)
--);

create table if not exists test(
	id varchar(50),
	name varchar(100)
);