-- 사용자 생성
CREATE USER c##java IDENTIFIED BY 12345
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP
QUOTA 10M ON USERS;

-- 연결 권한 부여
GRANT CONNECT,RESOURCE TO c##java;


-- 테이블 생성
create table usertbl(
	userid varchar2(20) primary key,
	name varchar2(20) not null,
	password varchar2(20) not null,
	age number(3) not null,
	email varchar2(20) not null
);


-- 기본 데이터 삽입
INSERT INTO usertbl(userid, name, password, age, email)
VALUES('sophia','소피아','12345',27,'sophia@company.com');

INSERT INTO usertbl(userid, name, password, age, email)
VALUES('emma','엠마','12345',30,'emma@company.com');

INSERT INTO usertbl(userid, name, password, age, email)
VALUES('olivia','올리비아','12345',22,'olivia@company.com');

INSERT INTO usertbl(userid, name, password, age, email)
VALUES('emliy','에밀리','12345',28,'emliy@company.com');

SELECT userid, name, password, age, email
FROM usertbl
WHERE userid = 'emily';


-- 테이블 생성
create table boards(
	bno number(8) primary key,
	title varchar2(100) not null,
	content varchar2(2000) not null,
	writer varchar2(20) not null,
	regdate DATE DEFAULT sysdate
);




















