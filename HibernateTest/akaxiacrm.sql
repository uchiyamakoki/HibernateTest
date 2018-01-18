/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : akaxiacrm

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2018-01-05 17:01:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sjzdfl`
-- ----------------------------
DROP TABLE IF EXISTS `sjzdfl`;
CREATE TABLE `sjzdfl` (
  `sjzdflid` int(11) NOT NULL,
  `sjzdflmc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sjzdflid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sjzdfl
-- ----------------------------
INSERT INTO `sjzdfl` VALUES ('1', '企业类型-分类');
INSERT INTO `sjzdfl` VALUES ('2', '企业性质-类型');
INSERT INTO `sjzdfl` VALUES ('3', '开户银行-分类');
INSERT INTO `sjzdfl` VALUES ('4', '信息来源-分类');
INSERT INTO `sjzdfl` VALUES ('5', '客户满意度-分类');

-- ----------------------------
-- Table structure for `sjzdxx`
-- ----------------------------
DROP TABLE IF EXISTS `sjzdxx`;
CREATE TABLE `sjzdxx` (
  `sjzdxxId` int(11) NOT NULL AUTO_INCREMENT,
  `sjzdflid` int(11) DEFAULT NULL,
  `sjzdxxmc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sjzdxxId`),
  KEY `sjzdflid` (`sjzdflid`),
  CONSTRAINT `sjzdxx_ibfk_1` FOREIGN KEY (`sjzdflid`) REFERENCES `sjzdfl` (`sjzdflid`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sjzdxx
-- ----------------------------
INSERT INTO `sjzdxx` VALUES ('1', '1', '服务类');
INSERT INTO `sjzdxx` VALUES ('2', '1', '制造类');
INSERT INTO `sjzdxx` VALUES ('3', '1', '金融业');
INSERT INTO `sjzdxx` VALUES ('4', '2', '国有企业');
INSERT INTO `sjzdxx` VALUES ('5', '2', '私营企业');
INSERT INTO `sjzdxx` VALUES ('6', '2', '外资企业');
INSERT INTO `sjzdxx` VALUES ('7', '2', '合资企业');
INSERT INTO `sjzdxx` VALUES ('8', '3', '中国银行');
INSERT INTO `sjzdxx` VALUES ('9', '3', '工商银行');
INSERT INTO `sjzdxx` VALUES ('10', '3', '农业银行');
INSERT INTO `sjzdxx` VALUES ('11', '3', '建设银行');
INSERT INTO `sjzdxx` VALUES ('12', '3', '招商银行');
INSERT INTO `sjzdxx` VALUES ('13', '3', '壁吧');
INSERT INTO `sjzdxx` VALUES ('14', '3', '京都动画');
INSERT INTO `sjzdxx` VALUES ('15', '4', '展销会');
INSERT INTO `sjzdxx` VALUES ('16', '4', '网络');
INSERT INTO `sjzdxx` VALUES ('17', '4', '商业活动');
INSERT INTO `sjzdxx` VALUES ('18', '5', '非常满意');
INSERT INTO `sjzdxx` VALUES ('19', '5', '满意');
INSERT INTO `sjzdxx` VALUES ('20', '5', '不满意');
INSERT INTO `sjzdxx` VALUES ('21', '5', '非常不满意');
