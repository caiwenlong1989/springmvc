/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 80000
Source Host           : localhost:3306
Source Database       : spring

Target Server Type    : MYSQL
Target Server Version : 80000
File Encoding         : 65001

Date: 2017-07-22 12:36:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for table_test
-- ----------------------------
DROP TABLE IF EXISTS `table_test`;
CREATE TABLE `table_test` (
  `id` int(11) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `age` tinyint(3) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `hire_date` datetime DEFAULT NULL,
  `deleted` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_test
-- ----------------------------
INSERT INTO `table_test` VALUES ('1', 'caicai', '1', '28', '1989-07-30', null, '2017-02-13 11:30:40', '0');
