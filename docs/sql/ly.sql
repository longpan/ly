/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2014/11/28 20:23:26                          */
/*==============================================================*/


drop table if exists case1;

drop table if exists doctor;

drop table if exists file;

drop table if exists follow_up;

drop table if exists interrogation_record;

drop table if exists medical_history;

drop table if exists options;

drop table if exists patient;

/*==============================================================*/
/* Table: case1                                                 */
/*==============================================================*/
create table case1
(
   id                   int(11) not null auto_increment comment '主键',
   name                 varchar(20) comment '病例名称',
   interrogation_record_id int(11) not null comment '问诊记录id',
   operation_data       timestamp default '0000-00-00 00:00:00',
   operator_name        varchar(30) default NULL comment '手术者姓名',
   operator_detail      varchar(500) default NULL comment '手术详情',
   vt_type              varchar(30) default NULL comment '室速类型',
   vt_course_disease    varchar(30) default NULL comment '室速病程',
   arrhythmia_diagnose  varchar(300) default NULL comment '临床心律失常诊断',
   electrophysiology_diagnose varchar(300) default NULL comment '电生理检查诊断',
   postoperation_diagnose varchar(300) default NULL comment '术后诊断',
   mechanism            varchar(20) default NULL comment '机制',
   part                 varchar(30) default NULL comment '部位',
   la_bore              varchar(20) default NULL comment 'LA内径',
   lv_bore              varchar(20) default NULL comment 'lv内径',
   lvef_bore            varchar(20) default NULL comment 'LVEF_内径',
   ra_bore              varchar(20) default NULL comment 'RA内径',
   rv_bore              varchar(20) default NULL comment 'RV内径',
   ucg_remarks          varchar(200) default NULL comment 'UCG备注',
   ecg_type             varchar(30) default NULL comment 'ECG束支阻滞类型',
   electrical_offset    varchar(30) default NULL comment '电轴偏移',
   preopreative_examination varchar(255) default NULL comment '术前其他检查重要阳性描述',
   anti_arrhythmia_drugs varchar(100) default NULL comment '术前抗心律失常药物',
   invali_danti_arrhythmia_drugs varchar(100) default NULL comment '术前无效抗心律失常药物',
   merger_arrhythmia    varchar(100) default NULL comment '术前合并心律失常',
   imaging_inside_heart varchar(50) default NULL comment '心脏内造影',
   induced_way          varchar(50) default NULL comment '诱发方式',
   check_medication     varchar(50) default NULL comment '检查用药',
   tachycardia_regulation varchar(50) default NULL comment '心动过速发作是否规则',
   ccl                  varchar(50) default NULL comment '周长（CCL）',
   inspection_method    varchar(30) default NULL comment '检查方法',
   diastolic_potential  varchar(50) default NULL comment '舒张期电位',
   p_potential_examination varchar(30) default NULL comment 'P电位标测',
   ablation_procedure   varchar(50) default NULL comment '消融术式',
   ablation_lines       varchar(50) default NULL comment '消融径线',
   target_position      varchar(20) default NULL comment '靶点部位',
   ablation_energy      varchar(30) default NULL comment '消融能源',
   ablation_judgement   varchar(50) default NULL comment '判断消融有效指标',
   ablation_end_point   varchar(20) default NULL comment '消融终点',
   effective_target_site varchar(20) default NULL comment '有效靶点',
   discharge_time       varchar(30) default NULL comment '总放电时间',
   xray_exposure_time   varchar(30) default NULL comment 'x线暴光时间',
   ablation_times       int(11) default NULL comment '消融次数',
   intraoperative_cable_rate varchar(20) default NULL comment '术中电复率',
   before_heart_rate    varchar(20) default NULL comment '消融前心率',
   before_vt            varchar(20) default '' comment '消融前室速',
   before_ront          varchar(20) default NULL comment '消融前室早',
   before_remarks       varchar(300) default NULL comment '消融前备注',
   in_heart_rate        varchar(20) default NULL comment '术中窦性心率',
   in_vt                varchar(20) default NULL comment '术中室速',
   in_ront              varchar(20) default NULL comment '术中室早',
   in_remarks           varchar(300) default NULL comment '术中备注',
   complication_heart_rate varchar(20) default NULL comment '并发症窦性心率',
   complication_vt      varchar(20) default NULL comment '并发症室速',
   complication_ront    varchar(20) default NULL comment '并发症室早',
   complication_remarks varchar(300) default NULL comment '并发症备注',
   picture_url          varchar(50) default NULL comment '图片路径',
   global_remarks       varchar(500) default NULL comment '全局备注',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table case1 comment '第一种病例表';

/*==============================================================*/
/* Table: doctor                                                */
/*==============================================================*/
create table doctor
(
   id                   int(11) not null auto_increment comment 'id（主键）',
   user_id              varchar(50) not null comment '医生id',
   password             varchar(50) not null comment '密码',
   name                 varchar(20) not null comment '医生姓名',
   major                varchar(50) not null comment '主治方向',
   job_title            varchar(30) not null comment '职称',
   contact_number       varchar(20) not null comment '联系方式',
   belong_hospital      varchar(50) not null comment '所属医院',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   certification_number varchar(50),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: file                                                  */
/*==============================================================*/
create table file
(
   id                   int not null auto_increment,
   interrogation_record_id int comment '问诊记录id',
   name                 varchar(50),
   type                 int,
   url                  varchar(100),
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
);

alter table file comment '文件表';

/*==============================================================*/
/* Table: follow_up                                             */
/*==============================================================*/
create table follow_up
(
   id                   int(11) not null auto_increment,
   interrogation_record_id int(11) not null comment '问诊记录id',
   follow_up_time       datetime default NULL comment '随访时间',
   follow_up_method     varchar(50) default NULL comment '随访方法',
   onset_evidence       varchar(50) default NULL comment '发作证据',
   evidence_source      varchar(200) default NULL comment '证据来源',
   postoperative_anticoagulation varchar(40) default NULL comment '术后抗凝治疗',
   postoperative_complications varchar(255) default NULL comment '术后并发症',
   postoperative_arrhythmias varchar(30) default NULL comment '术后心率失常',
   postoperatie_adds    varchar(255) default NULL comment '术后 AADs',
   postoperatie_medication varchar(255) default NULL comment '术后其他用药',
   echocardiographic_time varchar(30) default NULL comment '术后超声时间',
   postoperatie_la      varchar(30) default NULL comment '术后超声la',
   postoperatie_lv      varchar(30) default NULL comment '术后超声lv',
   postoperatie_lvef    varchar(30) default NULL comment '术后超声lvef',
   left_thrombosis      varchar(30) default NULL comment '术后左房血栓',
   check_method         varchar(30) default NULL comment '检测方法',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: interrogation_record                                  */
/*==============================================================*/
create table interrogation_record
(
   id                   int not null auto_increment,
   doctor_id            int(11) not null comment '医生id(外键）',
   patient_id           int(11) not null comment '病人id(外键）',
   case_type            varchar(100) default NULL comment '病例类型',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: medical_history                                       */
/*==============================================================*/
create table medical_history
(
   id                   int(11) not null auto_increment,
   patient_id           int(11) not null comment '病人id',
   type_name            varchar(30) default NULL comment '病史类型名称',
   oprate_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   detail               varchar(500) default NULL comment '病史详情',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: options                                               */
/*==============================================================*/
create table options
(
   id                   int(11) not null auto_increment,
   number               int(11) default NULL comment '选项号',
   name                 varchar(30) default NULL comment '选项名称',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: patient                                               */
/*==============================================================*/
create table patient
(
   id                   int(11) not null auto_increment,
   name                 varchar(20) not null comment '姓名',
   id_card              varchar(18) not null default '' comment '身份证号',
   birthday             timestamp not null default '0000-00-00 00:00:00',
   phone_number         varchar(20) not null default '' comment '电话号码',
   adress               varchar(100) not null default '' comment '家庭住址',
   education_level      varchar(20) default NULL comment '文化程度',
   profession           varchar(20) not null comment '职业',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table case1 add constraint FK_Reference_4 foreign key (interrogation_record_id)
      references interrogation_record (id) on delete restrict on update restrict;

alter table follow_up add constraint FK_Reference_5 foreign key (interrogation_record_id)
      references interrogation_record (id) on delete restrict on update restrict;

alter table interrogation_record add constraint FK_Reference_1 foreign key (doctor_id)
      references doctor (id) on delete restrict on update restrict;

alter table interrogation_record add constraint FK_Reference_2 foreign key (patient_id)
      references patient (id) on delete restrict on update restrict;

alter table medical_history add constraint FK_Reference_3 foreign key (patient_id)
      references patient (id) on delete restrict on update restrict;

