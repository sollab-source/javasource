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
VALUES('emily','에밀리','12345',28,'emliy@company.com');

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

-- 시퀀스 생성(게시물 번호 증가)
CREATE SEQUENCE board_seq;

-- 실습용 데이터 입력
INSERT INTO boards(bno,title,content,writer)
VALUES(board_seq.nextval,'JDBC 개념','JDBC 개념에 대한 이해','emily');

INSERT INTO boards(bno,title,content,writer)
VALUES(board_seq.nextval,'ConnectionPool 개념','ConnectionPool 개념에 대한 이해','jenny');

INSERT INTO boards(bno,title,content,writer)
VALUES(board_seq.nextval,'메서드 개념','메서드 개념에 대한 이해','winter');



-- 트랜잭션 테이블
CREATE TABLE accounts(
	account_no varchar(20) PRIMARY KEY,
	owner varchar(20) NOT NULL,	
	balance number(10) NOT null
);

INSERT INTO accounts(account_no, owner, balance)
VALUES('111-111-1111','홍길동',0);















