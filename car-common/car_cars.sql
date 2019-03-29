DROP DATABASE IF EXISTS car_cars;
CREATE DATABASE IF NOT EXISTS car_cars;
USE car_cars;


#二手车买卖车辆信息表
DROP TABLE IF EXISTS `CarBuy`;
CREATE TABLE IF NOT EXISTS `CarBuy`(
  `cbId` INT(11) NOT NULL AUTO_INCREMENT COMMENT '二手车买卖编号',
  `aId` INT(11) NOT NULL COMMENT '城市编号，外键',
  `mId` INT(11) NOT NULL COMMENT '品牌和车系编号，外键',
  `tId` INT(11) NOT NULL COMMENT '车型编号，外键',
  `cbMoney` DECIMAL(5,2) NOT NULL COMMENT '预售价格',
  `cbOfferMoney` DECIMAL(5,2) NOT NULL COMMENT '出厂报价',
  `cbPurchasetax` DECIMAL(5,2) NOT NULL COMMENT '购置税',
  `cbJieSheng` DECIMAL(5,2) NOT NULL COMMENT '为您节省',
  `cbColor` VARCHAR(100) NOT NULL COMMENT '车体颜色',
  `cbPaiLiang` VARCHAR(100) NOT NULL COMMENT '排量',
  `cbBianSu` VARCHAR(100) NOT NULL COMMENT '变速箱',
  `cbDate` VARCHAR(200) NOT NULL COMMENT '上牌时间',
  `cbLiCheng` VARCHAR(100) NOT NULL COMMENT '行驶里程',
  `cbNeiAndWai` VARCHAR(100)  NOT NULL COMMENT '国产进口',
  `cbBiaozhun` VARCHAR(100)  NOT NULL COMMENT '排放标准',
  `cbCompulsoryTime` VARCHAR(200)NOT NULL COMMENT '交强险到期时间',
  `cbValidity` VARCHAR(200)  NOT NULL COMMENT '年检有效期',
  `cbPicture1` VARCHAR(100) DEFAULT NULL COMMENT '车辆图片1',
  `cbPicture2` VARCHAR(100)  DEFAULT NULL COMMENT '车辆图片2',
  `cbPicture3` VARCHAR(100)  DEFAULT NULL COMMENT '车辆图片3',
  `cbPicture4` VARCHAR(100)  DEFAULT NULL COMMENT '车辆图片4',
  `cbDescribe` VARCHAR(255)  NOT NULL COMMENT '车辆描述',
  `cbPopular` INT(11) NOT NULL COMMENT '热门车辆（0为普通，1为热门）',
  `cbTime` VARCHAR(100) NOT NULL COMMENT '发布时间(默认使用当前系统时间)',
  `cbRecommend` INT(11) NOT NULL COMMENT '推荐车源（0为不推荐，1位推荐）',
  `uId` INT(11) NOT NULL COMMENT '用户id，外键',
  `cbState` INT(11) NOT NULL DEFAULT '1' COMMENT '二手车车辆状态（0车辆注销 1车辆正常 默认1 2已出售）',
  PRIMARY KEY (`cbId`)
) CHARSET=utf8;



INSERT  INTO `carbuy` VALUES 
(1,1,1,1,'12.30','15.20','0.45','2.90','蓝色','1.3T','手自一体','2017-2-3','1.4','国产','国五','2019-4-2','2019-5-2',NULL,NULL,NULL,NULL,'舒适，操控感好',0,'2019-03-26 17:37:44',0,1,1),
(2,2,2,2,'14.50','15.50','0.65','1.00','白色','1.5T','自动','2018-2-3','2.3','国产','国五','2019-3-5','2019-5-7',NULL,NULL,NULL,NULL,'好开',1,'2019-03-26 17:48:07',1,2,1),
(3,3,3,3,'16.60','18.60','0.89','2.00','粉色','2.0T','手动','2018-3-2','1.6','进口','国五','2019-3-2','2019-4-3',NULL,NULL,NULL,NULL,'舒服，没有出过事故',1,'2019-03-26 17:48:04',0,3,1),
(4,4,4,4,'18.90','20.80','1.10','2.10','黑色','2.3T','手自一体','2018-7-2','0.9','国产','国五','2019-4-3','2019-6-2',NULL,NULL,NULL,NULL,'百公里7秒以内',1,'2019-03-26 17:50:24',1,4,1),
(5,5,5,5,'20.90','22.90','1.20','2.00','红色','3.0T','自动','2018-3-2','1.2','进口','国五','2019-6-2','2019-4-6',NULL,NULL,NULL,NULL,'百公里6秒以内',0,'2019-03-26 17:52:57',1,5,0);




