/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.0.45-community-nt : Database - aiviy
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`aiviy` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `aiviy`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `ad_id` int(8) NOT NULL COMMENT '地址编号',
  `ad_address` varchar(55) default NULL COMMENT '收货地址',
  `ad_phone` varchar(11) default NULL COMMENT '收货人电话',
  `ad_user` varchar(20) default NULL COMMENT '收货人姓名',
  `user_id` int(8) default NULL COMMENT '用户id',
  PRIMARY KEY  (`ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `address` */

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `c_id` int(8) NOT NULL COMMENT '评论编号（自增）',
  `c_comment` varchar(255) default NULL COMMENT '评论内容',
  `user_id` int(8) default NULL COMMENT '用户id',
  `g_id` int(8) default NULL COMMENT '商品编号',
  PRIMARY KEY  (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `g_id` int(8) NOT NULL COMMENT '商品编号',
  `g_name` varchar(35) default NULL COMMENT '商品名',
  `g_price` double default NULL COMMENT '商品价格',
  `g_content` varchar(255) default NULL COMMENT '商品描述',
  PRIMARY KEY  (`g_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

/*Table structure for table `image` */

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
  `img_id` int(8) NOT NULL COMMENT '图片编号',
  `img_url` varchar(255) default NULL COMMENT '图片路径',
  `g_id` int(8) default NULL COMMENT '商品编号',
  PRIMARY KEY  (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `image` */

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `v_id` int(1) NOT NULL COMMENT '会员等级（1、2、3、4）',
  `v_name` varchar(4) default NULL COMMENT '等级描述',
  `v_count` double default NULL COMMENT '折扣',
  PRIMARY KEY  (`v_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `member` */

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `o_id` int(8) NOT NULL COMMENT '订单自增id',
  `o_no` int(8) default NULL COMMENT '订单号',
  `o_state` int(1) default NULL COMMENT '订单状态',
  `o_num` int(3) default NULL COMMENT '商品数量',
  `g_id` int(8) default NULL COMMENT '商品id',
  PRIMARY KEY  (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(8) NOT NULL auto_increment COMMENT '自增id',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `user_mail` varchar(35) default NULL COMMENT '邮箱',
  `user_phone` varchar(11) default NULL COMMENT '电话号码',
  `user_pwd` varchar(20) default NULL COMMENT '密码',
  `user_money` double default NULL COMMENT '消费金额',
  `nickname` varchar(20) default NULL COMMENT '昵称',
  `v_id` int(8) default NULL COMMENT '会员id',
  PRIMARY KEY  (`user_id`,`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
