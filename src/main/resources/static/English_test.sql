/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.104
Source Server Version : 50718
Source Host           : 192.168.1.104:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-06-12 19:12:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for English_test
-- ----------------------------
DROP TABLE IF EXISTS `English_test`;
CREATE TABLE `English_test` (
  `id` varchar(50) CHARACTER SET latin1 NOT NULL COMMENT 'ID',
  `questionno` int(11) DEFAULT NULL COMMENT '题号',
  `question` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_520_ci DEFAULT NULL COMMENT '问题',
  `testtype` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_520_ci DEFAULT '' COMMENT '问题类型（1选择，2简答）',
  `answera` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_520_ci DEFAULT '' COMMENT '答案A',
  `answerb` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_520_ci DEFAULT '' COMMENT '答案B',
  `answerc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_520_ci DEFAULT '' COMMENT '答案C',
  `answerd` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_520_ci DEFAULT '' COMMENT '答案D',
  `answertrue` varchar(255) DEFAULT NULL COMMENT '正确答案',
  `testkey` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_520_ci DEFAULT NULL COMMENT '第几号试卷',
  `testid` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_520_ci DEFAULT NULL COMMENT '试卷编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of English_test
-- ----------------------------
INSERT INTO `English_test` VALUES ('1', '1', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('10', '10', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('11', '11', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('12', '12', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('13', '13', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('14', '14', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('2', '2', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('3', '3', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('4', '4', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('5', '5', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('6', '6', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('7', '7', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('8', '8', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
INSERT INTO `English_test` VALUES ('9', '9', 'are you OK?', '1', 'A YES', 'B NO', 'C I\'m not sure', 'D HAHA', 'C', '1', null);
