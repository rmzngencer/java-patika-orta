/* 
Merhabalar,

    test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
    Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
    Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
    Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

Kolay Gelsin.
*/

--1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);

--2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

insert into employee (name, birthday, email) values ('Laraine Thamelt', '12-03-1940', 'lthamelt0@umich.edu');
insert into employee (name, birthday, email) values ('Dayna Galego', '16-08-1983', 'dgalego1@microsoft.com');
insert into employee (name, birthday, email) values ('Godard Saxelby', '19-08-1900', 'gsaxelby2@admin.ch');
insert into employee (name, birthday, email) values ('Jennifer Hayler', '09-06-1950', 'jhayler3@yale.edu');
insert into employee (name, birthday, email) values ('Terri Poynor', '16-10-1973', 'tpoynor4@creativecommons.org');
insert into employee (name, birthday, email) values ('Nickola MacCarrick', '17-04-2001', 'nmaccarrick5@digg.com');
insert into employee (name, birthday, email) values ('Nikki Vaz', '11-04-1904', 'nvaz6@pinterest.com');
insert into employee (name, birthday, email) values ('Nils Probets', '15-01-1931', 'nprobets7@redcross.org');
insert into employee (name, birthday, email) values ('Neda Budge', '16-03-1999', 'nbudge8@ucoz.com');
insert into employee (name, birthday, email) values ('Milicent Casarili', '20-05-1981', 'mcasarili9@e-recht24.de');
insert into employee (name, birthday, email) values ('Marijn Crosher', '09-06-1966', 'mcroshera@google.nl');
insert into employee (name, birthday, email) values ('Didi Sewall', '02-11-2007', 'dsewallb@marriott.com');
insert into employee (name, birthday, email) values ('Rosalynd Blinman', '12-10-1987', 'rblinmanc@google.nl');
insert into employee (name, birthday, email) values ('Valencia Yemm', '22-03-1963', 'vyemmd@symantec.com');
insert into employee (name, birthday, email) values ('Gusta Ritchley', '31-10-1914', 'gritchleye@walmart.com');
insert into employee (name, birthday, email) values ('Lilith Herion', '12-03-1969', 'lherionf@163.com');
insert into employee (name, birthday, email) values ('Elston Rough', '25-08-2020', 'eroughg@hc360.com');
insert into employee (name, birthday, email) values ('Ker Peachman', '29-08-1984', 'kpeachmanh@devhub.com');
insert into employee (name, birthday, email) values ('Chas Mettetal', '20-08-1922', 'cmettetali@biblegateway.com');
insert into employee (name, birthday, email) values ('Berkley Emanuele', '29-07-1904', 'bemanuelej@4shared.com');
insert into employee (name, birthday, email) values ('Ichabod Helks', '20-12-1927', 'ihelksk@home.pl');
insert into employee (name, birthday, email) values ('Madelina Meriel', '10-07-1929', 'mmeriell@trellian.com');
insert into employee (name, birthday, email) values ('Blake Vigars', '02-01-1918', 'bvigarsm@state.gov');
insert into employee (name, birthday, email) values ('Roseline Tomala', '15-09-1935', 'rtomalan@economist.com');
insert into employee (name, birthday, email) values ('Redd Shadbolt', '28-09-2022', 'rshadbolto@senate.gov');
insert into employee (name, birthday, email) values ('Adham Merrigans', '25-06-1901', 'amerrigansp@gov.uk');
insert into employee (name, birthday, email) values ('Omar Suller', '21-09-1906', 'osullerq@vk.com');
insert into employee (name, birthday, email) values ('Pegeen Feavers', '13-11-1986', 'pfeaversr@deviantart.com');
insert into employee (name, birthday, email) values ('Casey Jankovic', '08-02-1985', 'cjankovics@dot.gov');
insert into employee (name, birthday, email) values ('Clovis Tweddle', '15-12-1948', 'ctweddlet@mysql.com');
insert into employee (name, birthday, email) values ('Chandra Whiley', '25-02-1967', 'cwhileyu@bbc.co.uk');
insert into employee (name, birthday, email) values ('Jake Handley', '12-01-1937', 'jhandleyv@shareasale.com');
insert into employee (name, birthday, email) values ('Andrei Martinovic', '01-04-1940', 'amartinovicw@amazon.co.uk');
insert into employee (name, birthday, email) values ('Cody Schult', '08-11-1991', 'cschultx@europa.eu');
insert into employee (name, birthday, email) values ('Katine Newlan', '11-01-1948', 'knewlany@biblegateway.com');
insert into employee (name, birthday, email) values ('Levi Bredgeland', '29-09-1962', 'lbredgelandz@answers.com');
insert into employee (name, birthday, email) values ('Marla Bispham', '26-07-1935', 'mbispham10@ucsd.edu');
insert into employee (name, birthday, email) values ('Nyssa McCobb', '30-07-1927', 'nmccobb11@japanpost.jp');
insert into employee (name, birthday, email) values ('Evangelia Adin', '14-12-1997', 'eadin12@springer.com');
insert into employee (name, birthday, email) values ('Patrice Rosson', '09-12-1972', 'prosson13@usnews.com');
insert into employee (name, birthday, email) values ('Orren Merriman', '18-08-1949', 'omerriman14@google.ru');
insert into employee (name, birthday, email) values ('Melosa Hryniewicki', '13-01-1942', 'mhryniewicki15@ameblo.jp');
insert into employee (name, birthday, email) values ('Rand Treker', '21-08-1901', 'rtreker16@weibo.com');
insert into employee (name, birthday, email) values ('Melvyn Birrane', '15-11-1960', 'mbirrane17@microsoft.com');
insert into employee (name, birthday, email) values ('Mollee Keppie', '07-12-2009', 'mkeppie18@bing.com');
insert into employee (name, birthday, email) values ('Barnebas Noore', '13-05-1943', 'bnoore19@51.la');
insert into employee (name, birthday, email) values ('Jakie Caffrey', '02-01-2008', 'jcaffrey1a@disqus.com');
insert into employee (name, birthday, email) values ('Gussi Sleeman', '14-02-2020', 'gsleeman1b@com.com');
insert into employee (name, birthday, email) values ('Roderic Ashmole', '28-11-1954', 'rashmole1c@studiopress.com');
insert into employee (name, birthday, email) values ('Toni Levins', '24-07-1926', 'tlevins1d@yelp.com');

--3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee
SET name = 'Mehmet Yılmaz'
WHERE name = 'Laraine Thamelt';

UPDATE employee
SET birthday = '1990-01-01'
WHERE id = 2;

UPDATE employee
SET email = 'mail@mail.com'
WHERE email = 'mbirrane17@microsoft.com';

UPDATE employee
SET name = 'Ahmet Yılmaz', birthday = '1990-01-01'
WHERE id = 6;

UPDATE employee
SET name = 'Ayşe Yılmaz', birthday = '1990-01-01'
WHERE id = 5;

--4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM employee
WHERE id = 1;

DELETE FROM employee
WHERE name = 'Redd Shadbolt';

DELETE FROM employee
WHERE email = 'nmccobb11@japanpost.jp';

DELETE FROM employee
WHERE birthday = '1990-01-01';

DELETE FROM employee
WHERE id = 3;