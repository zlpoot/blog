/*
 Navicat Premium Data Transfer

 Source Server         : zlp
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 25/02/2019 16:36:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article_info
-- ----------------------------
DROP TABLE IF EXISTS `article_info`;
CREATE TABLE `article_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL,
  `type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type_id` int(11) NULL DEFAULT NULL,
  `is_deleted` int(11) NULL DEFAULT NULL,
  `view_count` int(11) NULL DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `view_desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `update_date` datetime(0) NULL DEFAULT NULL,
  `label_names` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_info
-- ----------------------------
INSERT INTO `article_info` VALUES (1, '', '2019-02-22 19:01:56', '学习笔记', NULL, NULL, 0, 'Eclipse JRE转换成JDK', '::: hljs-center\n\n# 测试\n\n:::\n```\njava\n```\n> 2019年2月22日18:58:15\nindent_size，缩进长度（为避……', '::: hljs-center\n\n# 测试\n\n:::\n```\njava\n```\n> 2019年2月22日18:58:15', '2019-02-25 12:38:50', '[\"java\",\"test\"]');
INSERT INTO `article_info` VALUES (3, NULL, '2019-02-25 13:08:37', '前端', NULL, NULL, 0, 'nuxt-link 路由跳转传参', '本文讲述了在使用nuxt.js 使用<nuxt-link :to=><nuxt-link>进行路由跳转时，参数应该如何传递。\n\n官方描述：目前 <nuxt-li……', '本文讲述了在使用nuxt.js 使用<nuxt-link :to=><nuxt-link>进行路由跳转时，参数应该如何传递。\n\n官方描述：目前 <nuxt-link> 的作用和 <router-link> 一致\n[router-link 官方api](https://router.vuejs.org/zh/api/#router-link)', '2019-02-25 13:08:37', '[\"java\",\"test\"]');

-- ----------------------------
-- Table structure for article_label
-- ----------------------------
DROP TABLE IF EXISTS `article_label`;
CREATE TABLE `article_label`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_label
-- ----------------------------
INSERT INTO `article_label` VALUES (17, 'java');
INSERT INTO `article_label` VALUES (20, 'vue');
INSERT INTO `article_label` VALUES (21, 'c');
INSERT INTO `article_label` VALUES (22, 'c++');

-- ----------------------------
-- Table structure for article_type
-- ----------------------------
DROP TABLE IF EXISTS `article_type`;
CREATE TABLE `article_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_type
-- ----------------------------
INSERT INTO `article_type` VALUES (1, '学习笔记');
INSERT INTO `article_type` VALUES (3, '数据库');
INSERT INTO `article_type` VALUES (4, '前端');
INSERT INTO `article_type` VALUES (5, '后端');
INSERT INTO `article_type` VALUES (6, '操作系统');
INSERT INTO `article_type` VALUES (7, '其他');

SET FOREIGN_KEY_CHECKS = 1;
