
create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

insert into category (id,name) values ( 1,'First-Person Shooter' );

insert into category (id,name) values ( 2,'Role Playing Game' );

insert into category (id,name) values ( 3,'Real Time Strategy' );

insert into category (id,name) values ( 4,'Puzzle' );

insert into category (id,name) values ( 5,'Horror' );

insert into category (id,name) values ( 6,'Racing' );

insert into category (id,name) values ( 7,'Third Person Shooter' );

insert into category (id,name) values ( 8,'Platformer' );

drop table if exists category;