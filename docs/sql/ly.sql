/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2014/11/28 20:23:26                          */
/*==============================================================*/

drop database if exists ly;

create database ly;
use ly

grant SELECT,INSERT,UPDATE,DELETE,EXECUTE on ly.* to 'xhremote'@'localhost' IDENTIFIED BY 'xhremote';

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
   id                   int(11) not null auto_increment comment '????',
   name                 varchar(20) comment '????????',
   interrogation_record_id int(11) not null comment '??????¼id',
   operation_data       timestamp default '0000-00-00 00:00:00',
   operator_name        varchar(30) default NULL comment '??????????',
   operator_detail      varchar(500) default NULL comment '????????',
   vt_type              varchar(30) default NULL comment '????????',
   vt_course_disease    varchar(30) default NULL comment '???ٲ???',
   arrhythmia_diagnose  varchar(300) default NULL comment '?ٴ?????ʧ??????',
   electrophysiology_diagnose varchar(300) default NULL comment '??????????????',
   postoperation_diagnose varchar(300) default NULL comment '????????',
   mechanism            varchar(20) default NULL comment '????',
   part                 varchar(30) default NULL comment '??λ',
   la_bore              varchar(20) default NULL comment 'LA?ھ?',
   lv_bore              varchar(20) default NULL comment 'lv?ھ?',
   lvef_bore            varchar(20) default NULL comment 'LVEF_?ھ?',
   ra_bore              varchar(20) default NULL comment 'RA?ھ?',
   rv_bore              varchar(20) default NULL comment 'RV?ھ?',
   ucg_remarks          varchar(200) default NULL comment 'UCG??ע',
   ecg_type             varchar(30) default NULL comment 'ECG??֧????????',
   electrical_offset    varchar(30) default NULL comment '????ƫ??',
   preopreative_examination varchar(255) default NULL comment '??ǰ??????????Ҫ????????',
   anti_arrhythmia_drugs varchar(100) default NULL comment '??ǰ??????ʧ??ҩ??',
   invali_danti_arrhythmia_drugs varchar(100) default NULL comment '??ǰ??Ч??????ʧ??ҩ??',
   merger_arrhythmia    varchar(100) default NULL comment '??ǰ?ϲ?????ʧ??',
   imaging_inside_heart varchar(50) default NULL comment '????????Ӱ',
   induced_way          varchar(50) default NULL comment '?շ???ʽ',
   check_medication     varchar(50) default NULL comment '??????ҩ',
   tachycardia_regulation varchar(50) default NULL comment '?Ķ????ٷ????Ƿ?????',
   ccl                  varchar(50) default NULL comment '?ܳ???CCL??',
   inspection_method    varchar(30) default NULL comment '???鷽??',
   diastolic_potential  varchar(50) default NULL comment '?????ڵ?λ',
   p_potential_examination varchar(30) default NULL comment 'P??λ????',
   ablation_procedure   varchar(50) default NULL comment '??????ʽ',
   ablation_lines       varchar(50) default NULL comment '???ھ???',
   target_position      varchar(20) default NULL comment '?е㲿λ',
   ablation_energy      varchar(30) default NULL comment '??????Դ',
   ablation_judgement   varchar(50) default NULL comment '?ж???????Чָ??',
   ablation_end_point   varchar(20) default NULL comment '?????յ?',
   effective_target_site varchar(20) default NULL comment '??Ч?е?',
   discharge_time       varchar(30) default NULL comment '?ܷŵ?ʱ??',
   xray_exposure_time   varchar(30) default NULL comment 'x?߱???ʱ??',
   ablation_times       int(11) default NULL comment '???ڴ???',
   intraoperative_cable_rate varchar(20) default NULL comment '???е縴??',
   before_heart_rate    varchar(20) default NULL comment '????ǰ????',
   before_vt            varchar(20) default '' comment '????ǰ????',
   before_ront          varchar(20) default NULL comment '????ǰ????',
   before_remarks       varchar(300) default NULL comment '????ǰ??ע',
   in_heart_rate        varchar(20) default NULL comment '????????????',
   in_vt                varchar(20) default NULL comment '????????',
   in_ront              varchar(20) default NULL comment '????????',
   in_remarks           varchar(300) default NULL comment '???б?ע',
   complication_heart_rate varchar(20) default NULL comment '????֢????????',
   complication_vt      varchar(20) default NULL comment '????֢????',
   complication_ront    varchar(20) default NULL comment '????֢????',
   complication_remarks varchar(300) default NULL comment '????֢??ע',
   picture_url          varchar(50) default NULL comment 'ͼƬ·??',
   global_remarks       varchar(500) default NULL comment 'ȫ?ֱ?ע',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table case1 comment '??һ?ֲ?????';

