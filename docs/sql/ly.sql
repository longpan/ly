/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : lytest

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2015-01-28 18:50:15
*/
DROP DATABASE IF EXISTS `ly`;
create DATABASE ly;
USE ly;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for case1
-- ----------------------------
DROP TABLE IF EXISTS `case1`;
CREATE TABLE `case1` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '????',
  `name` varchar(100) DEFAULT NULL COMMENT '????????',
  `interrogation_record_id` int(11) NOT NULL COMMENT '???????id',
  `operation_data` timestamp DEFAULT NULL,
  `operator_name` varchar(100) DEFAULT NULL COMMENT '??????????',
  `operator_detail` text COMMENT '????????',
  `vt_type` varchar(100) DEFAULT NULL COMMENT '????????',
  `vt_course_disease` varchar(100) DEFAULT NULL COMMENT '???????',
  `arrhythmia_diagnose` text COMMENT '??????????????',
  `electrophysiology_diagnose` text COMMENT '??????????????',
  `postoperation_diagnose` text COMMENT '????????',
  `mechanism` varchar(100) DEFAULT NULL COMMENT '????',
  `part` varchar(100) DEFAULT NULL COMMENT '??',
  `la_bore` varchar(100) DEFAULT NULL COMMENT 'LA???',
  `lv_bore` varchar(100) DEFAULT NULL COMMENT 'lv???',
  `lvef_bore` varchar(100) DEFAULT NULL COMMENT 'LVEF_???',
  `ra_bore` varchar(100) DEFAULT NULL COMMENT 'RA???',
  `rv_bore` varchar(100) DEFAULT NULL COMMENT 'RV???',
  `ucg_remarks` text COMMENT 'UCG???',
  `ecg_type` varchar(100) DEFAULT NULL COMMENT 'ECG???????????',
  `electrical_offset` varchar(100) DEFAULT NULL COMMENT '???????',
  `preopreative_examination` text COMMENT '??????????????????????',
  `anti_arrhythmia_drugs` text COMMENT '???????????????',
  `invali_danti_arrhythmia_drugs` text COMMENT '?????????????????',
  `merger_arrhythmia` text COMMENT '?????????????',
  `imaging_inside_heart` varchar(50) DEFAULT NULL COMMENT '?????????',
  `induced_way` text COMMENT '??????',
  `check_medication` text COMMENT '???????',
  `tachycardia_regulation` varchar(50) DEFAULT NULL COMMENT '?????????????????',
  `ccl` varchar(50) DEFAULT NULL COMMENT '?????CCL??',
  `inspection_method` varchar(100) DEFAULT NULL COMMENT '??????',
  `diastolic_potential` varchar(50) DEFAULT NULL COMMENT '???????',
  `p_potential_examination` varchar(100) DEFAULT NULL COMMENT 'P??????',
  `ablation_procedure` text COMMENT '???????',
  `ablation_lines` text COMMENT '???????',
  `target_position` varchar(500) DEFAULT NULL COMMENT '??',
  `ablation_energy` text COMMENT '???????',
  `ablation_judgement` varchar(50) DEFAULT NULL COMMENT '???????????',
  `ablation_end_point` text COMMENT '???????',
  `effective_target_site` varchar(100) DEFAULT NULL COMMENT '????',
  `discharge_time` varchar(100) DEFAULT NULL COMMENT '???????',
  `xray_exposure_time` varchar(100) DEFAULT NULL COMMENT 'x????????',
  `ablation_times` int(11) DEFAULT NULL COMMENT '???????',
  `intraoperative_cable_rate` varchar(100) DEFAULT NULL COMMENT '???ֿy??',
  `before_heart_rate` varchar(100) DEFAULT NULL COMMENT '?????????',
  `before_vt` varchar(100) DEFAULT '' COMMENT '?????????',
  `before_ront` varchar(100) DEFAULT NULL COMMENT '?????????',
  `before_remarks` text COMMENT '????????',
  `in_heart_rate` varchar(100) DEFAULT NULL COMMENT '????????????',
  `in_vt` varchar(100) DEFAULT NULL COMMENT '????????',
  `in_ront` varchar(100) DEFAULT NULL COMMENT '????????',
  `in_remarks` varchar(300) DEFAULT NULL COMMENT '?????',
  `global_remarks` text COMMENT '?????',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  `operation_number` varchar(100) DEFAULT NULL,
  `case_number` varchar(100) DEFAULT NULL,
  `vt_frequency` varchar(100) DEFAULT NULL,
  `vt_every_attack_time` varchar(100) DEFAULT NULL,
  `vt_last_attack_time` varchar(100) DEFAULT NULL,
  `cardioversion_method` text,
  `cardioversion_medication` text,
  `complication` text,
  `vt_duration` varchar(100) DEFAULT NULL,
  `lvs_bore` varchar(100) DEFAULT NULL,
  `lvpw_bore` varchar(100) DEFAULT NULL,
  `premature_beat_load` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_4` (`interrogation_record_id`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`interrogation_record_id`) REFERENCES `interrogation_record` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='??????????';

-- ----------------------------
-- Records of case1
-- ----------------------------
INSERT INTO `case1` VALUES ('1', '室速', '3', '2015-01-06 13:40:19', '压顶城', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `case1` VALUES ('2', '室速', '4', '2015-01-06 13:40:20', '压顶城', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `case1` VALUES ('3', '室速', '5', '2015-01-28 13:56:40', '压顶城', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `case1` VALUES ('4', '室速', '6', '2015-01-28 13:58:10', '压顶城', null, null, null, null, null, null, null, null, null, null, null, null, null, 'dfdfdfdfdfdf', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for case2
-- ----------------------------
DROP TABLE IF EXISTS `case2`;
CREATE TABLE `case2` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '????',
  `name` varchar(100) DEFAULT NULL COMMENT '????????',
  `interrogation_record_id` int(11) NOT NULL COMMENT '???????id',
  `operation_data` timestamp DEFAULT NULL,
  `operator_name` varchar(100) DEFAULT NULL COMMENT '??????????',
  `operator_detail` text COMMENT '????????',
  `arrhythmia_diagnose` text COMMENT '??????????????',
  `electrophysiology_diagnose` text COMMENT '??????????????',
  `postoperation_diagnose` text COMMENT '????????',
  `mechanism` varchar(100) DEFAULT NULL COMMENT '????',
  `part` varchar(100) DEFAULT NULL COMMENT '??',
  `la_bore` varchar(100) DEFAULT NULL COMMENT 'LA???',
  `lv_bore` varchar(100) DEFAULT NULL COMMENT 'lv???',
  `lvef_bore` varchar(100) DEFAULT NULL COMMENT 'LVEF_???',
  `ra_bore` varchar(100) DEFAULT NULL COMMENT 'RA???',
  `rv_bore` varchar(100) DEFAULT NULL COMMENT 'RV???',
  `ucg_remarks` text COMMENT 'UCG???',
  `anti_arrhythmia_drugs` text COMMENT '???????????????',
  `invali_danti_arrhythmia_drugs` text COMMENT '?????????????????',
  `merger_arrhythmia` text COMMENT '?????????????',
  `imaging_inside_heart` varchar(100) DEFAULT NULL COMMENT '?????????',
  `induced_way` text COMMENT '??????',
  `check_medication` text COMMENT '???????',
  `tachycardia_regulation` varchar(100) DEFAULT NULL COMMENT '?????????????????',
  `ccl` varchar(100) DEFAULT NULL COMMENT '?????CCL??',
  `inspection_method` varchar(100) DEFAULT NULL COMMENT '??????',
  `ablation_procedure` text COMMENT '???????',
  `ablation_lines` text COMMENT '???????',
  `target_position` varchar(100) DEFAULT NULL COMMENT '??',
  `ablation_energy` text COMMENT '???????',
  `ablation_end_point` text COMMENT '???????',
  `effective_target_site` varchar(100) DEFAULT NULL COMMENT '????',
  `discharge_time` varchar(100) DEFAULT NULL COMMENT '???????',
  `xray_exposure_time` varchar(100) DEFAULT NULL COMMENT 'x????????',
  `ablation_times` int(11) DEFAULT NULL COMMENT '???????',
  `intraoperative_cable_rate` varchar(100) DEFAULT NULL COMMENT '???ֿy??',
  `before_heart_rate` varchar(100) DEFAULT NULL COMMENT '?????????',
  `before_rr` varchar(100) DEFAULT '' COMMENT '?????????',
  `before_re` varchar(100) DEFAULT NULL COMMENT '?????????',
  `before_remarks` text COMMENT '????????',
  `in_heart_rate` varchar(100) DEFAULT NULL COMMENT '????????????',
  `in_rr` varchar(100) DEFAULT NULL COMMENT '????????',
  `in_re` varchar(100) DEFAULT NULL COMMENT '????????',
  `in_remarks` text COMMENT '?????',
  `global_remarks` varchar(500) DEFAULT NULL COMMENT '?????',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  `operation_number` varchar(100) DEFAULT NULL,
  `case_number` varchar(100) DEFAULT NULL,
  `rr_frequency` varchar(100) DEFAULT NULL,
  `rr_every_attack_time` varchar(100) DEFAULT NULL,
  `rr_last_attack_time` varchar(100) DEFAULT NULL,
  `cardioversion_method` text,
  `cardioversion_medication` text,
  `complication` text,
  `rr_ablation_treatment` varchar(100) DEFAULT NULL,
  `before_anticoagulant` varchar(100) DEFAULT NULL,
  `rr_type` varchar(100) DEFAULT NULL COMMENT '????????',
  `rr_course_disease` varchar(100) DEFAULT NULL COMMENT '???????',
  `la_thrombus_detection` varchar(100) DEFAULT NULL,
  `mapping_mode` varchar(100) DEFAULT NULL,
  `rr_duration` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_6` (`interrogation_record_id`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`interrogation_record_id`) REFERENCES `interrogation_record` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of case2
