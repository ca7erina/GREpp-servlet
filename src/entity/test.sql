create table argument_catagory(
	category_id int(3) not null auto_increment,
	argument_type varchar(20),
	primary key category_id)
	)engine=InnoDB default charset=utf8;


insert into argument(id_in_pool,frequence,passage,question,answer,answer_info,catagory,examdate) values(1,1,'xx','xx','xx','xx','xx','2012-2-1');
insert into verbal(question,choice,answer,answer_info,history_date,frequence) values('xx','xx','xx','xx','2012-2-1',1);
select * from verbal;
select * from math;

ALTER TABLE issue modify answer_info varchar(3000);
select * from issue;
select * from argument;
select * from verbal;


AlTER TABLE reading add column taken varchar(1) default 0;
AlTER TABLE issue add column favourite varchar(1) default 0;
AlTER TABLE issue_pool add column favourite varchar(1) default 0;
AlTER TABLE argument add column favourite varchar(1) default 0;
AlTER TABLE argument_pool add column favourite varchar(1) default 0;
AlTER TABLE reading_verbal add column favourite varchar(1) default 0;








