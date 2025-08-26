-- SQL HOMEWORK 9

-- 1. city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini
-- birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT city, country, country.country_id FROM city
INNER JOIN country ON city.country_id = country.country_id;

-- 2. customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki
-- first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT first_name, last_name, payment.payment_id FROM customer
INNER JOIN payment ON payment.customer_id = customer.customer_id;

-- 3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki
-- first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT first_name, last_name, rental.rental_id FROM customer
INNER JOIN rental ON rental.customer_id = customer.customer_id;