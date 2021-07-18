/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : car

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2021-07-18 18:20:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_car
-- ----------------------------
DROP TABLE IF EXISTS `tb_car`;
CREATE TABLE `tb_car` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `license_plate` varchar(64) NOT NULL DEFAULT '' COMMENT '车牌',
  `brand` varchar(64) NOT NULL DEFAULT '' COMMENT '品牌',
  `model` varchar(64) NOT NULL DEFAULT '' COMMENT '型号',
  `colour` varchar(64) NOT NULL DEFAULT '' COMMENT '颜色',
  `buy_time` datetime NOT NULL COMMENT '购买日期',
  `price` decimal(10,2) NOT NULL COMMENT '价格(单价万)',
  `customer_id` int(11) unsigned NOT NULL COMMENT '客户id',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_car
-- ----------------------------
INSERT INTO `tb_car` VALUES ('1', '鄂50026', '宝马', 'x7', '黑色', '2021-04-11 17:49:10', '100000.00', '1', '', '2021-04-11 17:49:22', '2021-04-11 17:49:22');

-- ----------------------------
-- Table structure for tb_car_repair
-- ----------------------------
DROP TABLE IF EXISTS `tb_car_repair`;
CREATE TABLE `tb_car_repair` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `fault_reason_dict_id` int(4) unsigned NOT NULL COMMENT '故障原因编码id',
  `price` decimal(10,2) NOT NULL COMMENT '价格',
  `customer_id` int(11) unsigned NOT NULL COMMENT '客户id',
  `car_id` int(11) unsigned NOT NULL COMMENT '汽车id',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_fault_reason_dict_id` (`fault_reason_dict_id`),
  KEY `idx_customer_id` (`customer_id`),
  KEY `idx_car_id` (`car_id`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_car_repair
-- ----------------------------
INSERT INTO `tb_car_repair` VALUES ('1', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('2', '2', '2000.00', '2', '2', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('3', '3', '3000.00', '3', '3', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('4', '4', '4000.00', '4', '4', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('5', '5', '5000.00', '5', '5', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('6', '6', '6000.00', '6', '6', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('7', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('8', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('9', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('10', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('11', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('12', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('13', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('14', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('15', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('16', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('17', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('18', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('19', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('20', '1', '1000.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');
INSERT INTO `tb_car_repair` VALUES ('21', '7', '1111.00', '1', '1', '', '2021-04-11 18:08:41', '2021-04-11 18:08:41');

-- ----------------------------
-- Table structure for tb_car_wash
-- ----------------------------
DROP TABLE IF EXISTS `tb_car_wash`;
CREATE TABLE `tb_car_wash` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `price` decimal(10,2) NOT NULL COMMENT '价格',
  `customer_id` int(11) unsigned NOT NULL COMMENT '客户id',
  `car_id` int(11) unsigned NOT NULL COMMENT '汽车id',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_customer_id` (`customer_id`),
  KEY `idx_car_id` (`car_id`),
  KEY `idx_create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_car_wash
-- ----------------------------
INSERT INTO `tb_car_wash` VALUES ('1', '100.00', '1', '1', '我是第一辆车', '2021-04-11 17:46:42', '2021-04-11 17:46:42');

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(128) NOT NULL DEFAULT '' COMMENT '姓名',
  `nickname` varchar(128) NOT NULL DEFAULT '' COMMENT '昵称',
  `age` int(2) unsigned NOT NULL DEFAULT '0' COMMENT '年龄',
  `sex` bit(1) NOT NULL DEFAULT b'1' COMMENT '性别',
  `has_marry` bit(1) NOT NULL DEFAULT b'1' COMMENT '已婚',
  `phone1` varchar(64) NOT NULL DEFAULT '' COMMENT '电话1',
  `phone2` varchar(64) NOT NULL DEFAULT '' COMMENT '电话2',
  `phone3` varchar(64) NOT NULL DEFAULT '' COMMENT '电话3',
  `wechat` varchar(64) NOT NULL DEFAULT '' COMMENT '微信',
  `qq` varchar(64) NOT NULL DEFAULT '' COMMENT 'QQ',
  `other_contacts1` varchar(128) NOT NULL DEFAULT '' COMMENT '其他联系人1',
  `other_contacts2` varchar(128) NOT NULL DEFAULT '' COMMENT '其他联系人2',
  `address` varchar(255) NOT NULL DEFAULT '' COMMENT '住址',
  `company` varchar(128) NOT NULL DEFAULT '' COMMENT '公司',
  `company_address` varchar(255) NOT NULL DEFAULT '' COMMENT '公司地址',
  `occupation` varchar(128) NOT NULL DEFAULT '' COMMENT '职业',
  `salary` varchar(128) NOT NULL DEFAULT '' COMMENT '薪资',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`),
  KEY `idx_nickname` (`nickname`),
  KEY `idx_phone1` (`phone1`),
  KEY `idx_other_contacts1` (`other_contacts1`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_customer
-- ----------------------------
INSERT INTO `tb_customer` VALUES ('1', '张三', '三三', '0', '', '', '18000000000', '', '', '18000000000', '', '大同', '', '', '', '', '', '', '', '2021-04-11 17:48:32', '2021-04-11 17:48:32');

-- ----------------------------
-- Table structure for tb_fault_reason_dict
-- ----------------------------
DROP TABLE IF EXISTS `tb_fault_reason_dict`;
CREATE TABLE `tb_fault_reason_dict` (
  `id` int(4) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `fault_reason` varchar(255) NOT NULL DEFAULT '' COMMENT '故障原因',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_fault_reason_dict
-- ----------------------------
INSERT INTO `tb_fault_reason_dict` VALUES ('1', '发动机点不着火', '检查发动机', '2021-07-18 17:54:10', '2021-07-18 18:02:24');
INSERT INTO `tb_fault_reason_dict` VALUES ('2', '排气管滴水', '更换排气管', '2021-07-18 17:54:41', '2021-07-18 18:02:26');
INSERT INTO `tb_fault_reason_dict` VALUES ('3', '排气管冒蓝烟', '修复排气管', '2021-07-18 17:55:30', '2021-07-18 18:02:26');
INSERT INTO `tb_fault_reason_dict` VALUES ('4', '汽车油耗莫名增加', '', '2021-07-18 17:55:52', '2021-07-18 18:02:27');
INSERT INTO `tb_fault_reason_dict` VALUES ('5', '电动车窗老自动下降', '检查一下是否有异物影响车窗升降，进行清理。', '2021-07-18 17:56:29', '2021-07-18 18:02:28');
INSERT INTO `tb_fault_reason_dict` VALUES ('6', '发动机噪声大', '', '2021-07-18 17:56:58', '2021-07-18 18:02:29');
INSERT INTO `tb_fault_reason_dict` VALUES ('7', '废气排放量超标', '', '2021-07-18 17:57:05', '2021-07-18 18:02:30');
INSERT INTO `tb_fault_reason_dict` VALUES ('8', '车辆的转向盘不正', '', '2021-07-18 17:59:12', '2021-07-18 18:02:32');
INSERT INTO `tb_fault_reason_dict` VALUES ('23', '离合器故障', '', '2021-07-18 18:19:34', '2021-07-18 18:19:34');
INSERT INTO `tb_fault_reason_dict` VALUES ('24', '制动失效', '', '2021-07-18 18:19:49', '2021-07-18 18:19:49');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(4) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `login_name` varchar(128) NOT NULL DEFAULT '' COMMENT '登陆名',
  `password` varchar(128) NOT NULL DEFAULT '' COMMENT '密码',
  `name` varchar(128) NOT NULL DEFAULT '' COMMENT '姓名',
  `age` int(2) unsigned NOT NULL DEFAULT '0' COMMENT '年龄',
  `phone` varchar(64) NOT NULL DEFAULT '' COMMENT '电话',
  `wechat` varchar(64) NOT NULL DEFAULT '' COMMENT '微信',
  `qq` varchar(64) NOT NULL DEFAULT '' COMMENT 'QQ',
  `other_contacts1` varchar(128) NOT NULL DEFAULT '' COMMENT '其他联系人1',
  `other_contacts2` varchar(128) NOT NULL DEFAULT '' COMMENT '其他联系人2',
  `address` varchar(255) NOT NULL DEFAULT '' COMMENT '住址',
  `post` varchar(128) NOT NULL DEFAULT '' COMMENT '岗位',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_login_name` (`login_name`) USING BTREE,
  KEY `idx_name` (`name`) USING BTREE,
  KEY `idx_phone` (`phone`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'wangll', '96e79218965eb72c92a549dd5a330112', '王亮亮', '26', '13618647578', '13618647578', '', '', '', '向桥', '管理员', '', '2021-04-05 01:35:42', '2021-07-18 00:30:47');
INSERT INTO `tb_user` VALUES ('5', 'zzj', '96e79218965eb72c92a549dd5a330112', '朱振杰', '24', '18272125712', '18272125712', '', '', '', '向桥', '店长', '', '2021-04-07 23:04:45', '2021-07-18 00:30:42');
INSERT INTO `tb_user` VALUES ('6', 'zmy', '96e79218965eb72c92a549dd5a330112', '朱满意', '0', '18272125712', '', '', '', '', '', '店长', '', '2021-07-18 00:32:40', '2021-07-18 00:32:40');
