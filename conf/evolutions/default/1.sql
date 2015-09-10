# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bettype_old (
  bet_id                    varchar(255),
  bet_code                  varchar(255),
  bet_name                  varchar(255),
  bet_desc                  varchar(255),
  created_date              varchar(255),
  update_date               varchar(255))
;

create table horses (
  horse_id                  varchar(255),
  race_id                   varchar(255),
  meeting_id                varchar(255),
  rider_name                varchar(255),
  trainer_name              varchar(255),
  created_date              varchar(255),
  update_date               varchar(255))
;

create table meeting (
  meeting_id                bigint auto_increment not null,
  meeting_name              varchar(255),
  meeting_date              varchar(255),
  constraint pk_meeting primary key (meeting_id))
;

create table meeting_old (
  meeting_id                varchar(255),
  country                   varchar(255),
  created_date              varchar(255),
  update_date               varchar(255))
;

create table raceresult (
  result_id                 varchar(255),
  meeting_id                varchar(255),
  race_id                   varchar(255),
  created_date              varchar(255),
  update_date               varchar(255))
;

create table races (
  race_id                   varchar(255),
  meeting_id                varchar(255),
  race_name                 varchar(255),
  race_class                varchar(255),
  created_date              varchar(255),
  update_date               varchar(255))
;

create table resultdet (
  detail_id                 varchar(255),
  result_id                 varchar(255),
  horse1_id                 varchar(255),
  horse2_id                 varchar(255),
  horse3_id                 varchar(255),
  horse4_id                 varchar(255),
  created_date              varchar(255),
  update_date               varchar(255))
;

create table ticket (
  ticket_id                 bigint auto_increment not null,
  username                  varchar(255),
  ticket_no                 bigint,
  unit                      bigint,
  amount                    bigint,
  constraint pk_ticket primary key (ticket_id))
;

create table ticket_before (
  ticket_id                 varchar(255),
  ticket_no                 varchar(255),
  amount                    bigint,
  process_flag              tinyint(1) default 0,
  win_flag                  tinyint(1) default 0,
  created_date              varchar(255),
  update_date               varchar(255))
;

create table ticket_detail_before (
  detail_id                 varchar(255),
  ticket_id                 varchar(255),
  meeting_id                varchar(255),
  race_id                   varchar(255),
  bet_id                    varchar(255),
  horse_id                  varchar(255),
  created_date              varchar(255),
  update_date               varchar(255))
;

create table ticketdetail (
  detail_id                 bigint,
  ticket_id                 bigint,
  meeting_id                bigint,
  race_id                   bigint,
  horse_id                  bigint)
;

create table tuser (
  username                  varchar(255),
  password                  varchar(255),
  firstname                 varchar(255),
  lastname                  varchar(255),
  initialflag               integer)
;

create table unit_old (
  unit                      bigint)
;

create table user (
  user_id                   varchar(255),
  username                  varchar(255),
  password                  varchar(255),
  name                      varchar(255),
  pin                       varchar(255),
  email                     varchar(255),
  phone_no                  varchar(255),
  limit                     bigint,
  balance                   bigint,
  created_date              varchar(255),
  update_date               varchar(255))
;

create table bettype (
  bet_id                    bigint auto_increment not null,
  bet_name                  varchar(255),
  bet_desc                  varchar(255),
  constraint pk_bettype primary key (bet_id))
;

create table horse (
  horse_id                  bigint auto_increment not null,
  rider_name                varchar(255),
  trainer_name              varchar(255),
  constraint pk_horse primary key (horse_id))
;

create table news (
  news_id                   bigint auto_increment not null,
  image_url                 varchar(255),
  title                     varchar(255),
  content                   varchar(255),
  news_date                 varchar(255),
  constraint pk_news primary key (news_id))
;

create table unit (
  unit                      bigint auto_increment not null,
  constraint pk_unit primary key (unit))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table bettype_old;

drop table horses;

drop table meeting;

drop table meeting_old;

drop table raceresult;

drop table races;

drop table resultdet;

drop table ticket;

drop table ticket_before;

drop table ticket_detail_before;

drop table ticketdetail;

drop table tuser;

drop table unit_old;

drop table user;

drop table bettype;

drop table horse;

drop table news;

drop table unit;

SET FOREIGN_KEY_CHECKS=1;

