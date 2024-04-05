1) 각 학생의 평점을 검색하라(별명을 사용)
SELECT sno, sname, avr
FROM student;

2) 각 과목의 학점수를 검색하라(별명을 사용)
SELECT cno, cname, st_num
FROM course;

3) 각 교수의 지위를 검색하라(별명을 사용)
SELECT pno, pname, orders
FROM professor;

4) 급여를 10%인상했을 때 연간 지급되는 급여를 검색하라(별명을 사용)
SELECT eno, ename, sal*12*1.1 "연간 인상급여"
FROM emp;

5) 현재 학생의 평균 평점은 4.0만점이다. 이를 4.5만점으로 환산해서 검색하라(별명을 사용)
SELECT sno, sname, avr*4.5/4.0 환산평점
FROM student;



