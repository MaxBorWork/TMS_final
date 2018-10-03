Prepare

1. Download source https://github.com/MaxBorWork/TMS_final.git
2. Create database and tables:
   
   "CREATE DATABASE tms"
   
   "CREATE TABLE IF NOT EXISTS Book (
                id int NOT NULL AUTO_INCREMENT,
                book_id varchar(255) NOT NULL,
                title varchar(255) NOT NULL,
                category varchar(255),
                author varchar(255),
                year_of_publish int(10),
                description text,
                image_link varchar(2083),
                fb2_file varchar(2083),
                epub_file varchar(2083),
                pdf_file varchar(2083),
                txt_file varchar(2083),
                PRIMARY KEY (ID)
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8;"
                
   "CREATE TABLE IF NOT EXISTS User (
                id int NOT NULL AUTO_INCREMENT,
                username varchar(255) NOT NULL,
                password varchar(255) NOT NULL,
                userEmail varchar(2083),
                userCountry varchar(255),
                PRIMARY KEY (ID)
                );"
