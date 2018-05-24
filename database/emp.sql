create table t_dept(
	id int primary key auto_increment,
	name varchar(10)
)engine=Innodb default charset=utf8;


create table t_emp(
	id int primary key auto_increment,
	name varchar(10),
	salary double,
	dept_id int,
	constraint fk_t_dept foreign key (dept_id) references t_dept(id)
)engine=Innodb default charset=utf8;