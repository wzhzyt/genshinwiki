/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80035
 Source Host           : localhost:3306
 Source Schema         : genshinwiki

 Target Server Type    : MySQL
 Target Server Version : 80035
 File Encoding         : 65001

 Date: 21/12/2023 01:04:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `UserId` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `UserName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `PassWord` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`UserId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('100001', '瓦尔特*杨', '555');
INSERT INTO `admin` VALUES ('100002', '温迪', '666');
INSERT INTO `admin` VALUES ('100003', '呜呜伯', '555');

-- ----------------------------
-- Table structure for characters
-- ----------------------------
DROP TABLE IF EXISTS `characters`;
CREATE TABLE `characters`  (
  `id` int(0) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `element` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `weapon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `rank` int(0) DEFAULT NULL,
  `region` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of characters
-- ----------------------------
INSERT INTO `characters` VALUES (10000002, '神里绫华', '冰', '单手剑', 5, '稻妻', 'UI_AvatarIcon_Ayaka');
INSERT INTO `characters` VALUES (10000003, '琴', '风', '单手剑', 5, '蒙德', 'UI_AvatarIcon_Qin');
INSERT INTO `characters` VALUES (10000006, '丽莎', '雷', '法器', 4, '蒙德', 'UI_AvatarIcon_Lisa');
INSERT INTO `characters` VALUES (10000014, '芭芭拉', '水', '法器', 4, '蒙德', 'UI_AvatarIcon_Barbara');
INSERT INTO `characters` VALUES (10000015, '凯亚', '冰', '单手剑', 4, '蒙德', 'UI_AvatarIcon_Kaeya');
INSERT INTO `characters` VALUES (10000016, '迪卢克', '火', '双手剑', 5, '蒙德', 'UI_AvatarIcon_Diluc');
INSERT INTO `characters` VALUES (10000020, '雷泽', '雷', '双手剑', 4, '蒙德', 'UI_AvatarIcon_Razor');
INSERT INTO `characters` VALUES (10000021, '安柏', '火', '弓', 4, '蒙德', 'UI_AvatarIcon_Ambor');
INSERT INTO `characters` VALUES (10000022, '温迪', '风', '弓', 5, '蒙德', 'UI_AvatarIcon_Venti');
INSERT INTO `characters` VALUES (10000023, '香菱', '火', '长柄武器', 4, '璃月', 'UI_AvatarIcon_Xiangling');
INSERT INTO `characters` VALUES (10000024, '北斗', '雷', '双手剑', 4, '璃月', 'UI_AvatarIcon_Beidou');
INSERT INTO `characters` VALUES (10000025, '行秋', '水', '单手剑', 4, '璃月', 'UI_AvatarIcon_Xingqiu');
INSERT INTO `characters` VALUES (10000026, '魈', '风', '长柄武器', 5, '璃月', 'UI_AvatarIcon_Xiao');
INSERT INTO `characters` VALUES (10000027, '凝光', '岩', '法器', 4, '璃月', 'UI_AvatarIcon_Ningguang');
INSERT INTO `characters` VALUES (10000029, '可莉', '火', '法器', 5, '蒙德', 'UI_AvatarIcon_Klee');
INSERT INTO `characters` VALUES (10000030, '钟离', '岩', '长柄武器', 5, '璃月', 'UI_AvatarIcon_Zhongli');
INSERT INTO `characters` VALUES (10000031, '菲谢尔', '雷', '弓', 4, '蒙德', 'UI_AvatarIcon_Fischl');
INSERT INTO `characters` VALUES (10000032, '班尼特', '火', '单手剑', 4, '蒙德', 'UI_AvatarIcon_Bennett');
INSERT INTO `characters` VALUES (10000033, '达达利亚', '水', '弓', 5, '至冬', 'UI_AvatarIcon_Tartaglia');
INSERT INTO `characters` VALUES (10000034, '诺艾尔', '岩', '双手剑', 4, '蒙德', 'UI_AvatarIcon_Noel');
INSERT INTO `characters` VALUES (10000035, '七七', '冰', '单手剑', 5, '璃月', 'UI_AvatarIcon_Qiqi');
INSERT INTO `characters` VALUES (10000036, '重云', '冰', '双手剑', 4, '璃月', 'UI_AvatarIcon_Chongyun');
INSERT INTO `characters` VALUES (10000037, '甘雨', '冰', '弓', 5, '璃月', 'UI_AvatarIcon_Ganyu');
INSERT INTO `characters` VALUES (10000038, '阿贝多', '岩', '单手剑', 5, '蒙德', 'UI_AvatarIcon_Albedo');
INSERT INTO `characters` VALUES (10000039, '迪奥娜', '冰', '弓', 4, '蒙德', 'UI_AvatarIcon_Diona');
INSERT INTO `characters` VALUES (10000041, '莫娜', '水', '法器', 5, '蒙德', 'UI_AvatarIcon_Mona');
INSERT INTO `characters` VALUES (10000042, '刻晴', '雷', '单手剑', 5, '璃月', 'UI_AvatarIcon_Keqing');
INSERT INTO `characters` VALUES (10000043, '砂糖', '风', '法器', 4, '蒙德', 'UI_AvatarIcon_Sucrose');
INSERT INTO `characters` VALUES (10000044, '辛焱', '火', '双手剑', 4, '璃月', 'UI_AvatarIcon_Xinyan');
INSERT INTO `characters` VALUES (10000045, '罗莎莉亚', '冰', '长柄武器', 4, '蒙德', 'UI_AvatarIcon_Rosaria');
INSERT INTO `characters` VALUES (10000046, '胡桃', '火', '长柄武器', 5, '璃月', 'UI_AvatarIcon_Hutao');
INSERT INTO `characters` VALUES (10000047, '枫原万叶', '风', '单手剑', 5, '稻妻', 'UI_AvatarIcon_Kazuha');
INSERT INTO `characters` VALUES (10000048, '烟绯', '火', '法器', 4, '璃月', 'UI_AvatarIcon_Feiyan');
INSERT INTO `characters` VALUES (10000049, '宵宫', '火', '弓', 5, '稻妻', 'UI_AvatarIcon_Yoimiya');
INSERT INTO `characters` VALUES (10000050, '托马', '火', '长柄武器', 4, '稻妻', 'UI_AvatarIcon_Tohma');
INSERT INTO `characters` VALUES (10000051, '优菈', '冰', '双手剑', 5, '蒙德', 'UI_AvatarIcon_Eula');
INSERT INTO `characters` VALUES (10000052, '雷电将军', '雷', '长柄武器', 5, '稻妻', 'UI_AvatarIcon_Shougun');
INSERT INTO `characters` VALUES (10000053, '早柚', '风', '双手剑', 4, '稻妻', 'UI_AvatarIcon_Sayu');
INSERT INTO `characters` VALUES (10000054, '珊瑚宫心海', '水', '法器', 5, '稻妻', 'UI_AvatarIcon_Kokomi');
INSERT INTO `characters` VALUES (10000055, '五郎', '岩', '弓', 4, '稻妻', 'UI_AvatarIcon_Gorou');
INSERT INTO `characters` VALUES (10000056, '九条裟罗', '雷', '弓', 4, '稻妻', 'UI_AvatarIcon_Sara');
INSERT INTO `characters` VALUES (10000057, '荒泷一斗', '岩', '双手剑', 5, '稻妻', 'UI_AvatarIcon_Itto');
INSERT INTO `characters` VALUES (10000058, '八重神子', '雷', '法器', 5, '稻妻', 'UI_AvatarIcon_Yae');
INSERT INTO `characters` VALUES (10000059, '鹿野院平藏', '风', '法器', 4, '稻妻', 'UI_AvatarIcon_Heizo');
INSERT INTO `characters` VALUES (10000060, '夜兰', '水', '弓', 5, '璃月', 'UI_AvatarIcon_Yelan');
INSERT INTO `characters` VALUES (10000061, '绮良良', '草', '单手剑', 4, '未知', 'UI_AvatarIcon_Momoka');
INSERT INTO `characters` VALUES (10000062, '埃洛伊', '冰', '弓', 5, '其它', 'UI_AvatarIcon_Aloy');
INSERT INTO `characters` VALUES (10000063, '申鹤', '冰', '长柄武器', 5, '璃月', 'UI_AvatarIcon_Shenhe');
INSERT INTO `characters` VALUES (10000064, '云堇', '岩', '长柄武器', 4, '璃月', 'UI_AvatarIcon_Yunjin');
INSERT INTO `characters` VALUES (10000065, '久岐忍', '雷', '单手剑', 4, '稻妻', 'UI_AvatarIcon_Shinobu');
INSERT INTO `characters` VALUES (10000066, '神里绫人', '水', '单手剑', 5, '稻妻', 'UI_AvatarIcon_Ayato');
INSERT INTO `characters` VALUES (10000067, '柯莱', '草', '弓', 4, '须弥', 'UI_AvatarIcon_Collei');
INSERT INTO `characters` VALUES (10000068, '多莉', '雷', '双手剑', 4, '须弥', 'UI_AvatarIcon_Dori');
INSERT INTO `characters` VALUES (10000069, '提纳里', '草', '弓', 5, '须弥', 'UI_AvatarIcon_Tighnari');
INSERT INTO `characters` VALUES (10000070, '妮露', '水', '单手剑', 5, '须弥', 'UI_AvatarIcon_Nilou');
INSERT INTO `characters` VALUES (10000071, '赛诺', '雷', '长柄武器', 5, '须弥', 'UI_AvatarIcon_Cyno');
INSERT INTO `characters` VALUES (10000072, '坎蒂丝', '水', '长柄武器', 4, '须弥', 'UI_AvatarIcon_Candace');
INSERT INTO `characters` VALUES (10000073, '纳西妲', '草', '法器', 5, '须弥', 'UI_AvatarIcon_Nahida');
INSERT INTO `characters` VALUES (10000074, '莱依拉', '冰', '单手剑', 4, '须弥', 'UI_AvatarIcon_Layla');
INSERT INTO `characters` VALUES (10000075, '流浪者', '风', '法器', 5, '须弥', 'UI_AvatarIcon_Wanderer');
INSERT INTO `characters` VALUES (10000076, '珐露珊', '风', '弓', 4, '须弥', 'UI_AvatarIcon_Faruzan');
INSERT INTO `characters` VALUES (10000077, '瑶瑶', '草', '长柄武器', 4, '璃月', 'UI_AvatarIcon_Yaoyao');
INSERT INTO `characters` VALUES (10000078, '艾尔海森', '草', '单手剑', 5, '须弥', 'UI_AvatarIcon_Alhatham');
INSERT INTO `characters` VALUES (10000079, '迪希雅', '火', '双手剑', 5, '须弥', 'UI_AvatarIcon_Dehya');
INSERT INTO `characters` VALUES (10000080, '米卡', '冰', '长柄武器', 4, '未知', 'UI_AvatarIcon_Mika');
INSERT INTO `characters` VALUES (10000081, '卡维', '草', '双手剑', 4, '须弥', 'UI_AvatarIcon_Kaveh');
INSERT INTO `characters` VALUES (10000082, '白术', '草', '法器', 5, '未知', 'UI_AvatarIcon_Baizhuer');
INSERT INTO `characters` VALUES (10000083, '琳妮特', '风', '单手剑', 4, '未知', 'UI_AvatarIcon_Linette');
INSERT INTO `characters` VALUES (10000084, '林尼', '火', '弓', 5, '未知', 'UI_AvatarIcon_Liney');
INSERT INTO `characters` VALUES (10000085, '菲米尼', '冰', '双手剑', 4, '未知', 'UI_AvatarIcon_Freminet');
INSERT INTO `characters` VALUES (10000086, '莱欧斯利', '冰', '法器', 5, '未知', 'UI_AvatarIcon_Wriothesley');
INSERT INTO `characters` VALUES (10000087, '那维莱特', '水', '法器', 5, '未知', 'UI_AvatarIcon_Neuvillette');
INSERT INTO `characters` VALUES (10000088, '夏洛蒂', '冰', '法器', 4, '未知', 'UI_AvatarIcon_Charlotte');
INSERT INTO `characters` VALUES (10000089, '芙宁娜', '水', '单手剑', 5, '未知', 'UI_AvatarIcon_Furina');

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team`  (
  `TeamId` int(0) NOT NULL,
  `member1` int(0) DEFAULT NULL,
  `member2` int(0) DEFAULT NULL,
  `member3` int(0) DEFAULT NULL,
  `member4` int(0) DEFAULT NULL,
  PRIMARY KEY (`TeamId`) USING BTREE,
  INDEX `member1`(`member1`) USING BTREE,
  INDEX `member2`(`member2`) USING BTREE,
  INDEX `member3`(`member3`) USING BTREE,
  INDEX `member4`(`member4`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team` VALUES (10001, 10000002, 10000014, 10000047, 10000089);
INSERT INTO `team` VALUES (10005, 10000087, 10000089, 10000047, 10000003);
INSERT INTO `team` VALUES (10006, 10000003, 10000002, 10000003, 10000002);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `UserId` int(0) NOT NULL,
  `UserName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `PassWord` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`UserId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (10001, '呜呜伯', '555');
INSERT INTO `user` VALUES (10002, 'gzz', '666');

-- ----------------------------
-- Table structure for user_character
-- ----------------------------
DROP TABLE IF EXISTS `user_character`;
CREATE TABLE `user_character`  (
  `index` int(0) NOT NULL,
  `UserId` int(0) NOT NULL,
  `characterId` int(0) NOT NULL,
  PRIMARY KEY (`index`) USING BTREE,
  INDEX `UserId`(`UserId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_character
-- ----------------------------
INSERT INTO `user_character` VALUES (1, 10001, 10000002);
INSERT INTO `user_character` VALUES (2, 10001, 10000003);
INSERT INTO `user_character` VALUES (3, 10001, 10000006);
INSERT INTO `user_character` VALUES (4, 10001, 10000014);
INSERT INTO `user_character` VALUES (5, 10001, 10000047);
INSERT INTO `user_character` VALUES (6, 10001, 10000026);
INSERT INTO `user_character` VALUES (7, 10001, 10000089);
INSERT INTO `user_character` VALUES (8, 10001, 10000087);
INSERT INTO `user_character` VALUES (9, 10001, 10000021);
INSERT INTO `user_character` VALUES (10, 10001, 10000058);

-- ----------------------------
-- Table structure for userteam
-- ----------------------------
DROP TABLE IF EXISTS `userteam`;
CREATE TABLE `userteam`  (
  `index` int(0) NOT NULL AUTO_INCREMENT,
  `UserId` int(0) DEFAULT NULL,
  `TeamId` int(0) DEFAULT NULL,
  PRIMARY KEY (`index`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userteam
-- ----------------------------
INSERT INTO `userteam` VALUES (1, 10001, 10001);
INSERT INTO `userteam` VALUES (5, 10001, 10005);
INSERT INTO `userteam` VALUES (6, 10001, 10006);

SET FOREIGN_KEY_CHECKS = 1;