/*==============================================================*/
/* Table: doctor                                                */
/*==============================================================*/
create table doctor
(
   id                   int(11) not null auto_increment comment 'id????????',
   user_id              varchar(50) comment 'ҽ??id',
   password             varchar(50) not null comment '????',
   name                 varchar(20) comment 'ҽ??????',
   major                varchar(50) comment '???η???',
   job_title            varchar(30) comment 'ְ??',
   contact_number       varchar(20) not null comment '??ϵ??ʽ',
   belong_hospital      varchar(50)  comment '????ҽԺ',
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
   interrogation_record_id int comment '??????¼id',
   name                 varchar(50),
   type                 int,
   url                  varchar(100),
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
);

alter table file comment '?ļ???';

/*==============================================================*/
/* Table: follow_up                                             */
/*==============================================================*/
create table follow_up
(
   id                   int(11) not null auto_increment,
   interrogation_record_id int(11) not null comment '??????¼id',
   follow_up_time       datetime default NULL comment '????ʱ??',
   follow_up_method     varchar(50) default NULL comment '???÷???',
   onset_evidence       varchar(50) default NULL comment '????֤??',
   evidence_source      varchar(200) default NULL comment '֤????Դ',
   postoperative_anticoagulation varchar(40) default NULL comment '????????????',
   postoperative_complications varchar(255) default NULL comment '???󲢷?֢',
   postoperative_arrhythmias varchar(30) default NULL comment '????????ʧ??',
   postoperatie_adds    varchar(255) default NULL comment '???? AADs',
   postoperatie_medication varchar(255) default NULL comment '??????????ҩ',
   echocardiographic_time varchar(30) default NULL comment '????????ʱ??',
   postoperatie_la      varchar(30) default NULL comment '????????la',
   postoperatie_lv      varchar(30) default NULL comment '????????lv',
   postoperatie_lvef    varchar(30) default NULL comment '????????lvef',
   left_thrombosis      varchar(30) default NULL comment '????????Ѫ˨',
   check_method         varchar(30) default NULL comment '???ⷽ??',
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
   doctor_id            int(11) not null comment 'ҽ??id(??????',
   patient_id           int(11) not null comment '????id(??????',
   case_type            varchar(100) default NULL comment '????????',
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
   patient_id           int(11) not null comment '????id',
   type_name            varchar(30) default NULL comment '??ʷ????????',
   oprate_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   detail               varchar(500) default NULL comment '??ʷ????',
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
   number               int(11) default NULL comment 'ѡ????',
   name                 varchar(30) default NULL comment 'ѡ??????',
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
   name                 varchar(20) not null comment '????',
   id_card              varchar(18) not null default '' comment '????֤??',
   birthday             timestamp not null default '0000-00-00 00:00:00',
   phone_number         varchar(20) not null default '' comment '?绰????',
   adress               varchar(100) not null default '' comment '??ͥסַ',
   education_level      varchar(20) default NULL comment '?Ļ??̶?',
   profession           varchar(20) not null comment 'ְҵ',
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

