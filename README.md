# jpa-ms-sql-server
- curl --location --request POST 'http://localhost:8082/users' \
--data-raw '{"id": 3,"name": "test3","address": "address3","phone": "22222223","email": "t3@t.com"}'

- curl --location --request PUT 'http://localhost:8082/users/1' \
-data-raw '{"name":"test2","address":"address2","phone":"22222222","email":"tc@t.com"}'

- http://localhost:8082/users
- http://localhost:8082/users/3
- curl --location --request DELETE 'http://localhost:8082/users/1'

# mac user (ms-sql server setup)
- docker pull mcr.microsoft.com/mssql/server
- docker run -d --name ms-sql-server -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=MSsql@123' -p 1433:1433 mcr.microsoft.com/mssql/server:latest
- host: localhost, port: 1433, user:sa, password:MSsql@123
- Note: if you face any issue with docker storage, please increase docker size (click on docker icon-> preferences-> Resources-> memory (up to 4 gb, also can check running docker image in docker dashboard)

# Azure Data Studio
- you can use Azure Data Studio to connect mssql server to run queries

 
