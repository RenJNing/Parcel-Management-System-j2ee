create table PARCEL (PARCEL_ID integer not null, SENDER varchar(255), RECEIVER varchar(255), ADDRESSTO varchar(255), ADDRESSFROM varchar(255), DETAIL varchar(255), primary key (PARCEL_ID)) type=MyISAM;
create table USER (USER_ID integer not null, EMAIL varchar(255), NICKNAME varchar(255), PASSWORD varchar(255), primary key (USER_ID)) type=MyISAM;
