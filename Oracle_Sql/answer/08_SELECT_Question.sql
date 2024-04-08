1) 성적순으로 학생의 이름을 검색하라
SELECT avr, sno, sname
FROM student
ORDER BY avr;

2) 학과별 성적순으로 학생의 정보를 검색하라
SELECT major, sno, sname, avr
FROM student
ORDER BY major, avr DESC;

3) 학년별 성적순으로 학생의 정보를 검색하라
SELECT syear, sno, sname, avr
FROM student
ORDER BY syear, avr DESC;

4) 학과별 학년별로 학생의 정보를 성적순으로 검색하라
SELECT major, syear, sno, sname, avr
FROM student
ORDER BY major, syear, avr DESC;

5) 학점순으로 과목 이름을 검색하라
SELECT cname, st_num
FROM course
ORDER BY st_num DESC;

6) 각 학과별로 교수의 정보를 검색하라
SELECT section, pno, pname, hiredate, orders
FROM professor
ORDER BY section;

7) 지위별로 교수의 정보를 검색하라
SELECT orders, pno, pname, hiredate, section
FROM professor
ORDER BY orders;

8) 각 학과별로 교수의 정보를 부임일자 순으로 검색하라
SELECT section, orders, hiredate, pno, pname
FROM professor
ORDER BY section, hiredate;

