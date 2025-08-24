-- SQL HOMEWORK 8

-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER),
-- name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee (
 id INTEGER,
 name VARCHAR(50),
 birthday DATE,
 email VARCHAR(100)
 );

 -- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

 UPDATE employee
 SET name = 'Angelina Jolie'
 birthday = 1975-06-04
 email = angelina@jolie.com
 WHERE id = 8

 UPDATE employee
  SET name = 'Sarah Jessica Parker'
  birthday = 1965-03-25
  email = sarahjessica@parker.com
  WHERE birthday = 2025-01-10

  UPDATE employee
   SET name = 'Mila Kunis'
   birthday = 1983-08-14
   email = mila@kunis.com
   WHERE name = 'Orlando Potes'

   UPDATE employee
    SET name = 'Catherine Zeta Jones'
    birthday = 1969-09-25
    email = zeta@jones.com
    WHERE email = ksimmsc@slideshare.net

    UPDATE employee
     SET name = 'Jennifer Anniston
     birthday = 1969-02-11
     email = jenny@anniston.com
     WHERE id = 12


-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM employee
WHERE id = 17

DELETE FROM employee
WHERE name = 'Etheline Coales'

DELETE FROM employee
WHERE birthday = 25-07-08

DELETE FROM employee
WHERE email = fvilez@indiegogo.com

DELETE FROM employee
WHERE id = 39