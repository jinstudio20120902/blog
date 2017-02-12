create table tuser( 
userid primary key varchar(36),
用户名 varchar(30),
密码 varchar(30),
);

create table tarticle(
vc_articleid primary key varchar(36),
vc_title varchar(100),
vc_content varchar(20000),
c_type char(1),
vc_userid varchar(36)
);

create table tarticletype(
vc_typeid primary key varchar(36),
vc_typename varchar(10)
);