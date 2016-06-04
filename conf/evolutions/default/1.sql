# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table amphoe (
  id                            integer auto_increment not null,
  th                            varchar(255),
  en                            varchar(255),
  constraint pk_amphoe primary key (id)
);

create table province (
  id                            integer auto_increment not null,
  th                            varchar(255),
  en                            varchar(255),
  slogan                        varchar(255),
  constraint pk_province primary key (id)
);


# --- !Downs

drop table if exists amphoe;

drop table if exists province;

