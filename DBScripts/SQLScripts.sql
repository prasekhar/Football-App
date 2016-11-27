create database FOOTBALL_DB;

use FOOTBALL_DB;

create table TEAM (TEAM_ID varchar(3) primary key,TEAM_NAME varchar(50), COACH varchar(50));

insert into TEAM values('DLH','Delhi Dynamos', 'Harm van Veldhoven');

insert into TEAM values('MUM','Mumbai City', 'Peter Reid');

insert into TEAM values('NEU','NorthEast United', 'Ricki Herbert');

insert into TEAM values('KOL','Atletico de Kolkata', 'Antonio Lopez Habas' );

insert into TEAM values('CHN','Chennaiyin FC', 'Marco Materazzi');


create table GAME (GAME_ID int primary key auto_increment,
	MATCH_DATE Date, 
	STADIUM varchar(150), 
	FIRST_TEAM varchar(3), 
	SECOND_TEAM varchar(3),
	constraint FIRST_TEAM_FK foreign key (FIRST_TEAM) references TEAM(TEAM_ID),
	constraint SECOND_TEAM_FK foreign key (SECOND_TEAM) references TEAM(TEAM_ID)
	);


insert into GAME values (0, '2014-10-2', 'Jawaharlal Nehru Stadium (Chennai)', 'CHN', 'MUM');

insert into GAME values (0, '2014-10-3', 'DY Patil Stadium', 'CHN', 'MUM');

insert into GAME values (0, '2014-10-4', 'Salt Lake Stadium Kolkata,', 'KOL', 'NEU');

insert into GAME values (0, '2014-10-5', 'Salt Lake Stadium Kolkata,', 'KOL', 'DLH');


create table GOAL(MATCH_ID int, SCORING_TEAM_ID varchar(3), PLAYER varchar(50), GOAL_TIME int, 
constraint SCORING_TEAM_FK foreign key (SCORING_TEAM_ID) references TEAM(TEAM_ID));

SELECT MATCH_DATE, STADIUM
  FIRST_TEAM,
  sum(CASE WHEN SCORING_TEAM_ID=FIRST_TEAM THEN 1 ELSE 0 END) FIRST_TEAM_SCORE,
 SECOND_TEAM,
  sum(case when SCORING_TEAM_ID=SECOND_TEAM then 1 else 0 end) SECOND_TEAM_SCORE
  FROM game JOIN goal ON GAME_ID = MATCH_ID 
group by MATCH_ID
order by MATCH_DATE,MATCH_ID,FIRST_TEAM,SECOND_TEAM;