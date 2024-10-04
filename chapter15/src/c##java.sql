-- 사용자 생성
CREATE USER c##java IDENTIFIED BY 12345
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP
QUOTA 10M ON USERS;

-- 연결 권한 부여
GRANT CREATE SESSION TO c##java;


-- 테이블 생성
create table usertbl(
	userid varchar2(20) primary key,
	name varchar2(20) not null,
	password varchar2(20) not null,
	age number(3) not null,
	email varchar2(20) not null
);


