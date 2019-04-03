/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.6.43-log : Database - car_cars
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`car_cars` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `car_cars`;

/*Table structure for table `carbuy` */

DROP TABLE IF EXISTS `carbuy`;

CREATE TABLE `carbuy` (
  `cbId` int(11) NOT NULL AUTO_INCREMENT COMMENT '二手车买卖编号',
  `aId` int(11) NOT NULL COMMENT '城市编号，外键',
  `mId` int(11) NOT NULL COMMENT '品牌和车系编号，外键',
  `tId` int(11) NOT NULL COMMENT '车型编号，外键',
  `cbMoney` decimal(5,2) NOT NULL COMMENT '预售价格',
  `cbOfferMoney` decimal(5,2) NOT NULL COMMENT '出厂报价',
  `cbPurchasetax` decimal(5,2) NOT NULL COMMENT '购置税',
  `cbJieSheng` decimal(5,2) NOT NULL COMMENT '为您节省',
  `cbColor` varchar(100) NOT NULL COMMENT '车体颜色',
  `cbPaiLiang` varchar(100) NOT NULL COMMENT '排量',
  `cbBianSu` varchar(100) NOT NULL COMMENT '变速箱',
  `cbDate` varchar(200) NOT NULL COMMENT '上牌时间',
  `cbLiCheng` varchar(100) NOT NULL COMMENT '行驶里程',
  `cbNeiAndWai` varchar(100) NOT NULL COMMENT '国产进口',
  `cbBiaozhun` varchar(100) NOT NULL COMMENT '排放标准',
  `cbCompulsoryTime` varchar(200) NOT NULL COMMENT '交强险到期时间',
  `cbValidity` varchar(200) NOT NULL COMMENT '年检有效期',
  `cbPicture1` varchar(200) DEFAULT NULL COMMENT '车辆图片1',
  `cbPicture2` varchar(200) DEFAULT NULL COMMENT '车辆图片2',
  `cbPicture3` varchar(200) DEFAULT NULL COMMENT '车辆图片3',
  `cbPicture4` varchar(200) DEFAULT NULL COMMENT '车辆图片4',
  `cbDescribe` varchar(255) NOT NULL COMMENT '车辆描述',
  `cbPopular` int(11) NOT NULL COMMENT '热门车辆（0为普通，1为热门）',
  `cbTime` varchar(100) NOT NULL COMMENT '发布时间(默认使用当前系统时间)',
  `cbRecommend` int(11) NOT NULL COMMENT '推荐车源（0为不推荐，1位推荐）',
  `uId` int(11) NOT NULL COMMENT '用户id，外键',
  `cbState` int(11) NOT NULL DEFAULT '1' COMMENT '二手车车辆状态（0车辆注销 1车辆正常 2已出售 默认1）',
  `cbName` varchar(255) NOT NULL,
  PRIMARY KEY (`cbId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `carbuy` */

insert  into `carbuy`(`cbId`,`aId`,`mId`,`tId`,`cbMoney`,`cbOfferMoney`,`cbPurchasetax`,`cbJieSheng`,`cbColor`,`cbPaiLiang`,`cbBianSu`,`cbDate`,`cbLiCheng`,`cbNeiAndWai`,`cbBiaozhun`,`cbCompulsoryTime`,`cbValidity`,`cbPicture1`,`cbPicture2`,`cbPicture3`,`cbPicture4`,`cbDescribe`,`cbPopular`,`cbTime`,`cbRecommend`,`uId`,`cbState`,`cbName`) values (1,1,1,1,'12.30','15.20','0.45','2.90','白色','1.3L','手自一体','2017-2-3','1.4','国产','国五','2019-4-2','2019-5-2','images/timg(4).jpg','images/28424114_1383836347947_800x600.jpg','images/29459536_1386578455109_800x600.jpg','images/29459536_1386578457937_800x600.jpg','舒适，操控感好',0,'2019-03-26 17:37:44',0,1,1,'大众 朗逸 2014 款 1.4TSI运动版'),(2,2,2,5,'30.00','50.00','10.00','30.00','黑色','1.8L','自动','2017-2-3','1.8','进口','国五','2019-3-5','2019-5-7','images/aodi2.jpg','images/37766977_3.jpg','images/37766977.jpg','images/32323.jpg','空间，动力平顺，内饰风格比较时尚',1,'2015-08-20',1,2,1,'奥迪A6L 2017款 TFSI 舒适型'),(3,3,3,4,'26.50','35.80','8.50','10.20','白色','2.0L','自动','2016-5-2','1.6','进口','国五','2019-3-2','2019-4-3','images/timg.jpg','images/800x0_1_q87_autohomecar__wKjBz1dQBRGANvUeAARDmWYZJ6g483.jpg','images/800x0_1_q87_autohomecar__wKjBzFdQBQuAL4WDAAS3ORGYNsg857.jpg','images/800x0_1_q87_autohomecar__wKgH0ldQBR2AANHgAASoCKFxP14276.jpg','空间不错，后备箱容积不错，门上也可以挂东西',1,'2019-03-26 17:48:04',0,3,1,'奔驰C级 2016款 C 200 运动版'),(4,4,4,4,'18.00','23.20','9.90','3.20','白色','3.6L','手自一体','2018-7-2','3.0','国产','国五','2019-4-3','2019-6-2','images/16965778_16965778_1356680509578_800x600.jpg','images/800x0_1_q87_20111025155540685240.jpg','images/800x0_1_q87_20111025155132294240.jpg','images/800x0_1_q87_20111025155521466240.jpg','百公里7秒以内',1,'2019-03-26 17:50:24',1,4,1,'大众CC 2012款 3.6FSI R-Line'),(5,5,5,2,'2.20','4.51','0.89','2.30','白色','1.0L','手动','2018-3-2','1.0','国产','国四','2019-6-2','2019-4-6','images/23299034_23299034_1466761236977_800x600.jpg','images/23299034_23299034_1466761245535_800x600.jpg','images/23299034_23299034_1466761241983_800x600.jpg','images/23299034_23299034_1466761248128_800x600.jpg','驾驶感觉还不错，咱也不是赛车手，感觉操控已经够了，想拐拐，想超超，非常灵活，给力~~~',0,'2019-03-26 17:52:57',1,5,0,'吉利汽车 熊猫 2016款 1.0L 手动萌动版'),(6,5,5,2,'2.20','4.51','0.89','2.30','白色','1.0L','手动','2013-3-2','3.2','国产','国四','2019-5-2','2019-6-6','/upload/image/20141010/20141010172034_31303_small.jpg','/upload/image/20141010/20141010172034_31303.jpg','/upload/image/20141010/20141010172037_25056.jpg','/upload/image/20141010/20141010172045_71946.jpg','驾驶感觉还不错，咱也不是赛车手，感觉操控已经够了，想拐拐，想超超，非常灵活，给力~~~',0,'2019-04-26',1,3,2,'长安 逸动 2014款 1.5T 自动运动豪华型');

/*Table structure for table `carrent` */

DROP TABLE IF EXISTS `carrent`;

CREATE TABLE `carrent` (
  `crId` int(11) NOT NULL AUTO_INCREMENT COMMENT '租用车辆编号',
  `aId` int(11) NOT NULL COMMENT '城市编号,外键',
  `mId` int(11) NOT NULL COMMENT '品牌车系编号，外键',
  `tId` int(11) NOT NULL COMMENT '车型编号，外键',
  `crDateMoney` varchar(200) NOT NULL COMMENT '日租金',
  `crMonMoney` varchar(200) NOT NULL COMMENT '月租金',
  `crPicture1` varchar(200) DEFAULT NULL COMMENT '车辆图片01',
  `crPicture2` varchar(200) DEFAULT NULL COMMENT '车辆图片02',
  `crPicture3` varchar(200) DEFAULT NULL COMMENT '车辆图片03',
  `crPicture4` varchar(200) DEFAULT NULL COMMENT '车辆图片04',
  `crPicture5` varchar(200) DEFAULT NULL COMMENT '车辆图片05',
  `crDescribe` varchar(200) NOT NULL COMMENT '补充描述',
  `crTime` varchar(30) NOT NULL COMMENT '发布时间',
  `uId` int(11) NOT NULL COMMENT '用户id 外键',
  `crState` int(11) NOT NULL DEFAULT '1' COMMENT '租用车辆状态，0车辆注销 1车辆正常 默认1',
  `crName` varchar(255) NOT NULL,
  `crType` varchar(255) NOT NULL,
  PRIMARY KEY (`crId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `carrent` */

insert  into `carrent`(`crId`,`aId`,`mId`,`tId`,`crDateMoney`,`crMonMoney`,`crPicture1`,`crPicture2`,`crPicture3`,`crPicture4`,`crPicture5`,`crDescribe`,`crTime`,`uId`,`crState`,`crName`,`crType`) values (1,1,1,1,'100','2000','images/dabache.jpg','images/dabache1.jpg','images/dabache2.jpg','images/dabache3.jpg','images/dabache5.jpg','省油','2019-2-3',1,1,'专业大巴车出租大客车租赁11座22座等本月特惠','大巴车出租大客车租赁11座22座'),(2,2,2,2,'80','1800','images/estate-feature.jpg','images/baoma5.jpg','images/aodiq5.jpg','images/29427189.JPG','inages/baoma8.jpg','好开','2019-1-3',2,1,'组团租车有优惠，八五折','奔驰C级、宝马5系和奥迪Q5等豪华品牌'),(3,3,3,3,'100','2500','images/jinbei.jpg','images/10242154702393_3317047_16.jpg','images/jinbei2.jpg','images/jinbei4.jpg','images/jinbei5.jpg','省油','2018-12-3',3,1,'西二旗出租金杯车业务','金杯海狮H2L,金杯阁瑞斯MPV,金杯商务车等等'),(4,4,4,4,'130','2600','images/binrui.jpg','images/binrui1.jpg','images/binrui2.jpg','images/binrui3.jpg','images/binrui4.jpg','开心好用','2019-3-3',4,1,'1234567','吉利缤瑞2018款 200T DCT缤耀版'),(5,5,5,5,'100','2900','images/al1.jpg','images/al2.jpg','images/al3.jpg','images/al4.jpg','images/al5.jpg','省油','2019-3-13',5,0,'8901233444','阿尔法·罗密欧 156 2004 款 156 2.0');

/*Table structure for table `pinggu` */

DROP TABLE IF EXISTS `pinggu`;

CREATE TABLE `pinggu` (
  `pgId` int(11) NOT NULL AUTO_INCREMENT COMMENT '评估车源编号',
  `mId` int(11) NOT NULL COMMENT '品牌车系编号,外键',
  `tId` int(11) NOT NULL COMMENT '车型编号，外键',
  `pgDate` varchar(30) NOT NULL COMMENT '上牌日期',
  `pgLicheng` varchar(30) NOT NULL COMMENT '行驶里程',
  `pgPhone` varchar(20) NOT NULL COMMENT '手机',
  `pgTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `pgPrice` decimal(5,2) NOT NULL COMMENT '评估后价格',
  PRIMARY KEY (`pgId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `pinggu` */

insert  into `pinggu`(`pgId`,`mId`,`tId`,`pgDate`,`pgLicheng`,`pgPhone`,`pgTime`,`pgPrice`) values (1,1,2,'2018-3-2','1.1','13523546738','2019-03-26 20:27:19','12.50'),(2,2,1,'2018-6-2','1.6','13523646738','2019-03-26 20:27:19','16.00'),(3,3,1,'2018-5-2','0.8','13523587738','2019-01-03 00:00:00','15.00'),(4,4,5,'2018-7-2','1.5','13523598738','2019-03-26 20:27:19','19.00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
