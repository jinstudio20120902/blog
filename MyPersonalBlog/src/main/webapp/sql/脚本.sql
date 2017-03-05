/*创建用户*/
CREATE USER 'blog'@'localhost' IDENTIFIED BY 'blog';
/*授权*/
GRANT ALL ON *.* TO 'blog'@'localhost';

/*创建用户表*/
create table tuser( 
vc_userid  varchar(36) primary key not null,/*用户id*/
vc_username varchar(32) unique not null,/*用户名*/
vc_password varchar(32) not null/*密码*/
);

/*文章表*/
create table tarticle(
vc_articleid  varchar(36) primary key not null,/*文章Id*/
vc_articletitle varchar(100) not null,/*文章标题*/
vc_articlecontent varchar(20000),/*文章内容*/
c_articletype varchar(36) not null,/*文章类别*/
vc_userid varchar(36) not null,/*用户id*/
dt_createtime timestamp not null,/*创建时间*/
dt_publishtime timestamp not null/*发表时间*/
);

/*文章类别表*/
create table tarticletype(
vc_typeid  varchar(36) primary key not null ,/*类别id*/
vc_typename varchar(10) unique not null/*类型名称*/
);

INSERT INTO `tarticletype` VALUES ('0001', '原创');
INSERT INTO `tarticletype` VALUES ('0002', '转载');


/*文章标签表*/
create table tlable(
vc_lableid  varchar(36) primary key not null,/*标签id*/
vc_lablename varchar(10) unique not null/*标签名称*/
);
INSERT INTO `tlable` VALUES ('0005', 'java');
INSERT INTO `tlable` VALUES ('0001', 'Spring');
INSERT INTO `tlable` VALUES ('0002', '数据库');
INSERT INTO `tlable` VALUES ('0003', 'sql');
INSERT INTO `tlable` VALUES ('0004', 'Linux');

/*文章与标签关系表*/
create table tarticlelable(
vc_articleid varchar(36) not null,/*文章id*/
vc_lableid varchar(36) not null/*标签id*/
);

/*文章评论表*/
create table tcomment(
vc_commentid varchar(36) primary key not null,/*评论id*/
vc_articleid  varchar(36) not null,/*文章Id*/
vc_commentcontent varchar(500) not null,/*评论内容*/
dt_comenttime timestamp not null,/*评论时间*/
vc_visitor varchar(30) not null/*评论者*/
);