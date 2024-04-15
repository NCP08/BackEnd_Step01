
--1) 모든 학생의 성적을 4.5만점 기준으로 수정하세요

-- SELECT sno, sname, avr FROM student;

UPDATE student SET
 avr = avr * 4.5/4.0;

--  ROLLBACK;


--2) 모든 교수의 부임일자를 100일 앞으로 수정하세요

SELECT pno, pname, hiredate FROM professor;

UPDATE professor SET
 hiredate = hiredate - 100;

  -- ROLLBACK;


--3) 화학과 2학년 학생의 정보를 삭제하세요
  => 제약조건때문에 단독 삭제가 되지 않음
     삭제 안되는 것만 확인 할 것


--4) 조교수의 정보를 삭제하세요
  => 제약조건때문에 단독 삭제가 되지 않음
     삭제 안되는 것만 확인 할 것


