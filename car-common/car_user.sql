DROP DATABASE IF EXISTS car_user;
CREATE DATABASE IF NOT EXISTS car_user;
USE car_user;

#个人用户信息表
DROP TABLE IF EXISTS `User`;
CREATE TABLE IF NOT EXISTS `User`(
    uId INT PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '个人用户信息编号,主键',
    uloginName VARCHAR(20)NOT NULL COMMENT '用户名',
    uPwd VARCHAR(20)NOT NULL  COMMENT '用户密码',
    uEmail VARCHAR(20)NOT NULL COMMENT '邮箱地址',
    uPerson VARCHAR(20)NOT NULL COMMENT '联系人',
    uPhone VARCHAR(20)NOT NULL COMMENT '手机号码',
    uPicture VARCHAR(20) COMMENT '头像地址',
    uCity VARCHAR(20) COMMENT '城市',
    uVipSign INT  COMMENT '会员标记,0非会员 1会员  会员可以发布租车',
    uIdent INT COMMENT '车行认证,0.未认证 1.认证  认证通过 可以发布车行信息',
    uState  INT COMMENT '用户状态,0用户注销 1用户正常 默认1'
)CHARSET=utf8;

INSERT INTO `User`
VALUES(NULL,'111111','111111','111@163.com','张三','13611111111','static/images/张三.jpg','徐州',1,1,1);
INSERT INTO USER
VALUES(NULL,'222222','222222','222@163.com','李四','13622222222','static/images/李四.jpg','南京',1,0,1);
INSERT INTO USER
VALUES(NULL,'333333','333333','333@163.com','王五','13633333333','static/images/王五jpg','苏州',0,1,1);
INSERT INTO USER
VALUES(NULL,'444444','444444','444@163.com','赵六','13644444444','static/images/赵六.jpg','宿迁',0,1,0);
INSERT INTO USER
VALUES(NULL,'555555','555555','555@163.com','周七','13655555555','static/images/周七.jpg','苏州',0,0,0);

#SELECT *FROM USER;


#会员表，vip会员表（VIP）
DROP TABLE IF EXISTS VIP;
CREATE TABLE IF NOT EXISTS VIP(
     vId INT PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '会员编号,主键，主键，自增,非空',
     uId INT NOT NULL COMMENT '用户编号,外键非空',
     vStart VARCHAR(20) COMMENT '充值时间',
     vEnd VARCHAR(20) COMMENT '到期时间'
)CHARSET=utf8;


INSERT INTO VIP
VALUES(NULL,1,'2019-03-22 09:47:19','2019-04-22 09:47:19');
INSERT INTO VIP
VALUES(NULL,2,'2019-03-26 17:19:19','2019-04-26 17:19:19');

#SELECT *FROM VIP;



#管理员信息表（Manager）
DROP TABLE IF EXISTS Manager;
CREATE TABLE IF NOT EXISTS Manager(
   `mId` INT PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '管理员编号,主键',
   mName VARCHAR(20)NOT NULL COMMENT '管理员用户名',
   mPwd VARCHAR(20) NOT NULL COMMENT '管理员密码',
   mEmail VARCHAR(20) NOT NULL COMMENT '邮箱',
   mPhone VARCHAR(20) NOT NULL COMMENT '手机',
   mQuanXian INT NOT NULL COMMENT '权限 0 普通管理员 1 超级管理员'
)CHARSET=utf8;


INSERT INTO Manager
VALUES(NULL,'root','root','xxx@111.com','13111111111',1);
INSERT INTO Manager
VALUES(NULL,'ok','ok','xxx@222.com','13122222222',0);
INSERT INTO Manager
VALUES(NULL,'admin','admin','xxx@333.com','13133333333',0);

#SELECT *FROM Manager;

