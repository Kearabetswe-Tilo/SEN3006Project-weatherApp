create table weatherdata(id identity primary key, 
					weatherdate date, 
					conditions varchar(50),
					rain double,
					maxtemp int,
					mintemp int,
					sunrise varchar(50),
					sunset varchar(50),
					moonrise varchar(50),
					moonset varchar(50),
					avgwind int,
					avghumidity int,
					avgpressure int);
					