#二手车租赁车辆信息表
DROP TABLE IF EXISTS `CarRent`;
CREATE TABLE `CarRent` (
  `crId` INT(11) NOT NULL AUTO_INCREMENT COMMENT '租用车辆编号',
  `aId` INT(11) NOT NULL COMMENT '城市编号,外键',
  `mId` INT(11) NOT NULL COMMENT '品牌车系编号，外键',
  `tId` INT(11) NOT NULL COMMENT '车型编号，外键',
  `crDateMoney` VARCHAR(200) NOT NULL COMMENT'日租金',
  `crMonMoney` VARCHAR(200) NOT NULL COMMENT'月租金',
  `crPicture1` VARCHAR(30) DEFAULT NULL COMMENT'车辆图片01',
  `crPicture2` VARCHAR(30) DEFAULT NULL COMMENT'车辆图片02',
  `crPicture3` VARCHAR(30) DEFAULT NULL COMMENT'车辆图片03',
  `crDescribe` VARCHAR(200) NOT NULL COMMENT'补充描述',
  `crTime` VARCHAR(30) NOT NULL COMMENT'发布时间',
  `uId` INT(11) NOT NULL COMMENT'用户id 外键',
  `crState` INT(11) NOT NULL DEFAULT '1' COMMENT '租用车辆状态，0车辆注销 1车辆正常 默认1',
  PRIMARY KEY (`crId`)
) CHARSET=utf8;


INSERT  INTO `CarRent` VALUES (1,1,1,1,'100','2000',NULL,NULL,NULL,'省油','2019-2-3',1,1),
(2,2,2,2,'80','1800',NULL,NULL,NULL,'好开','2019-1-3',2,1),
(3,3,3,3,'100','2500',NULL,NULL,NULL,'省油','2018-12-3',3,1),
(4,4,4,4,'130','2600',NULL,NULL,NULL,'开心好用','2019-3-3',4,1),
(5,5,5,5,'100','2900',NULL,NULL,NULL,'省油','2019-3-13',5,0);



DROP TABLE IF EXISTS `PingGu`;
CREATE TABLE `PingGu` (
  `pgId` INT(11) NOT NULL AUTO_INCREMENT COMMENT '评估车源编号',
  `mId` INT(11) NOT NULL COMMENT '品牌车系编号,外键',
  `tId` INT(11) NOT NULL COMMENT '车型编号，外键',
  `pgDate` VARCHAR(30) NOT NULL COMMENT '上牌日期',
  `pgLicheng` VARCHAR(30) NOT NULL COMMENT '行驶里程',
  `pgPhone` VARCHAR(20) NOT NULL COMMENT '手机',
  `pgTime` VARCHAR(30) NOT NULL COMMENT '发布时间',
  `pgPrice` DECIMAL(5,2) NOT NULL COMMENT '评估后价格',
  PRIMARY KEY (`pgId`)
) CHARSET=utf8;


INSERT  INTO `PingGu` VALUES (1,1,2,'2018-3-2','1.1','13523546738','2019-03-26 20:27:19','12.50'),
		(2,2,1,'2018-6-2','1.6','13523646738','2019-03-26 20:27:19','16.00'),
		(3,3,1,'2018-5-2','0.8','13523587738','2019-01-03 00:00:00','15.00'),
		(4,4,5,'2018-7-2','1.5','13523598738','2019-03-26 20:27:19','19.00');


