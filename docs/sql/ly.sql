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

drop table if exists case2;

/*==============================================================*/
/* Table: case1                                                 */
/*==============================================================*/
create table case1
(
   id                   int(11) not null auto_increment comment '????',
   name                 varchar(100) comment '????????',
   interrogation_record_id int(11) not null comment '???????id',
   operation_data       timestamp default '0000-00-00 00:00:00',
   operator_name        varchar(100) default NULL comment '??????????',
   operator_detail      varchar(500) default NULL comment '????????',
   vt_type              varchar(100) default NULL comment '????????',
   vt_course_disease    varchar(100) default NULL comment '???????',
   arrhythmia_diagnose  varchar(500) default NULL comment '??????????????',
   electrophysiology_diagnose varchar(500) default NULL comment '??????????????',
   postoperation_diagnose varchar(500) default NULL comment '????????',
   mechanism            varchar(100) default NULL comment '????',
   part                 varchar(100) default NULL comment '??λ',
   la_bore              varchar(100) default NULL comment 'LA???',
   lv_bore              varchar(100) default NULL comment 'lv???',
   lvef_bore            varchar(100) default NULL comment 'LVEF_???',
   ra_bore              varchar(100) default NULL comment 'RA???',
   rv_bore              varchar(100) default NULL comment 'RV???',
   ucg_remarks          varchar(500) default NULL comment 'UCG???',
   ecg_type             varchar(100) default NULL comment 'ECG???????????',
   electrical_offset    varchar(100) default NULL comment '???????',
   preopreative_examination varchar(500) default NULL comment '??????????????????????',
   anti_arrhythmia_drugs varchar(500) default NULL comment '???????????????',
   invali_danti_arrhythmia_drugs varchar(500) default NULL comment '?????Ч????????????',
   merger_arrhythmia    varchar(500) default NULL comment '?????????????',
   imaging_inside_heart varchar(50) default NULL comment '?????????',
   induced_way          varchar(50) default NULL comment '??????',
   check_medication     varchar(500) default NULL comment '???????',
   tachycardia_regulation varchar(50) default NULL comment '?????????????????',
   ccl                  varchar(50) default NULL comment '?????CCL??',
   inspection_method    varchar(100) default NULL comment '??????',
   diastolic_potential  varchar(50) default NULL comment '???????λ',
   p_potential_examination varchar(100) default NULL comment 'P??λ????',
   ablation_procedure   varchar(500) default NULL comment '???????',
   ablation_lines       varchar(500) default NULL comment '???????',
   target_position      varchar(500) default NULL comment '?е?λ',
   ablation_energy      varchar(100) default NULL comment '???????',
   ablation_judgement   varchar(50) default NULL comment '?ж???????Ч???',
   ablation_end_point   varchar(500) default NULL comment '???????',
   effective_target_site varchar(100) default NULL comment '??Ч?е?',
   discharge_time       varchar(100) default NULL comment '???????',
   xray_exposure_time   varchar(100) default NULL comment 'x????????',
   ablation_times       int(11) default NULL comment '???????',
   intraoperative_cable_rate varchar(100) default NULL comment '???е縴??',
   before_heart_rate    varchar(100) default NULL comment '?????????',
   before_vt            varchar(100) default '' comment '?????????',
   before_ront          varchar(100) default NULL comment '?????????',
   before_remarks       varchar(500) default NULL comment '????????',
   in_heart_rate        varchar(100) default NULL comment '????????????',
   in_vt                varchar(100) default NULL comment '????????',
   in_ront              varchar(100) default NULL comment '????????',
   in_remarks           varchar(300) default NULL comment '???б??',
   global_remarks       varchar(500) default NULL comment '?????',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   operation_number	varchar(100),
   case_number		varchar(100),
   vt_frequency		varchar(100),
   vt_every_attack_time  varchar(100),
   vt_last_attack_time   varchar(100),
   cardioversion_method	 varchar(500),
   cardioversion_medication	varchar(500),
   complication		varchar(500), 
   vt_duration		varchar(100),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table case1 comment '??????????';



create table case2
(
  id                       int(11) not null AUTO_INCREMENT comment '????',
  name varchar(100)        default NULL comment '????????',
  interrogation_record_id  int(11) not null comment '???????id',
  operation_data           timestamp not null default '0000-00-00 00:00:00',
  operator_name            varchar(100) default NULL comment '??????????',
  operator_detail          varchar(500) default NULL comment '????????',
  arrhythmia_diagnose      varchar(300) default NULL comment '??????????????',
  electrophysiology_diagnose varchar(300) default NULL comment '??????????????',
  postoperation_diagnose   varchar(300) default NULL comment '????????',
  mechanism                varchar(100) default NULL comment '????',
  part                     varchar(100) default NULL comment '??λ',
  la_bore                  varchar(100) default NULL comment 'LA???',
  lv_bore                  varchar(100) default NULL comment 'lv???',
  lvef_bore                varchar(100) default NULL comment 'LVEF_???',
  ra_bore                  varchar(100) default NULL comment 'RA???',
  rv_bore                  varchar(100) default NULL comment 'RV???',
  ucg_remarks              varchar(200) default NULL comment 'UCG???',
#  preopreative_examination varchar(255) default NULL comment '??????????????????????',
  anti_arrhythmia_drugs    varchar(100) default NULL comment '???????????????',
  invali_danti_arrhythmia_drugs varchar(100) default NULL comment '?????Ч????????????',
  merger_arrhythmia        varchar(100) default NULL comment '?????????????',
  imaging_inside_heart     varchar(100) default NULL comment '?????????',
  induced_way              varchar(100) default NULL comment '??????',
  check_medication         varchar(100) default NULL comment '???????',
  tachycardia_regulation   varchar(100) default NULL comment '?????????????????',
  ccl                      varchar(100) default NULL comment '?????CCL??',
  inspection_method        varchar(100) default NULL comment '??????',
#  diastolic_potential      varchar(100) default NULL comment '???????λ',
#  p_potential_examination  varchar(100) default NULL comment 'P??λ????',
  ablation_procedure       varchar(100) default NULL comment '???????',
  ablation_lines           varchar(100) default NULL comment '???????',
  target_position          varchar(100) default NULL comment '?е?λ',
  ablation_energy          varchar(100) default NULL comment '???????',
#  ablation_judgement       varchar(100) default NULL comment '?ж???????Ч???',
  ablation_end_point       varchar(100) default NULL comment '???????',
  effective_target_site    varchar(100) default NULL comment '??Ч?е?',
  discharge_time           varchar(100) default NULL comment '???????',
  xray_exposure_time       varchar(100) default NULL comment 'x????????',
  ablation_times           int(11) default NULL comment '???????',
  intraoperative_cable_rate varchar(100) default NULL comment '???е縴??',
  before_heart_rate        varchar(100) default NULL comment '?????????',
  before_rr                varchar(100) default '' comment '?????????',
  before_re              varchar(100) default NULL comment '?????????',
  before_remarks           varchar(300) default NULL comment '????????',
  in_heart_rate            varchar(100) default NULL comment '????????????',
  in_rr                    varchar(100) default NULL comment '????????',
  in_re                  varchar(100) default NULL comment '????????',
  in_remarks               varchar(300) default NULL comment '???б??',
  global_remarks           varchar(500) default NULL comment '?????',
  keyword1                 varchar(100) default NULL,
  keyword2                 varchar(100) default NULL,
  keyword3                 varchar(100) default NULL,
  operation_number         varchar(100) default NULL,
  case_number              varchar(100) default NULL,

  rr_frequency             varchar(100) default NULL,
  rr_every_attack_time     varchar(100) default NULL,
  rr_last_attack_time      varchar(100) default NULL,
  cardioversion_method     varchar(100) default NULL,
  cardioversion_medication varchar(100) default NULL,
  complication             varchar(100) default NULL,
  rr_ablation_treatment    varchar(100) default NULL,
  before_anticoagulant     varchar(100) default NULL,
  rr_type                  varchar(100) default NULL comment '????????',
  rr_course_disease        varchar(100) default NULL comment '???????',
  la_thrombus_detection	   varchar(100) ,
  mapping_mode			   varchar(100),
  rr_duration		   varchar(100) ,
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



/*==============================================================*/
/* Table: case3                                                 */
/*==============================================================*/
create table case3
(
   id                   int(11) not null auto_increment comment '????',
   name                 varchar(100) comment '????????',
   interrogation_record_id int(11) not null comment '???????id',
   operation_data       timestamp default '0000-00-00 00:00:00',
   operator_name        varchar(100) default NULL comment '??????????',
   operator_detail      varchar(500) default NULL comment '????????',
   af_type              varchar(100) default NULL comment '????????',
   af_course_disease    varchar(100) default NULL comment '???????',
   arrhythmia_diagnose  varchar(300) default NULL comment '??????????????',
   electrophysiology_diagnose varchar(300) default NULL comment '??????????????',
   postoperation_diagnose varchar(300) default NULL comment '????????',
#   mechanism            varchar(100) default NULL comment '????',
#   part                 varchar(100) default NULL comment '??λ',
   la_bore              varchar(100) default NULL comment 'LA???',
   lv_bore              varchar(100) default NULL comment 'lv???',
   lvef_bore            varchar(100) default NULL comment 'LVEF_???',
   ra_bore              varchar(100) default NULL comment 'RA???',
   rv_bore              varchar(100) default NULL comment 'RV???',
   ucg_remarks          varchar(200) default NULL comment 'UCG???',
 #  ecg_type             varchar(100) default NULL comment 'ECG???????????',
 #  electrical_offset    varchar(100) default NULL comment '???????',
 #  preopreative_examination varchar(255) default NULL comment '??????????????????????',
   anti_arrhythmia_drugs varchar(100) default NULL comment '???????????????',
   invali_danti_arrhythmia_drugs varchar(100) default NULL comment '?????Ч????????????',
   merger_arrhythmia    varchar(100) default NULL comment '?????????????',
   imaging_inside_heart varchar(50) default NULL comment '?????????',
   induced_way          varchar(50) default NULL comment '??????',
   check_medication     varchar(50) default NULL comment '???????',
   tachycardia_regulation varchar(50) default NULL comment '?????????????????',
   ccl                  varchar(50) default NULL comment '?????CCL??',
   inspection_method    varchar(100) default NULL comment '??????',
#   diastolic_potential  varchar(50) default NULL comment '???????λ',
#   p_potential_examination varchar(100) default NULL comment 'P??λ????',
   ablation_procedure   varchar(50) default NULL comment '???????',
   ablation_lines       varchar(50) default NULL comment '???????',
   target_position      varchar(100) default NULL comment '?е?λ',
   ablation_energy      varchar(100) default NULL comment '???????',
   ablation_judgement   varchar(50) default NULL comment '?ж???????Ч???',
   ablation_end_point   varchar(100) default NULL comment '???????',
 #  effective_target_site varchar(100) default NULL comment '??Ч?е?',
   discharge_time       varchar(100) default NULL comment '???????',
   xray_exposure_time   varchar(100) default NULL comment 'x????????',
   ablation_times       int(11) default NULL comment '???????',
   intraoperative_cable_rate varchar(100) default NULL comment '???е縴??',
   before_heart_rate    varchar(100) default NULL comment '?????????',
   before_rr            varchar(100) default '' comment '?????????',
   before_af          varchar(100) default NULL comment '?????????',
   before_remarks       varchar(1000) default NULL comment '????????',
   in_heart_rate        varchar(100) default NULL comment '????????????',
   in_rr                varchar(100) default NULL comment '????????',
   in_af              varchar(100) default NULL comment '????????',
   in_remarks           varchar(300) default NULL comment '???б??',
   global_remarks       varchar(500) default NULL comment '?????',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   operation_number	varchar(100),
   case_number		varchar(100),
   af_frequency		varchar(100),
   af_every_attack_time  varchar(100),
   af_last_attack_time   varchar(100),
   cardioversion_method	 varchar(100),
   cardioversion_medication	varchar(100),
   complication		varchar(100),

   before_antioagulant  varchar(100),
   la_thrombus_detection varchar(100),
   test_method		varchar(100),
   lung_vein		varchar(100),
   gp_ablation		varchar(100),
   vagal_reflex		varchar(100),
   intraoperative_vagus_reflex_areas	varchar(100),
   before_re		varchar(100),
   in_re		varchar(100),
   af_duration		varchar(100),


   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table case3 comment '??????????';

/*==============================================================*/
/* Table: doctor                                                */
/*==============================================================*/
create table doctor
(
   id                   int(11) not null auto_increment comment 'id????????',
   user_id              varchar(50) comment '???id',
   password             varchar(50) not null comment '????',
   name                 varchar(20) comment '???????',
   major                varchar(50) comment '???η???',
   job_title            varchar(30) comment '???',
   contact_number       varchar(20)  comment '??????',
   belong_hospital      varchar(50)  comment '??????',
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
   interrogation_record_id int comment '???????id',
   name                 varchar(50),
   type                 int,
   url                  varchar(100),
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   primary key (id)
);

alter table file comment '?????';

/*==============================================================*/
/* Table: follow_up                                             */
/*==============================================================*/
create table follow_up
(
   id                   int(11) not null auto_increment,
   interrogation_record_id int(11) not null comment '???????id',
   follow_up_time       datetime default NULL comment '???????',
   follow_up_method     varchar(50) default NULL comment '???÷???',
   onset_evidence       varchar(50) default NULL comment '???????',
   evidence_source      varchar(200) default NULL comment '??????',
   postoperative_anticoagulation varchar(40) default NULL comment '????????????',
   postoperative_complications varchar(255) default NULL comment '???????',
   postoperative_arrhythmias varchar(30) default NULL comment '???????????',
   postoperatie_adds    varchar(255) default NULL comment '???? AADs',
   postoperatie_medication varchar(255) default NULL comment '???????????',
   echocardiographic_time varchar(30) default NULL comment '???????????',
   postoperatie_la      varchar(30) default NULL comment '????????la',
   postoperatie_lv      varchar(30) default NULL comment '????????lv',
   postoperatie_lvef    varchar(30) default NULL comment '????????lvef',
   left_thrombosis      varchar(30) default NULL comment '??????????',
   check_method         varchar(30) default NULL comment '??????',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   postoperative_arrhythmias_time 	varchar(30),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*==============================================================*/
/* Table: interrogation_record                                  */
/*==============================================================*/
create table interrogation_record
(
   id                   int not null auto_increment,
   doctor_id            int(11) not null comment '???id(??????',
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
   type_name            varchar(30) default NULL comment '???????????',
   oprate_time          timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   detail               varchar(500) default NULL comment '???????',
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
   number               int(11) default NULL comment '?????',
   name                 varchar(30) default NULL comment '???????',
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
   name                 varchar(20) comment '????',
   id_card              varchar(18) not null default '' comment '???????',
   birthday             timestamp default '0000-00-00 00:00:00',
   phone_number         varchar(20)  default '' comment '?绰????',
   adress               varchar(100) default '' comment '?????',
   education_level      varchar(20) default NULL comment '??????',
   profession           varchar(20) comment '??',
   keyword1             varchar(100),
   keyword2             varchar(100),
   keyword3             varchar(100),
   age			int(6) ,
   sex			varchar(20),
   primary key (id)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table case3 add constraint FK_Reference_7 foreign key (interrogation_record_id)
      references interrogation_record (id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table case2 add constraint FK_Reference_6 foreign key (interrogation_record_id)
      references interrogation_record (id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table case1 add constraint FK_Reference_4 foreign key (interrogation_record_id)
      references interrogation_record (id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table follow_up add constraint FK_Reference_5 foreign key (interrogation_record_id)
      references interrogation_record (id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table interrogation_record add constraint FK_Reference_1 foreign key (doctor_id)
      references doctor (id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table interrogation_record add constraint FK_Reference_2 foreign key (patient_id)
      references patient (id) ON DELETE CASCADE ON UPDATE CASCADE;

alter table medical_history add constraint FK_Reference_3 foreign key (patient_id)
      references patient (id) ON DELETE CASCADE ON UPDATE CASCADE;
