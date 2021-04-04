/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : car

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2021-04-05 00:18:29
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_car_repair
-- ----------------------------
DROP TABLE IF EXISTS `tb_car_repair`;
CREATE TABLE `tb_car_repair` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `fault_reason_dict_id` int(4) unsigned NOT NULL,
  `price` decimal(10,2) NOT NULL COMMENT '价格',
  `customer_id` int(11) unsigned NOT NULL COMMENT '客户id',
  `car_id` int(11) unsigned NOT NULL COMMENT '汽车id',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_fault_reason_dict_id` (`fault_reason_dict_id`),
  KEY `idx_customer_id` (`customer_id`),
  KEY `idx_car_id` (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  KEY `idx_car_id` (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(128) NOT NULL DEFAULT '' COMMENT '姓名',
  `nickname` varchar(128) NOT NULL DEFAULT '' COMMENT '昵称',
  `age` int(2) unsigned NOT NULL COMMENT '年龄',
  `sex` bit(1) NOT NULL COMMENT '性别',
  `has_marry` bit(1) NOT NULL COMMENT '已婚',
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(4) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `login_name` varchar(128) NOT NULL DEFAULT '' COMMENT '登陆名',
  `password` varchar(128) NOT NULL DEFAULT '' COMMENT '密码',
  `name` varchar(128) NOT NULL DEFAULT '' COMMENT '姓名',
  `age` int(2) unsigned NOT NULL COMMENT '年龄',
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
