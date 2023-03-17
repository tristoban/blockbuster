create table IF NOT EXISTS client(id bigint auto_increment primary key,name varchar(255),email varchar (255),state tinyint(1));
create table IF NOT EXISTS employee(id bigint auto_increment primary key, name varchar(255),last_name varchar(255),salary double,manager_id bigint, foreign key (manager_id) references manager(id));
create table IF NOT EXISTS manager(id bigint auto_increment primary key, name varchar(255),last_name varchar(255),salary double);
create table IF NOT EXISTS manager_employee(manager_id bigint, employee_id bigint, primary key (manager_id, employee_id), foreign key (manager_id) references manager(id), foreign key(employee_id) references employee(id));
create table IF NOT EXISTS movie(id bigint auto_increment primary key,name varchar(255),release_date int,stock int,rent_price double);