-- ----------------------------
INSERT INTO `case2` VALUES ('1', '房速', '1', '2015-01-06 13:39:50', '压顶城', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `case2` VALUES ('2', '房速', '2', '2015-01-06 13:39:52', '压顶城', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for case3
-- ----------------------------
DROP TABLE IF EXISTS `case3`;
CREATE TABLE `case3` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '????',
  `name` varchar(100) DEFAULT NULL COMMENT '????????',
  `interrogation_record_id` int(11) NOT NULL COMMENT '???????id',
  `operation_data` timestamp DEFAULT NULL,
  `operator_name` varchar(100) DEFAULT NULL COMMENT '??????????',
  `operator_detail` varchar(500) DEFAULT NULL COMMENT '????????',
  `af_type` varchar(100) DEFAULT NULL COMMENT '????????',
  `af_course_disease` varchar(100) DEFAULT NULL COMMENT '???????',
  `arrhythmia_diagnose` text COMMENT '??????????????',
  `electrophysiology_diagnose` text COMMENT '??????????????',
  `postoperation_diagnose` text COMMENT '????????',
  `la_bore` varchar(100) DEFAULT NULL COMMENT 'LA???',
  `lv_bore` varchar(100) DEFAULT NULL COMMENT 'lv???',
  `lvef_bore` varchar(100) DEFAULT NULL COMMENT 'LVEF_???',
  `ra_bore` varchar(100) DEFAULT NULL COMMENT 'RA???',
  `rv_bore` varchar(100) DEFAULT NULL COMMENT 'RV???',
  `ucg_remarks` text COMMENT 'UCG???',
  `anti_arrhythmia_drugs` text COMMENT '???????????????',
  `invali_danti_arrhythmia_drugs` text COMMENT '?????????????????',
  `merger_arrhythmia` text COMMENT '?????????????',
  `imaging_inside_heart` varchar(50) DEFAULT NULL COMMENT '?????????',
  `induced_way` text COMMENT '??????',
  `check_medication` text COMMENT '???????',
  `tachycardia_regulation` varchar(50) DEFAULT NULL COMMENT '?????????????????',
  `ccl` varchar(50) DEFAULT NULL COMMENT '?????CCL??',
  `inspection_method` varchar(100) DEFAULT NULL COMMENT '??????',
  `ablation_procedure` text COMMENT '???????',
  `ablation_lines` text COMMENT '???????',
  `target_position` varchar(100) DEFAULT NULL COMMENT '??',
  `ablation_energy` text COMMENT '???????',
  `ablation_judgement` varchar(50) DEFAULT NULL COMMENT '???????????',
  `ablation_end_point` text COMMENT '???????',
  `discharge_time` varchar(100) DEFAULT NULL COMMENT '???????',
  `xray_exposure_time` varchar(100) DEFAULT NULL COMMENT 'x????????',
  `ablation_times` int(11) DEFAULT NULL COMMENT '???????',
  `intraoperative_cable_rate` varchar(100) DEFAULT NULL COMMENT '???ֿy??',
  `before_heart_rate` varchar(100) DEFAULT NULL COMMENT '?????????',
  `before_rr` varchar(100) DEFAULT '' COMMENT '?????????',
  `before_af` varchar(100) DEFAULT NULL COMMENT '?????????',
  `before_remarks` varchar(1000) DEFAULT NULL COMMENT '????????',
  `in_heart_rate` varchar(100) DEFAULT NULL COMMENT '????????????',
  `in_rr` varchar(100) DEFAULT NULL COMMENT '????????',
  `in_af` varchar(100) DEFAULT NULL COMMENT '????????',
  `in_remarks` text COMMENT '?????',
  `global_remarks` text COMMENT '?????',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  `operation_number` varchar(100) DEFAULT NULL,
  `case_number` varchar(100) DEFAULT NULL,
  `af_frequency` varchar(100) DEFAULT NULL,
  `af_every_attack_time` varchar(100) DEFAULT NULL,
  `af_last_attack_time` varchar(100) DEFAULT NULL,
  `cardioversion_method` text,
  `cardioversion_medication` text,
  `complication` varchar(100) DEFAULT NULL,
  `before_antioagulant` varchar(100) DEFAULT NULL,
  `la_thrombus_detection` varchar(100) DEFAULT NULL,
  `test_method` varchar(100) DEFAULT NULL,
  `lung_vein` varchar(100) DEFAULT NULL,
  `gp_ablation` varchar(100) DEFAULT NULL,
  `vagal_reflex` varchar(100) DEFAULT NULL,
  `intraoperative_vagus_reflex_areas` varchar(100) DEFAULT NULL,
  `before_re` varchar(100) DEFAULT NULL,
  `in_re` varchar(100) DEFAULT NULL,
  `af_duration` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_7` (`interrogation_record_id`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`interrogation_record_id`) REFERENCES `interrogation_record` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='??????????';

-- ----------------------------
-- Records of case3
-- ----------------------------

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id????????',
  `user_id` varchar(50) DEFAULT NULL COMMENT '???id',
  `password` varchar(50) NOT NULL COMMENT '????',
  `name` varchar(20) DEFAULT NULL COMMENT '???????',
  `major` varchar(50) DEFAULT NULL COMMENT '??????',
  `job_title` varchar(30) DEFAULT NULL COMMENT '???',
  `contact_number` varchar(20) DEFAULT NULL COMMENT '??????',
  `belong_hospital` varchar(50) DEFAULT NULL COMMENT '??????',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  `certification_number` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=266 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('1', '666666', '21232f297a57a5a743894a0e4a801fc3', '管理员', null, null, null, '华西医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('2', '12101011', '6dee9dc6006e2e48c717c168a33d2230', '姜建', null, null, null, '华西医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('3', '12101012', '151d6cf49154cb0bca2eb8a3bc45005d', '付华', null, null, null, '华西医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('4', '12101013', 'c62569409c483458efe4ec73a5c705f3', '杨庆', null, null, null, '华西医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('5', '12101014', 'eb64bbebc48acb0731dc1053b57bc92c', '胡宏德', null, null, null, '华西医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('6', '12101015', '1c01c0e48d20aba2e7e96897957ff8da', '崔凯军', null, null, null, '华西医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('7', '12101016', '0a079852e13deee6a4d7e54abd546c8e', '贺涛', null, null, null, '四川省人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('8', '12101017', 'aaf3f48dd3f800ee35849ec1d7e61e2e', '张海波', null, null, null, '雅安市人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('9', '12101018', 'd59b4cfc301eecc74bfbbeb35d1b00e6', '江大春', null, null, null, '雅安37医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('10', '12101019', '3721611428c7da8b6ae0b258db369bae', '石丹', null, null, null, '都江堰市人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('11', '12101020', 'bc9fb9a5aaee2a339a496f5a83c51b22', '韩乾国', null, null, null, '成都市第五人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('12', '12101021', 'f8614a285d9dc2f1189b784b7888762c', '戴功强', null, null, null, '眉山市人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('13', '12101022', '186ec892e6a3eeec0c2714dfe7e2b5a1', '周健', null, null, null, '解放军452医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('14', '12101023', 'fc8c4f9f7fc1ed894d811bbb7c937575', '李德', null, null, null, '成都军区总医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('15', '12101024', 'f69ba72fec8cd7598d36ab0ad82958d2', '速晓华', null, null, null, '成都军区总医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('16', '12101025', 'e49a377285024f5c50f3edfc888f2b99', '李刚', null, null, null, '成都军区总医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('17', '12101026', 'cc41f6a37f12483b6bf33a5f5e9b00db', '刘汉雄', null, null, null, '成都市第三人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('18', '12101027', 'f5b27829c7687461428ca99f267e26d2', '邓小琦', null, null, null, '成都市第三人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('19', '12101028', '89ba711d6bcff55183e4a2c06cefb0f3', '杨国澍', null, null, null, '成都市第三人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('20', '12101029', 'fab7dff107018fc180fda9df1ac408e4', '张大勇', null, null, null, '绵阳404医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('21', '12101030', '51c0196e92a7cbedd60b67c9552bf346', '文亚红', null, null, null, '攀枝花中心医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('22', '12101031', '44561b2f122da7b9bf497dd322746a4d', '林良才', null, null, null, '什邡市人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('23', '12101032', '012cc8fae1d83c1cb8e36502cf28a899', '邓小建', null, null, null, '德阳市人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('24', '12101033', '16413ed6b3da80a1a00433d14dcdf514', '庹田', null, null, null, '广安市人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('25', '12101034', '7e7c78061a774d01e972ee00d0bff891', '张俊', null, null, null, '川北医学院附属医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('26', '12101035', 'eb3486a5b7a0b1c4c6d70ef06fbff4c4', '冯杰', null, null, null, '川北医学院附属医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('27', '12101036', '061ec43f02a8aaa0777cdca031a259c2', '李天文', null, null, null, '江油市人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('28', '12101037', '0f3ece29307315b3db2f610f9631e617', '罗彩东', null, null, null, '绵阳中心医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('29', '12101038', '2337b04e185c5673a66241ae65b3b443', '贺剑', null, null, null, '攀枝花钢铁总医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('30', '12101039', 'd59a9dae5c40e8c2cece9848ddf791b9', '陈勇', null, null, null, '南充市中心医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('31', '12101040', '531c7c5919472d2e1715f2d96ed4fd22', '邓小军', null, null, null, '广元市第一人民医院', '四川省', null, null, null);
INSERT INTO `doctor` VALUES ('32', '12101041', '54f3f8e2321b6faf08e74c79134047b3', '李淑敏', null, null, null, '昆明医科大学第一附属医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('33', '12101042', 'bdf6d5efa373dc0b83735ec3bece31d9', '浦里津', null, null, null, '昆明医科大学第一附属医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('34', '12101043', '5a57463dac83b813d0fda189ea43ee98', '华宝桐', null, null, null, '昆明医科大学第一附属医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('35', '12101044', 'c612448deb69bf1e0bb6dcc5094f8e22', '范洁', null, null, null, '云南省第一人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('36', '12101045', '404e2a4cdd7620a89ab6e667944be070', '张曦', null, null, null, '云南省第一人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('37', '12101046', '25d19bc38b5feb7114411de64e3c0132', '匡晓辉', null, null, null, '云南省第一人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('38', '12101047', '5be2e7a0ad282c295bf22cb9cff4f0d4', '高晓龙', null, null, null, '云南省第一人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('39', '12101048', '15ac0d40f601582bd8bc46311771e45d', '左明鲜', null, null, null, '昆明市延安医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('40', '12101049', '7c90208a401dca908d4f04ef19bc8bdf', '盖启明', null, null, null, '昆明市延安医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('41', '12101050', '29d1fd87ae19e594aaf31707b52750fe', '刘屹', null, null, null, '昆明市延安医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('42', '12101051', '3262d8489a0c5fb26336db3d1827b5f7', '李绍龙', null, null, null, '昆明市延安医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('43', '12101052', 'c46e7eff1e4d02b23b3984bcf1479e76', '周旭', null, null, null, '昆明市延安医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('44', '12101053', '36ae00c2c9afff878c52c6391429b1a4', '张小勇', null, null, null, '昆明市延安医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('45', '12101054', 'e83b8fa6647dc4fecedfcb2e0ef2888b', '韩明华', null, null, null, '云南省第二人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('46', '12101055', '595b47e77172021cd0031fa0c5905407', '陶四明', null, null, null, '云南省第二人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('47', '12101056', 'd299a4dd12e6af1abffa2483ef7b22c4', '魏巍', null, null, null, '云南省第二人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('48', '12101057', '4b3561fbbde5da081f87c777df5ddd24', '郭传明', null, null, null, '成都军区昆明总医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('49', '12101058', 'e0430c65f7b1e95838ce063b78ca62cc', '叶金善', null, null, null, '成都军区昆明总医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('50', '12101059', '9fbbc5c65961fc8956638e7c7fef8d4d', '郝应禄', null, null, null, '玉溪人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('51', '12101060', '50e077841e49fa42854d19e2bbf6acd5', '梁梅', null, null, null, '玉溪人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('52', '12101061', '8690b26fd807aca39d8c6df227427698', '杨明', null, null, null, '玉溪人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('53', '12101062', 'aa58888ab6a431f38df01fd17ecaa4a7', '陈鸿云', null, null, null, '玉溪人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('54', '12101063', 'c386ea35ac272051c98f525e5d45d31e', '阮志敏', null, null, null, '昆明医科大学 第二附属医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('55', '12101064', 'd6a47356291628735207f055875d3510', '张明国', null, null, null, '昆明医科大学 第二附属医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('56', '12101065', 'ae742d5e4e5e26eb888589020a8bade5', '李永国', null, null, null, '昆明市第一人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('57', '12101066', '8acc9671e3da9bb595356e77e4036b3c', '翟菁', null, null, null, '云南圣约翰医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('58', '12101067', 'e5cd4b0e38df5051b3ce332aa70a531e', '张荣华', null, null, null, '个旧市人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('59', '12101068', 'c6a2000504ea816af57fe3d81f688fc2', '阳瑞', null, null, null, '文山州人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('60', '12101069', '998ecf9db0c8590f4ab84dec7c26c4fd', '杨莉', null, null, null, '楚雄州人民医院', '云南省', null, null, null);
INSERT INTO `doctor` VALUES ('61', '12101070', 'e0aeb43756496cc1fbac3379148b1f99', '舒茂琴', null, null, null, '三军医大附一院（西南）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('62', '12101071', '34d061c6ef596ca059e4d95ad8e5ab44', '钟理', null, null, null, '三军医大附一院（西南）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('63', '12101072', 'f53af10c8c7d3307b8e7f674edfb1b90', '邓盛荣', null, null, null, '三军医大附一院（西南）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('64', '12101073', 'fcd5ebcc1f75461bbe843246f54c190e', '李华康', null, null, null, '三军医大附一院（西南）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('65', '12101074', 'a394199d15e8e9790da433b086dce105', '柴虹', null, null, null, '三军医大附一院（西南）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('66', '12101075', 'd5f39dd863d649e769b72404e2b872bd', '周杨', null, null, null, '三军医大附一院（西南）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('67', '12101076', '73cd4f5d437594fed366ea533a15f779', '廖品亮', null, null, null, '三军医大附一院（西南）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('68', '12101077', 'b2be2e8e85a76e699d26421cf3fac1d7', '于学军', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('69', '12101078', '5facaac7b76130599dd9cae646ebd77b', '李爱民', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('70', '12101079', '8888808e5ab7f387420a24e0023971f3', '张波', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('71', '12101080', '823d9b7f5ed31ff0d3b03a49fb567f5b', '张邑', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('72', '12101081', 'ea0e997a7f6c1a1838546d9bfc36c146', '谭虎', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('73', '12101082', '2a7e6d8fc5efa371f54a1d6dc0249624', '成小凤', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('74', '12101083', '148a083a0c043d73d56e00afa5afe04f', '王国强', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('75', '12101084', '82473fc0bf5b318d0b82b5b904e827e3', '胡剑波', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('76', '12101085', 'b1a9204ab8ff24dad010e79339a9f535', '王霞', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('77', '12101086', '93a2185a5a09945119eccde373b14886', '宋元兵', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('78', '12101087', '68dfb6b352fb7c55f77f6296df9c44db', '谭亚军', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('79', '12101088', 'c4814f10ec6857cc937d7bf2d9d64f3c', '林春梅', null, null, null, '三军医大附二院（新桥）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('80', '12101089', '91b1e3d16a52cc36bb6a5aa723b6b1c6', '牟华明', null, null, null, '三峡中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('81', '12101090', '2270c02ef5a0449a6be88d8d5eb49980', '邵江', null, null, null, '三峡中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('82', '12101091', '2208a8cbb9035928e0a6c5b483f2a061', '庞小华', null, null, null, '三峡中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('83', '12101092', '32aacf0b160de09e3761e8ceb2f1fb85', '杨建军', null, null, null, '三峡中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('84', '12101093', 'b4abe81baff2d4bd78e10e9da112a6c5', '向立权', null, null, null, '涪陵中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('85', '12101094', 'f264428724a2efba22116a69ca52e4a0', '宁琳', null, null, null, '涪陵中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('86', '12101095', 'b1201397c213bf955525d7d6539efd9a', '蓝远竞', null, null, null, '涪陵中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('87', '12101096', 'a0694d84b2ce1426b4f0be398b45a464', '周音频', null, null, null, '涪陵中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('88', '12101097', 'f8a6dfc234b0d38ff8db1bb8fb9fb127', '吴中杰', null, null, null, '南川区人民医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('89', '12101098', '98e39cbc5af9809da4ca5454a59c1931', '于洋', null, null, null, '垫江县人民医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('90', '12101099', '3a758a2b90f2112f4d59267472da4091', '江兴旺', null, null, null, '垫江县中医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('91', '12101100', 'f1d579a8e2d5459fea5a6ef5ba38b33f', '王江', null, null, null, '重庆市第一人民医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('92', '12101101', '31aae03322f86dc79e007f8ffe3e01ad', '李芝锋', null, null, null, '重庆市第二人民医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('93', '12101102', 'e21f9b0c623cc4a56ba9deb01c9d960f', '冉擘力', null, null, null, '重庆市第三人民医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('94', '12101103', '566ca5d3a9b79c8ed11fef4550515593', '张源', null, null, null, '重庆市中山医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('95', '12101104', '118d804fb07b849659949cb552a254d9', '李正恭', null, null, null, '重庆市中山医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('96', '12101105', '837bb77ff56787f4bc0b8412f0f74066', '郑向清', null, null, null, '重庆市中山医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('97', '12101106', 'b2616123c53c0725d0c27ac1a5eeeedd', '易岂建', null, null, null, '重庆医科大学附属儿童医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('98', '12101107', '6b688551672f141e6e89522986b68d27', '吕铁伟', null, null, null, '重庆医科大学附属儿童医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('99', '12101108', '8d7e4a234fe3a0d0c2bb85b516870822', '刘晓燕', null, null, null, '重庆医科大学附属儿童医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('100', '12101109', '12941b1fa3addf6f492473dc3c9f9a88', '岳瑞华', null, null, null, '重庆市第四人民医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('101', '12101110', '42264afe5b1b7d20cc320a931682c384', '潘启蓉', null, null, null, '重庆市第九人民医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('102', '12101111', '6747d2aa39e9be8856035e6e60a87c2a', '黄骥', null, null, null, '重庆市武警总队医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('103', '12101112', '8f27d6ad2c6af5d1d453d180616e6d3c', '付世全', null, null, null, '重庆市江津区中心医院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('104', '12101113', '60885452225b615a05cb94fd54ad6f1a', '殷跃辉', null, null, null, '重庆医科大学附二院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('105', '12101114', 'f030bd2c73bf4614edaa7e9903af8270', '苏立', null, null, null, '重庆医科大学附二院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('106', '12101115', '589ec4a117081df264fde6e6abeff538', '刘增长', null, null, null, '重庆医科大学附二院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('107', '12101116', '8f2faf9aebc8406cb72bf2fb3705020a', '凌智瑜', null, null, null, '重庆医科大学附二院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('108', '12101117', 'bc6a582b7a154f1cb6e5341ced283083', '何泉', null, null, null, '重庆医科大学附一院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('109', '12101118', '4dd3be8fdc068d679b6b0734ee9799d6', '高凌云', null, null, null, '重庆医科大学附一院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('110', '12101119', '38f850a0ce6b56b2dabb959c72ea5b6b', '贾锋鹏', null, null, null, '重庆医科大学附一院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('111', '12101120', '72f536efc8c80e6dced0614533f927f4', '向睿', null, null, null, '重庆医科大学附一院', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('112', '12101121', '40d1032a9b33852a3890a66d5632060b', '方玉强', null, null, null, '第三军医大学附三院（大坪）', '重庆', null, null, null);
INSERT INTO `doctor` VALUES ('113', '12101122', 'd4b8773fe1290f7871c72c27aae17f56', '郑亚西', null, null, null, '贵州省人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('114', '12101123', '9fbdc8c9ac21880d642638f865a4c425', '杨龙', null, null, null, '贵州省人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('115', '12101124', '945a2b07c76a7ac21ea81810d01a9e7b', '田野', null, null, null, '贵州省人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('116', '12101125', 'b161644e21548716ffeb81ae06f4c063', '郑文庆', null, null, null, '贵阳中医学院附二院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('117', '12101126', 'b1476aa580a3926943371d9fdec9a18f', '文松海', null, null, null, '黔东南州人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('118', '12101127', '50d78afdf663d5464ae42c3b0cb6e727', '曾安宁', null, null, null, '黔南州人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('119', '12101128', '9173299e13205cd30f2a6f7ce95ae44b', '陈荣兴', null, null, null, '黔南州人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('120', '12101129', '6e913e01fc77e525109ac56f0ea66b91', '余吉西', null, null, null, '黔南州人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('121', '12101130', '043512c5b983648eeca05022fae76233', '李杰', null, null, null, '遵义市第一人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('122', '12101131', 'c4a93eeb9d70b43ebbbd69fcb2f9be12', '覃智芳', null, null, null, '遵义市第一人民医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('123', '12101132', 'fa889fc60199e1e298ec7c07d461a754', '张羽坤', null, null, null, '遵义417医院', '贵州省', null, null, null);
INSERT INTO `doctor` VALUES ('124', '12101133', '834a36d4f6882ba63d5f05c0cfee5138', '詹贤章', null, null, null, '广东省人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('125', '12101134', '8a60b0d865eb78e7aac743d0322dd74f', '薛玉梅', null, null, null, '广东省人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('126', '12101135', '974908588da20a5904c29d4c7a061c3c', '廖洪涛', null, null, null, '广东省人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('127', '12101136', '185076841aacdb1f4281faeccc18e1a1', '方咸宏', null, null, null, '广东省人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('128', '12101137', 'd647f8a8c605eb6128eb11a46cf3a82c', '曾少颖', null, null, null, '广东省人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('129', '12101138', '207c6444b9c18788ff1fa1fee594d54f', '何建桂', null, null, null, '中山大学附属第一医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('130', '12101139', 'e85bf39771b90c3623937dd812f214d2', '王礼春', null, null, null, '中山大学附属第一医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('131', '12101140', '7f0151d1f35ae6fc17a065f142a54e0b', '唐安丽', null, null, null, '中山大学附属第一医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('132', '12101141', '964707f306d44cac4555f0558ae152c5', '邓志华', null, null, null, '中山市人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('133', '12101142', '4767de11d96a69eb34133fd68e9667ec', '郭应军', null, null, null, '中山市中医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('134', '12101143', '9dacc65bf856a5f6e822c797843322a6', '鲁明军', null, null, null, '广州医科大学附属第一医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('135', '12101144', '308908d982cbe763901ffaa48bff989b', '林晓圳', null, null, null, '广州医科大学附属第二医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('136', '12101145', '1ed84e41d1199bd80978e5472689de49', '李文杰', null, null, null, '广州医科大学附属第三医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('137', '12101146', '70e41ab893019b1f7b5da41211620258', '郭军', null, null, null, '暨南大学附属第一医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('138', '12101147', '994a1d565550d342b41f07c7f816fba7', '陈小明', null, null, null, '暨南大学附属第一医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('139', '12101148', 'b05f940201966c081327d39990009f8f', '曾智桓', null, null, null, '广东药学院附属第一医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('140', '12101149', 'd6fe8dd51ad08f2603448f25ac952513', '朱洁明', null, null, null, '中山大学附属第三医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('141', '12101150', '76281f3dc0a293e74c375a0f5c42e02d', '郑振达', null, null, null, '中山大学附属第三医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('142', '12101151', '38534db0cb368221fb86a73670f212e8', '谢旭晶', null, null, null, '中山大学附属第三医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('143', '12101152', '19ebf2518b0a5c3a09e34f04cc7722b9', '张社兵', null, null, null, '韶关市粤北人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('144', '12101153', '33ff56844dd5eecfb870c60e9ae568c4', '李健豪', null, null, null, '番禺中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('145', '12101154', '09abc1e7e6dc1d58e7b5a4ea704f1d81', '丁春华', null, null, null, '广东省中医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('146', '12101155', 'bf37c4e6a6520878bdaa10563697db11', '杨平珍', null, null, null, '珠江医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('147', '12101156', '598fcd3d699f63ae6b2f8b682efdd7ac', '宋旭东', null, null, null, '珠江医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('148', '12101157', '52b7f8ff3f4b1df5802c16a548257d3b', '刘磊', null, null, null, '珠江医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('149', '12101158', '738b9f5265ee4d8d47cfb6530fa2175d', '张秀丽', null, null, null, '珠江医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('150', '12101159', '286c66ad22477397404321a142708688', '周贻军', null, null, null, '珠江医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('151', '12101160', '35502bc915416c3916be0b408bb1d938', '王先宝', null, null, null, '珠江医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('152', '12101161', '430fc600e8c4b7e9f8aa78bb71a97b11', '张奇峰', null, null, null, '梅州市人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('153', '12101162', 'ee3227c632806cf8456c8eb6820da00e', '刘广交', null, null, null, '梅州市人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('154', '12101163', '14f65b58283e3f4afa86a02d1de7094f', '王东明', null, null, null, '汕头大学第一附属医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('155', '12101164', 'b5f056a2656f79cc01352cdd76e89562', '蔡志雄', null, null, null, '汕头中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('156', '12101165', '9ba2a0b4bc91219f31420282b807a1e8', '黄健强', null, null, null, '汕头中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('157', '12101166', '88a9a34dc92416ac83ea8ff485d06ade', '方昶', null, null, null, '中山大学附属第二医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('158', '12101167', '4b0bcd0d2f5fa3fefe412c83cb075f85', '谢双伦', null, null, null, '中山大学附属第二医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('159', '12101168', 'b8259420549c596108b0db79ac05d237', '罗义', null, null, null, '广州市第一人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('160', '12101169', '5f878e7e30cb6d0f79e6950c61812cd8', '马骏', null, null, null, '广州军区总医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('161', '12101170', 'a5edb992819c56b59a3768f0da4de143', '黄石安', null, null, null, '广东医学院附属医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('162', '12101171', '59e2be384059c4eb426c8197d874fb99', '王怀龙', null, null, null, '广东医学院附属医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('163', '12101172', '786fd821ce6c6cdef15bef8fc15750f0', '李腾', null, null, null, '广东医学院附属医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('164', '12101173', '66adc0b3ddee049341b7a156f0662412', '李泽林', null, null, null, '湛江中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('165', '12101174', '501adeac7235520982b43f8141724b4f', '李庆军', null, null, null, '湛江中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('166', '12101175', '38ba50e06058ee46928da47b6fc210fb', '郭观华', null, null, null, '湛江中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('167', '12101176', 'dc27119b9c11f39c17cd93e091a344ee', '王格社', null, null, null, '湛江农垦医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('168', '12101177', '178d9db9b6dc2ab132c56117d679b7c6', '朱秀荣', null, null, null, '高州市人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('169', '12101178', '567ec7a548a76ef31e323670c21488e2', '黄国虹', null, null, null, '茂名人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('170', '12101179', 'c4f39a8596a64a9bb26d4a9a9b1e22d7', '林劲', null, null, null, '海南省人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('171', '12101180', 'd9bee001a40255afb4cb18cf1563d04c', '陈漠水', null, null, null, '海口市人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('172', '12101181', '6a5593969b551163026f5655d29301bf', '杜子军', null, null, null, '海口市人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('173', '12101182', '24ff156e469ece3aa450dc4b605b17ec', '梁毓源', null, null, null, '琼海市人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('174', '12101183', 'eba99fc42d79b0299ad6c8531bf34f26', '黎海文', null, null, null, '海南医学院附属医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('175', '12101184', 'd8d8dc6ed95211c050902cfb5da8949e', '邓金龙', null, null, null, '广西区人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('176', '12101185', '4b9804b510759b85aaf2759d38de06b0', '覃绍明', null, null, null, '广西区人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('177', '12101186', 'b8cf5ac78e773ad6fc70f883c01cfd97', '刘浩', null, null, null, '广西医科大学一附院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('178', '12101187', '7d80219ea75033024be4039877a35cbc', '钟国强', null, null, null, '广西医科大学一附院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('179', '12101188', '6eb520aad32d4c17e1250e784a2010bc', '文伟民', null, null, null, '广西医科大学一附院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('180', '12101189', '7ab56ed32f767cdb7c30d274a9d3e67a', '李金轶', null, null, null, '广西医科大学一附院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('181', '12101190', 'a601c7fc56e956696b8f5ccd3b1debd7', '何燕', null, null, null, '广西医科大学一附院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('182', '12101191', 'ee3c8ad10dd286050e507dc2a74084ab', '蒋靖波', null, null, null, '桂林市人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('183', '12101192', '7486fc6d4d9cc6c65559f33d4be765eb', '刘明', null, null, null, '玉林市第一医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('184', '12101193', '324e36d4663afc101d6fbe3e966d9bfc', '彭健', null, null, null, '南方医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('185', '12101194', '4b07f10d690a25ffb253f1ed58f81b7c', '黄晓波', null, null, null, '南方医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('186', '12101195', 'eececca69ad8378228e6d10e7e832503', '王月刚', null, null, null, '南方医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('187', '12101196', 'cd8172a4d674fea453bfb51ae68707a7', '黄兴福', null, null, null, '南方医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('188', '12101197', '955fead82abf1bf364ed95fe757ae989', '周滔', null, null, null, '南方医科大学第三附属医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('189', '12101198', '930a1d646d0cf55c6397f6dd7058f598', '彭宇程', null, null, null, '江门中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('190', '12101199', 'f8ac8f42ee414050ac5d3fb0a0a5e360', '高伟栋', null, null, null, '江门中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('191', '12101200', 'd522395a7001135d0a09c3e435a70f7b', '任强', null, null, null, '江门中心医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('192', '12101201', '15ef6eb3cae1f280716e2c094c72649f', '谭海斌', null, null, null, '佛山市第一人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('193', '12101202', '7b3187abc45de4cbdcdb0b0fbd721676', '温旭涛', null, null, null, '佛山市第一人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('194', '12101203', '1d16f670016e44b5bcb9c6d5d3d3877f', '廖禄明', null, null, null, '广东省第二人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('195', '12101204', 'f2320393132f94035c48c9b31e8ed376', '刘明', null, null, null, '肇庆市第一人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('196', '12101205', '9428598a306a0112b19b5b8d244510ad', '吴炎贤', null, null, null, '佛山市顺德人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('197', '12101206', '52d69ea37afbcc5a510fd5b34b297685', '郑素琳', null, null, null, '佛山市顺德人民医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('198', '12101207', '0fcf57713fb968017737a947d509217e', '吴同果', null, null, null, '广州市红十字会医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('199', '12101208', '1b4377409a1ae1305ee6eb979011b4b3', '谢启应', null, null, null, '湘雅医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('200', '12101209', 'b19cb002aff11733e65bf7d5b42c85f3', '吴名星', null, null, null, '湘潭市中心医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('201', '12101210', '603b1e34ad77c5ebad9de8f7c47fb2d0', '曾维理', null, null, null, '株洲市中心医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('202', '12101211', '889a0095ba60e3ed33c2aece8f08c78d', '吴昕', null, null, null, '浏阳市人民医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('203', '12101212', '8fa72a2e6f994c3f4df2ddeac98dc07a', '张翼', null, null, null, '湖南省人民医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('204', '12101213', '1dd03f4cb70ce0565043e252b16129ac', '刘启明', null, null, null, '湘雅二医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('205', '12101214', 'ab8ed7f72db7f0cdda380e4335a82c1d', '李旭平', null, null, null, '湘雅二医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('206', '12101215', 'e58975cdb6f4b052389b199f623319dd', '吴智宏', null, null, null, '湘雅二医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('207', '12101216', '86b9e38badc8baa5763f122f78bef1bd', '刘振江', null, null, null, '湘雅二医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('208', '12101217', 'ec4176de57e6db18150c96b9bc7b8207', '关贤颂', null, null, null, '长沙市中心医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('209', '12101218', '52c3ca165ebc7cee62ac23e0f7658dcd', '申强', null, null, null, '怀化市人民医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('210', '12101219', '0d40b9f368d7cf3827ff6f52b3eb9089', '张志辉', null, null, null, '湘雅三医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('211', '12101220', 'ffbde2e70a6d5a23fd4c1bdcb506afe9', '曾丽雄', null, null, null, '湘雅三医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('212', '12101221', 'a754ad99c25fdf902032a473b999d94b', '苏华', null, null, null, '南华附一', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('213', '12101222', '725c9fd2c8089d4d6cbaf6e062a4e265', '朱翔', null, null, null, '南华附二', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('214', '12101223', '45076e5628d1f50d965c17ae8fdfa4b3', '蒋路平', null, null, null, '衡阳市中心医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('215', '12101224', 'ca8ab435cba6c4fe3c2ff7391a930277', '赵庆禧', null, null, null, '衡阳市中心医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('216', '12101225', '81c51021d5bff5114dc57a3e5d75d6c9', '王才安', null, null, null, '郴州市四医院', '湖南省', null, null, null);
INSERT INTO `doctor` VALUES ('217', '12101226', 'f5ec0bf05ba89bf311aae5d429649c09', '王琳', null, null, null, '同济医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('218', '12101227', '6ecc431278edd5b2b4375fa91c4e991b', '王炎', null, null, null, '同济医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('219', '12101228', '810bf0b0314855ac10fecf0fedc3a5a4', '刘启功', null, null, null, '同济医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('220', '12101229', 'ee5074c16acd0d4e0152f0b66c4b940e', '林立', null, null, null, '同济医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('221', '12101230', '96a0426d06188f6da8309fecb7c13735', '赵春霞', null, null, null, '同济医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('222', '12101231', 'f7d170b494168fd0ad13220017290cf0', '王崇全', null, null, null, '太和医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('223', '12101232', 'bad2b915f3a1bc2af53dc81cb1b31989', '詹中群', null, null, null, '太和医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('224', '12101233', '70ecbaef8ad6eb430bd2274aa3195415', '党书毅', null, null, null, '太和医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('225', '12101234', '79e3a941d9830be6a00116e392936d66', '许海军', null, null, null, '太和医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('226', '12101235', '4e0fd71bec26be4a0c4eec814958d152', '曹正', null, null, null, '太和医院', '广东省', null, null, null);
INSERT INTO `doctor` VALUES ('227', '12101236', '375ad0ea63538a479a76389ca45bad92', '闵新文', null, null, null, '东风总医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('228', '12101237', '26f4fc8f762e8f92d3606ad244a5fefe', '于胜波', null, null, null, '东风总医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('229', '12101238', 'ee2e021abe73fdaab0fb53144ba97a55', '郎明健', null, null, null, '东风总医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('230', '12101239', 'c4cb2e1e1fecfc0f399c5d01fec37b96', '李东峰', null, null, null, '东风总医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('231', '12101240', 'df0408ea7d7e4a8c897753dc62a68d5d', '赵黎丙', null, null, null, '东风总医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('232', '12101241', 'd2f27d60fc80347c4783dfc46b37bbe3', '何培根', null, null, null, '东风总医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('233', '12101242', '99ad02468ec9d696774b55b767315cf1', '肖俊会', null, null, null, '十堰人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('234', '12101243', '1d40067cde777e6da139481a195b8233', '赵金河', null, null, null, '十堰人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('235', '12101244', 'dd2b7e910e30c31a4f868482d99342e4', '刘福元', null, null, null, '襄阳第一人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('236', '12101245', 'f212ceaa722a86d1c38f5b724b892494', '黎晓兰', null, null, null, '襄阳第一人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('237', '12101246', '4d5072ef4dd2f588f5f4dd6fce3a46c2', '周恒', null, null, null, '襄阳第一人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('238', '12101247', '445ad608c8e0a1c819afa6cc7e76fdc9', '汤永谦', null, null, null, '襄阳中心医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('239', '12101248', '871fe4b1cd349bff9a63dd25167251d2', '朱锐', null, null, null, '襄阳中心医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('240', '12101249', '82dd42d0d3bcef0e0d5b604c7766a4e4', '刘永胜', null, null, null, '襄阳中心医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('241', '12101250', '466ccbb35c4430735d552b7b50d0f085', '马可忠', null, null, null, '襄阳中心医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('242', '12101251', '57060a870b83779324045c3bfcc131cf', '董晓雁', null, null, null, '武汉市三医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('243', '12101252', '97ca4a454e97e032ba1e18cca304d3ec', '张远恒', null, null, null, '武汉市三医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('244', '12101253', '1cc1b339e8d17467f84dc78e490c147a', '蒋雯', null, null, null, '武汉市三医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('245', '12101254', '05e4d99320257db5659ca0d64f5864b8', '祝芬', null, null, null, '武汉市三医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('246', '12101255', '6f798b04f2401d3d5150b27f93d2de2b', '江洪', null, null, null, '湖北省人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('247', '12101256', '24d5ef170580c638cd2870d9593a3c0b', '黄鹤', null, null, null, '湖北省人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('248', '12101257', 'c32ab87ac92b5e97477dd2817aaa3078', '吴刚', null, null, null, '湖北省人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('249', '12101258', 'f6c43605c4cb380ade1df64eba9220a8', '杨波', null, null, null, '湖北省人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('250', '12101259', '3bd82c92306cc685cb095d617a5aeabf', '赵庆彦', null, null, null, '湖北省人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('251', '12101260', '7da800e423ff718f88a0fa9004b4a5d5', '鲁志兵', null, null, null, '湖北省人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('252', '12101261', '54cc6bfa07a2969a8728c32254cd5b9b', '姚述远', null, null, null, '武汉大学中南医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('253', '12101262', 'ab57bb7de88826ef41949b4949f81b4c', '丁家望', null, null, null, '宜昌市中心人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('254', '12101263', 'aeded10d601d8889499a582192499e93', '陈曼华', null, null, null, '武汉市中心医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('255', '12101264', '611710fcf984ea74b9ed62c071f309e4', '毛晓波', null, null, null, '武汉协和医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('256', '12101265', 'fb18f1b63d1536e94a72a2620ab001a7', '钟禹成', null, null, null, null, '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('257', '12101266', 'fcb06397e1f77fcf60166bc0fe67fa7f', '陈志坚', null, null, null, null, '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('258', '12101267', '4e58e5582e8d773e67de090c0df4df3a', '张家明', null, null, null, null, '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('259', '12101268', '7eb550cf930202e397ebef024939b1dc', '高波', null, null, null, '武汉市普爱医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('260', '12101269', '050804f310af23158bd934ac4ca06af3', '白玉鹏', null, null, null, null, '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('261', '12101270', 'e7a83332f31284087fb5fc193218a255', '陈志楠', null, null, null, '广州军区武汉总医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('262', '12101271', '8806c7435a8a31a0c6a938740a6816cb', '卢青', null, null, null, null, '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('263', '12101272', 'c48a372b46a9ca195a549755d3c5be1c', '周忠泉', null, null, null, '荆州市第一人民医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('264', '12101273', '4340c67b64508c882fb07caac97782a5', '杨华', null, null, null, '荆州市中心医院', '湖北省', null, null, null);
INSERT INTO `doctor` VALUES ('265', '12101274', '78b69492310cb949d79a7f5910d3f3d0', '张宏伟', null, null, '15008478625', '恩施中心医院', '湖北省', null, null, null);

-- ----------------------------
-- Table structure for file
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `interrogation_record_id` int(11) DEFAULT NULL COMMENT '???????id',
  `name` varchar(50) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COMMENT='?????';

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('1', '1', 'test', '1', 'dfdd', null, null, null);
INSERT INTO `file` VALUES ('2', '1', 'test2', '2', 'aaaa', null, null, null);
INSERT INTO `file` VALUES ('3', '2', 'test3', '3', 'bbb', 'aa', 'aa', 'aa');

-- ----------------------------
-- Table structure for follow_up
-- ----------------------------
DROP TABLE IF EXISTS `follow_up`;
CREATE TABLE `follow_up` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `interrogation_record_id` int(11) NOT NULL COMMENT '???????id',
  `follow_up_time` datetime DEFAULT NULL COMMENT '???????',
  `follow_up_method` varchar(50) DEFAULT NULL COMMENT '??????',
  `onset_evidence` varchar(50) DEFAULT NULL COMMENT '???????',
  `evidence_source` varchar(200) DEFAULT NULL COMMENT '??????',
  `postoperative_anticoagulation` varchar(40) DEFAULT NULL COMMENT '????????????',
  `postoperative_complications` varchar(255) DEFAULT NULL COMMENT '???????',
  `postoperative_arrhythmias` varchar(30) DEFAULT NULL COMMENT '???????????',
  `postoperatie_adds` varchar(255) DEFAULT NULL COMMENT '???? AADs',
  `postoperatie_medication` varchar(255) DEFAULT NULL COMMENT '???????????',
  `echocardiographic_time` varchar(30) DEFAULT NULL COMMENT '???????????',
  `postoperatie_la` varchar(30) DEFAULT NULL COMMENT '????????la',
  `postoperatie_lv` varchar(30) DEFAULT NULL COMMENT '????????lv',
  `postoperatie_lvef` varchar(30) DEFAULT NULL COMMENT '????????lvef',
  `left_thrombosis` varchar(30) DEFAULT NULL COMMENT '??????????',
  `check_method` varchar(30) DEFAULT NULL COMMENT '??????',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  `postoperative_arrhythmias_time` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_5` (`interrogation_record_id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`interrogation_record_id`) REFERENCES `interrogation_record` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of follow_up
-- ----------------------------

-- ----------------------------
-- Table structure for interrogation_record
-- ----------------------------
DROP TABLE IF EXISTS `interrogation_record`;
CREATE TABLE `interrogation_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `doctor_id` int(11) NOT NULL COMMENT '???id(??????',
  `patient_id` int(11) NOT NULL COMMENT '????id(??????',
  `case_type` varchar(100) DEFAULT NULL COMMENT '????????',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_1` (`doctor_id`),
  KEY `FK_Reference_2` (`patient_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interrogation_record
-- ----------------------------
INSERT INTO `interrogation_record` VALUES ('1', '2', '1', '房速', null, null, null);
INSERT INTO `interrogation_record` VALUES ('2', '2', '1', '房速', null, null, null);
INSERT INTO `interrogation_record` VALUES ('3', '2', '1', '室速', null, null, null);
INSERT INTO `interrogation_record` VALUES ('4', '2', '1', '室速', null, null, null);
INSERT INTO `interrogation_record` VALUES ('5', '2', '1', '室速', null, null, null);
INSERT INTO `interrogation_record` VALUES ('6', '2', '1', '室速', null, null, null);

-- ----------------------------
-- Table structure for medical_history
-- ----------------------------
DROP TABLE IF EXISTS `medical_history`;
CREATE TABLE `medical_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_id` int(11) NOT NULL COMMENT '????id',
  `type_name` varchar(30) DEFAULT NULL COMMENT '???????????',
  `oprate_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `detail` varchar(500) DEFAULT NULL COMMENT '???????',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  `disease_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_3` (`patient_id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medical_history
-- ----------------------------
INSERT INTO `medical_history` VALUES ('1', '1', 'test', '2015-01-28 14:04:17', null, null, null, null, null);
INSERT INTO `medical_history` VALUES ('2', '1', 'test2', '2015-01-28 14:04:24', null, null, null, null, null);
INSERT INTO `medical_history` VALUES ('3', '1', 'test2', '2015-01-28 14:04:43', null, null, null, null, null);

-- ----------------------------
-- Table structure for options
-- ----------------------------
DROP TABLE IF EXISTS `options`;
CREATE TABLE `options` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL COMMENT '?????',
  `name` varchar(30) DEFAULT NULL COMMENT '???????',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of options
-- ----------------------------

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '????',
  `id_card` varchar(18) NOT NULL DEFAULT '' COMMENT '???????',
  `birthday` datetime DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT '' COMMENT '?????',
  `adress` varchar(100) DEFAULT '' COMMENT '?????',
  `education_level` varchar(20) DEFAULT NULL COMMENT '??????',
  `profession` varchar(20) DEFAULT NULL COMMENT '??',
  `keyword1` varchar(100) DEFAULT NULL,
  `keyword2` varchar(100) DEFAULT NULL,
  `keyword3` varchar(100) DEFAULT NULL,
  `age` int(6) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('1', 'test', '23434234', '0000-00-00 00:00:00', '23434324234', 'fsdfsd', 'df', 'sdf', null, null, null, '21', 'df');
INSERT INTO `patient` VALUES ('2', 'test', '3155', '2015-01-20 13:36:35', null, null, null, null, null, null, null, null, null);
INSERT INTO `patient` VALUES ('3', 'test', '31155', '2015-01-20 14:04:18', null, null, null, null, null, null, null, null, null);
INSERT INTO `patient` VALUES ('4', 'test', '314155', '1970-01-06 04:36:00', null, null, null, null, null, null, null, null, null);
INSERT INTO `patient` VALUES ('5', 'test', '3141515', '1969-12-27 09:24:00', null, null, null, null, null, null, null, null, null);
INSERT INTO `patient` VALUES ('6', 'test', '31415115', '1969-12-27 09:24:00', null, null, null, null, null, null, null, null, null);
INSERT INTO `patient` VALUES ('7', 'test', '3141151115', '1969-12-27 09:24:00', null, null, null, null, null, null, null, null, null);
