create database blog;

use blog;

create table users (
    id int primary key auto_increment,
   name varchar(30),
   age int
);

insert into users (name, age) values ('Sanyi', 30);

select * from users;

insert into users (name, age) values ('Gabo', 45);
insert into users (name, age) values ('Zoli', 38);


create table posts (
    id int primary key auto_increment,
    title varchar (100),
    content text,
    author_id int
);

insert into posts (title, content, author_id)
values ('New blogpost', 'Nice new blogpost', 1);

insert into posts (title, content, author_id)
values ('Second blogpost', 'Update', 1);

insert into posts (title, content, author_id)
values ('Daily news', 'What happened', 2);

select * from users
inner join posts on posts.author_id = users.id;

select name, count(posts.id) from users
left join posts on posts.author_id = users.id
group by users.name
order by users.name;

update posts
set content = 'This is an update' where id = 2;

delete from posts where id=2;

select * from posts;