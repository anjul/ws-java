.mode column
.header on

--select job as Job,( select count(job) from tbl_bankadditional where job like "%blue-colla%" and marital like "%single%") from tbl_bankadditional group by job;


select job as Job,
  (
   select round( (select count(marital) from tbl_bankadditional where marital="married" and job="admin.") / (count(job)*0.01),2) from tbl_bankadditional where job like "%admin.%"
  ) as Married,
  (
   select round( (select count(marital) from tbl_bankadditional where marital="single" and job="admin.") / (count(job)*0.01),2) from tbl_bankadditional where job like "%admin.%"
  ) as Single,
  (
   select round( (select count(marital) from tbl_bankadditional where marital="divorced" and job="admin.") / (count(job)*0.01),2) from tbl_bankadditional where job like "%admin.%"
  ) as Divorced,
  (
   select round( (select count(marital) from tbl_bankadditional where marital="unknown" and job="admin.") / (count(job)*0.01),2) from tbl_bankadditional where job like "%admin.%"
 ) as Unknown,
,
 (
  select round( (select count(marital) from tbl_bankadditional where marital="married" and job="blue-colllar") / (count(job)*0.01),2) from tbl_bankadditional where job like "%blue-colllar.%"
 ) as Married,
 (
  select round( (select count(marital) from tbl_bankadditional where marital="single" and job="blue-colllar") / (count(job)*0.01),2) from tbl_bankadditional where job like "%blue-colllar.%"
 ) as Single,
 (
  select round( (select count(marital) from tbl_bankadditional where marital="divorced" and job="blue-colllar") / (count(job)*0.01),2) from tbl_bankadditional where job like "%blue-colllar.%"
 ) as Divorced,
 (
  select round( (select count(marital) from tbl_bankadditional where marital="unknown" and job="blue-colllar") / (count(job)*0.01),2) from tbl_bankadditional where job like "%blue-colllar.%"
 ) as Unknown

from tbl_bankadditional group by job;


--SELECT round((COUNT(rowid))/(SELECT COUNT(*)*0.01 FROM people),2) FROM people WHERE zip="12345";


/*admin. 
blue-colla
entreprene
housemaid  
management
retired
self-emplo
services 
student
technician
unemployed 
unknown*/
