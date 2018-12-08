-- create table employees(
-- associate_ID int primary key,
-- first_name varchar (30),
-- last_name varchar (30),
-- department varchar (30),
-- job_title varchar (30),
-- salary int,
-- );


--------------------start insert departments---------------------------------

insert into department(department_ID,department_name)
values ('20','sales');

insert into department(department_ID,department_name)
values ('30','hr');

insert into department(department_ID,department_name)
values ('40','finance');

insert into department(department_ID,department_name)
values ('50','engineering');

--------------------end insert departments---------------------------------


--------------------- start insert employees--------------------------------------

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156321579,'Micheal','Smith','sales','sales person',6300000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156324579,'OLIVER','White','sales','sales person',6200000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156321179,'HARRY','Anderson','sales','sales person',15000000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156322579,'JACK','Brown','finance','sales person',9800000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (1561579,'GEORGE','Smith','finance','sales person',4600000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (158321579,'CHARLIE','Miller','finance','sales person',9600000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156821579,'ALFIE','Smith','finance','sales person',7400000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156321679,'FREDDIE','Hernandez','finance','sales person',8500000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156321539,'OSCAR','Thompson','finance','sales person',5200000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156741579,'LEO','Smith','engineering','sales person',3100000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156396579,'LOGAN','Jones','engineering','sales person',2000000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156323579,'ARCHIE','Rodriguez','engineering','sales person',200000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156631579,'THOMAS','Davis','engineering','sales person',5100000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156389579,'JAMES','Williams','engineering','sales person',9000000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (151581579,'JOSHUA','Johnson','engineering','sales person',8500000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156661579,'WILLIAM','Garcia','hr','sales person',8700000);

insert into employees(associate_ID,first_name,last_name,department_name,job_title,salary)
values (156301579,'WILLIAM','Wilson','hr','sales person',4500000);