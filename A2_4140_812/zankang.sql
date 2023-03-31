/*
 Navicat Premium Data Transfer

 Source Server         : zankang
 Source Server Type    : MySQL
 Source Server Version : 80024
 Source Host           : centos7.cn:3306
 Source Schema         : zankang

 Target Server Type    : MySQL
 Target Server Version : 80024
 File Encoding         : 65001

 Date: 20/06/2022 14:12:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for client812
-- ----------------------------
DROP TABLE IF EXISTS `client812`;
CREATE TABLE `client812`  (
  `clientId812` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `clientCity812` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `dollarsOnOrder812` int(0) NULL DEFAULT NULL,
  `clientStatus812` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `clientCompName812` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `clientCompPassword812` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `moneyOwed812` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`clientId812`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for lines812
-- ----------------------------
DROP TABLE IF EXISTS `lines812`;
CREATE TABLE `lines812`  (
  `lineNo812` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `poNo812` bigint(0) NOT NULL,
  `partNo812` bigint(0) NOT NULL,
  `qty812` int(0) NULL DEFAULT NULL,
  `priceOrdered812` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`lineNo812`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for parts812
-- ----------------------------
DROP TABLE IF EXISTS `parts812`;
CREATE TABLE `parts812`  (
  `partNo812` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `partName812` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `currentPrice812` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `poH812` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`partNo812`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pos812
-- ----------------------------
DROP TABLE IF EXISTS `pos812`;
CREATE TABLE `pos812`  (
  `poNo812` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `clientCompID812` bigint(0) NULL DEFAULT NULL,
  `dateOfPO812` datetime(0) NULL DEFAULT NULL,
  `status812` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`poNo812`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
