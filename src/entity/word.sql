DROP TABLE IF EXISTS word;
create table word(
	id int(3) not null auto_increment,
	location varchar(50) default null,
	frequence int(2) default 0,
	spell varchar(30) not null,
	example_sentence varchar(500) default null,
	meaning varchar(100) default null,
	linksrc varchar(300) default null,
	history_date date not null,
	favourite int(1) default 0,
	primary key (id)
	)engine=InnoDB default charset=utf8;
	select * from word;
	insert into word(location,frequence,spell,meaning,linksrc,history_date,favourite) values("",0,"deprecated","v.不赞成的;","http://dict.youdao.com/search?le=eng&q=deprecated&keyfrom=dict.index","2013-2-19",0);


//alter table word change linksource  linksrc varchar(300) default "";