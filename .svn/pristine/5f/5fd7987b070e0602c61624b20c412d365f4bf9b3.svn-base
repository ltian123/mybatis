create table t_order(
	id int primary key auto_increment,
	no varchar(20)
)engine=Innodb default charset=utf8;


create table t_item(
	id int primary key auto_increment,
	name varchar(10),
	num int,
	order_id int,
	constraint fk_t_order foreign key (order_id) references t_order(id)
)engine=Innodb default charset=utf8;