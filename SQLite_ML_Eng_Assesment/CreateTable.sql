--Attaching a database with given name, it will create one if databse not exists already
attach database 'db_BankAdditional.db' as bank;

--Display available databse on terminal
--.database

--Drop the table if already EXISTS
drop table IF EXISTS tbl_bankadditional;

CREATE TABLE tbl_bankadditional (
	"age"	numeric,
	"job"	text,
	"marital" text	,
	"education" text	,
	"default"	 text,
	"housing"	 text,
	"loan" text,
	"contact" text,
	"month" text,
	"day_of_week" numeric,
	"duration" numeric,
	"campaign" numeric,
	"pdays" numeric,
	"previous" numeric,
	"poutcome" text,
	"emp.var.rate" numeric,
	"cons.price.idx" numeric,
	"cons.conf.idx" numeric,
	"euribor3m" numeric,
	"nr.employed"	numeric,
	"y" text
);

-- Switching mode to csv as this prevents the command-line utility from trying to interpret the input file text as some other format.
.mode csv

--Turning table headers on
.header on

--Defining column separator
.separator ";"

--Importing the csv file data to table name as mentioned in the end of statement
.import /users/anjul/eclipse/workspace/ws-java/SQLite_ML_Eng_Assesment/bank-additional/bank-additional.csv tbl_bankadditional

--Switching mode back to column so that we can see data organizsed in columns
.mode column

--Deleting first row of this column as it contains table headers as a row value while Importing the table from csv
DELETE from tbl_bankadditional WHERE age like "%age%";

--.separator " | "

--Display all imported data from the newly created table
select * from tbl_bankadditional LIMIT 10;

--Display table information (schema) ## .schema ?? could have been used as an alternate to this
--pragma table_info("tbl_bankadditional");
