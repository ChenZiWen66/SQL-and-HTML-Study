show tables ;
select * from user;
desc user;
insert into user(username, password) VALUE ("czw1","passw1");
insert into user(username, password) VALUE ("czw2","passw2");
insert into user(username, password) VALUE ("czw3","passw3");
insert into user(username, password) VALUE ("czw4","passw4");
insert into user(username, password) VALUE ("czw5","passw5");
insert into user(username, password) VALUE ("czw6","passw6");
insert into user(username, password) VALUE ("czw7","passw7");
insert into user(username, password) VALUE ("czw8","passw8");
insert into user(username, password) VALUE ("czw9","passw9");
insert into user(username, password) VALUE ("czw10","passd10");
insert into user(username, password) VALUE ("czw11","passd11");

select username,password
from user
where username='czw1'&&password='passw1';
