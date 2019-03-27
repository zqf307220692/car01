#创建车行数据库
DROP DATABASE IF EXISTS car_chehang;
CREATE DATABASE  IF NOT EXISTS car_chehang;
USE car_chehang;


#车行信息表
DROP TABLE IF EXISTS Garage;
CREATE TABLE IF NOT EXISTS  Garage(	
	gId INT PRIMARY KEY AUTO_INCREMENT COMMENT '车行编号',
	gName VARCHAR (20) NOT NULL COMMENT '车行名称',
	gPerson VARCHAR(10) NOT NULL COMMENT '联系人',
	gSaleName  VARCHAR(20) COMMENT '销售代表名称',
	gSalePicture VARCHAR(30) COMMENT '销售代表图片地址',
	gSalePhone VARCHAR(20) COMMENT '销售代表电话',
	gTel VARCHAR(20) COMMENT '车行固定电话',
	gPhone VARCHAR(20) NOT NULL COMMENT '车行手机号码',
	gAddress VARCHAR(50) NOT NULL COMMENT '车行地址',
	gIntroduce VARCHAR(100) COMMENT '车行简介',
	gPicture VARCHAR(30) COMMENT '车行Logo图片',
	gBusinessId INT NOT NULL COMMENT '用户id 外键',
	gState INT NOT NULL COMMENT '车行状态  0车行注销 1车行正常 默认1'
)CHARSET utf8;


#插入信息
INSERT INTO  Garage
VALUES(NULL,'诚信二手车','张三','张三三','static/images/001.jpg','13711111111','0516-11111111','13811111111','北京市东城区','&nbsp;&nbsp;&nbsp;公司始终坚持“诚信为本、客户至上、以专业高效体现优质服务”的经营理念，
	热忱为顾客提供从购车、用车、售后服务及车辆年审等全方位、高质量的服务。“以人为本，客户至上”的企业宗旨，始终把消费者的利益放在第一位，推行“比你更关心你”的客户关怀，以百年的别克品牌、
	高质量的产品、优质周到的售后服务，赢到广大消费者的信赖。','static/images/01.jpg',1,1),
	(NULL,'优信二手车','李四','李四四','static/images/002.jpg','13722222222','0516-22222222','13822222222','北京市海淀区','&nbsp;&nbsp;&nbsp;公司始终坚持“诚信为本、客户至上、以专业高效体现优质服务”的经营理念，
	热忱为顾客提供从购车、用车、售后服务及车辆年审等全方位、高质量的服务。“以人为本，客户至上”的企业宗旨，始终把消费者的利益放在第一位，推行“比你更关心你”的客户关怀，以百年的别克品牌、
	高质量的产品、优质周到的售后服务，赢到广大消费者的信赖。','static/images/02.jpg',2,1),
	(NULL,'瓜子二手车','王五','王五五','static/images/003.jpg','13733333333','0516-33333333','13833333333','江苏省徐州市泉山区','&nbsp;&nbsp;&nbsp;公司始终坚持“诚信为本、客户至上、以专业高效体现优质服务”的经营理念，
	热忱为顾客提供从购车、用车、售后服务及车辆年审等全方位、高质量的服务。“以人为本，客户至上”的企业宗旨，始终把消费者的利益放在第一位，推行“比你更关心你”的客户关怀，以百年的别克品牌、
	高质量的产品、优质周到的售后服务，赢到广大消费者的信赖。','static/images/03.jpg',3,1),
	(NULL,'西门二手车','赵六','赵六六','static/images/004.jpg','13744444444','0516-44444444','13844444444','上海市黄埔区','&nbsp;&nbsp;&nbsp;公司始终坚持“诚信为本、客户至上、以专业高效体现优质服务”的经营理念，
	热忱为顾客提供从购车、用车、售后服务及车辆年审等全方位、高质量的服务。“以人为本，客户至上”的企业宗旨，始终把消费者的利益放在第一位，推行“比你更关心你”的客户关怀，以百年的别克品牌、
	高质量的产品、优质周到的售后服务，赢到广大消费者的信赖。','static/images/04.jpg',4,1),
	(NULL,'九成新二手车','周七','周七七','static/images/005.jpg','13755555555','0516-55555555','13855555555','江苏省徐州市鼓楼区','&nbsp;&nbsp;&nbsp;公司始终坚持“诚信为本、客户至上、以专业高效体现优质服务”的经营理念，
	热忱为顾客提供从购车、用车、售后服务及车辆年审等全方位、高质量的服务。“以人为本，客户至上”的企业宗旨，始终把消费者的利益放在第一位，推行“比你更关心你”的客户关怀，以百年的别克品牌、
	高质量的产品、优质周到的售后服务，赢到广大消费者的信赖。','static/images/05.jpg',5,1);


#select * from Garage

#车行留言表
#DROP TABLE IF EXISTS GarageQuestion;
#CREATE TABLE IF NOT EXISTS  GarageQuestion(	
	#gqId INT PRIMARY KEY AUTO_INCREMENT,#车行留言编号
	#gqName VARCHAR (20) NOT NULL,#留言人姓名
	#gqContext VARCHAR(50) NOT NULL,#留言内容
	#gqPhone  VARCHAR(20) ,#留言人电话
	#gId VARCHAR(30) ,#车行编号id 外键
	#gTime VARCHAR(30) ,#留言创建时间 系统时间
	#gqState	INT NOT NULL #车行留言状态  0留言注销 1留言正常 默认1
#)CHARSET utf8;


#插入信息
#INSERT INTO  GarageQuestion
#VALUES(NULL,'卢克肖','&nbsp;好，很好，非常好','15011111111',1,'2017-11-22 09:47:19',1),
	#(NULL,'德赫亚','&nbsp;不好，很不好，非常不好','15022222222',2,'2018-11-02 09:47:19',1),
	#(NULL,'博格巴','&nbsp;好，很好，非常好','15033333333',3,'2011-11-22 10:47:19',1),
	#(NULL,'斯莫林','&nbsp;好，很好，非常好','15044444444',4,'2013-12-22 10:47:19',1),
	#(NULL,'埃雷拉','&nbsp;不好，很不好，非常不好','15055555555',5,'2007-12-22 09:47:19',1);


#select * from GarageQuestion






