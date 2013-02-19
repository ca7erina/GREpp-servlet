DROP TABLE IF EXISTS issue;
create table issue(
	id int(3) not null auto_increment,
	id_in_pool int(100) not null,
	frequence int(2) not null,
	passage varchar(1000) not null,
	question varchar(500) not null,
	answer varchar(2000) not null,
	answer_info varchar(3000) not null,
	catagory varchar(50) not null,
	history_date date not null,
	taken int(1) default 0,
	favourite int(1) default 0,
	primary key (id)
	)engine=InnoDB default charset=utf8;
	select * from issue;