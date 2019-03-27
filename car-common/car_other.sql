DROP DATABASE IF EXISTS car_other;
CREATE DATABASE car_other;
USE car_other;

#地区表Area
DROP TABLE IF EXISTS `Area`;
CREATE TABLE `Area`(
aId INT PRIMARY KEY AUTO_INCREMENT COMMENT '市编号',
aCity VARCHAR(20)NOT NULL COMMENT '市名称'
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#地区表插入数据
INSERT INTO `Area` VALUES
(NULL,'南京市'),
(NULL,'无锡市'),
(NULL,'徐州市'),
(NULL,'常州市'),
(NULL,'苏州市'),
(NULL,'南通市'),
(NULL,'连云港市'),
(NULL,'淮安市'),
(NULL,'盐城市'),
(NULL,'扬州市'),
(NULL,'镇江市'),
(NULL,'泰州市'),
(NULL,'宿迁市');


# 车辆系列信息表Model
DROP TABLE IF EXISTS Model;
CREATE TABLE Model(
moId INT PRIMARY KEY AUTO_INCREMENT COMMENT '车辆系列编号',
moBrand VARCHAR(20)NOT NULL COMMENT '车辆系列品牌',
moName VARCHAR(20)NOT NULL COMMENT '车辆系列名称'
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#车辆系列信息表插入数据
INSERT INTO Model VALUES
(NULL,'奥迪','奥迪A3')
,(NULL,'奥迪','奥迪Q3')
,(NULL,'奥迪','奥迪RS')
,(NULL,'本田','杰德')
,(NULL,'本田','飞度')
,(NULL,'本田','锋范')
,(NULL,'别克','威朗')
,(NULL,'别克','君威')
,(NULL,'别克','君越')
,(NULL,'大众','POLO')
,(NULL,'大众','桑塔纳')
,(NULL,'大众','捷达')
,(NULL,'丰田','凯美瑞')
,(NULL,'丰田','威驰')
,(NULL,'丰田','锐志')
,(NULL,'福特','嘉年华')
,(NULL,'福特','福克斯')
,(NULL,'福特','致胜')
,(NULL,'现代','瑞纳')
,(NULL,'现代','悦动')
,(NULL,'现代','伊兰特')
,(NULL,'雪佛兰','赛欧')
,(NULL,'雪佛兰','爱唯欧')
,(NULL,'雪佛兰','乐风');

# 车辆型号信息表Type
DROP TABLE IF EXISTS `Type`;
CREATE TABLE `Type`(
tId INT PRIMARY KEY AUTO_INCREMENT COMMENT '车辆型号编号',
tName VARCHAR(20)NOT NULL COMMENT '车辆型号名称'
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#车辆型号信息表插入数据
INSERT INTO `Type` VALUES
(NULL,'小型车'),
(NULL,'微型车'),
(NULL,'紧凑型车'),
(NULL,'中型车'),
(NULL,'中大型车'),
(NULL,'豪华车'),
(NULL,'MPV'),
(NULL,'SUV'),
(NULL,'跑车'),
(NULL,'皮卡');


# 网站动态信息表News
DROP TABLE IF EXISTS News;
CREATE TABLE News(
nsId INT PRIMARY KEY AUTO_INCREMENT COMMENT '网站动态编号',
nsTitle VARCHAR(20)NOT NULL COMMENT '网站动态标题',
nsSubTitle VARCHAR(20)NOT NULL COMMENT '网站动态副标题',
nsContent VARCHAR(300)NOT NULL COMMENT '网站动态内容',
nsPic VARCHAR(30)NOT NULL COMMENT '网站动态图片',
nsCreateTime VARCHAR(20)NOT NULL COMMENT '网站动态发布时间'
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#网站动态信息表插入数据
INSERT INTO News VALUES
(NULL,'二手车电商受资本青睐','万亿市场蓄势待发','近期二手车市场明显感觉到资本的热情和创业的热度。日前，二手车网络拍卖平台优信拍完成新一轮约２．６亿美元的巨额融资，让规模潜力达到万亿的市场再度成为资本竞逐的焦点。','tu1','2014-09-28 09:40:43')
,(NULL,'我国二手车行业现状分析','现状分析','随着经济的发展，汽车产业在国民经济的作用越来越明显，伴随着新车市场的成长，二手车市场也随之扩大。大力培育和发展二手车市场，既可以调动居民购车积极性，带动新车消费，又能增加税源，对促进汽车市场繁荣、对汽车产业和国民经济发展具有重要意义。','tu2','2015-09-28 07:40:23')
,(NULL,'二手车电商市场迎来高速增长','高速增长','中国汽车流通协会副秘书长沈荣在2014年中国汽车流通协会第四期月度形势分析会上指出，中国二手车电商市场在过去两年中呈现高速发展态势，不论是成交量还是交易金额，每个季度的同比增长率均超过100%','tu3','2015-01-20 06:20:45')
,(NULL,'首次迎来“五连跌”','9月30日油价或下调','继今年9月16日24时全国油价下调之后，近日国际原油价格持续下跌','tu4','2017-08-28 09:40:10')
,(NULL,'车企召回率排行榜','奔驰召回最少','根据统计机构数据，在美国市场市场，如果用召回车辆数量对比销量，30年来梅赛德斯-奔驰属于召回率最低的车企，而现代却是召回率最高者。','tu5','2019-01-28 19:40:43');



# 二手车问答表Question
DROP TABLE IF EXISTS Question;
CREATE TABLE Question(
quId INT PRIMARY KEY AUTO_INCREMENT COMMENT '二手车问答编号',
quQuestion VARCHAR(40)NOT NULL COMMENT '二手车问答问题',
quAnswer VARCHAR(200)NOT NULL COMMENT '二手车问答回答',
quCreateTime VARCHAR(20)NOT NULL COMMENT '二手车问答发布时间'
)ENGINE=INNODB DEFAULT CHARSET=utf8;

#二手车问答表插入数据
INSERT INTO Question VALUES
(NULL,'二手车强制险是否必要过户','建议还是去过户，如果有事故需要报保险不过户就还需要找原车主，因为受益人还是原车主，为避免不必要的麻烦，事前过户会方便的多。','2015-05-16 12:10:05')
,(NULL,'转让车没有购车发票行不行？','有车辆登记证书，购置税，保险单，行驶证就可以转让。','2015-05-26 12:10:05')
,(NULL,'什么车比较省油','省油是相对的，同排量，技术含量不同，油耗相差很大。一般来说，排量小的车子比较省油，如奥拓，夏利，豪情等。','2015-05-27 10:02:06')
,(NULL,'单车事故与双车事故有什么区别','所谓单车事故就是指在机动车发生的交通事故中，事故当事人仅机动车一方，无其他事故当事方的交通事故。在机动车保险关系中，单车事故还指无法找到相对方的机动车保险事故。双车事故即事故当事人双方均为机动车的交通事故。','2015-05-27 09:15:00')
,(NULL,'2驱和4驱什么区别','2驱就是两个轮子主动，剩下的轮子从动啦，打个比方，比如自行车，你脚一踩，带动的是后轮，前轮从动，这可以算是“后驱”，一般轿车都是前驱啦。  4驱，顾名思义，就是四个轮子一起转啦，比如越野车之类，四驱在雨雪天比较稳定，安全，不打滑，但是费油。','2015-07-12 15:01:15')


#select * from  Area
#select * from  Model
#select * from  Type
#select * from  News
#select * from Question



