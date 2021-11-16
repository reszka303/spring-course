SELECT * FROM city;

#JPQL
# SELECT c FROM City c

SELECT name FROM city;

#JPQL
# SELECT c.name FROM City c

SELECT  * FROM city WHERE Population > 1000000;

#JPQL
#SELECT c FROM City WHERE c.population > 1000000

SELECT * FROM city WHERE CountryCode = 'POL' AND Population > 500000;

#JPQL
#SELECT c FROM City c WHERE c.countryCode = 'POL' AND c.population > 500000

#JPQL
#UPDATE City c SET c.population = c.population  + 100  WHERE c.country = 'POL'

#JPQL
#DELETE FROM City c WHERE c.countryCode = 'BRA'