Zhang Sijing  Zhang.sijin@northeastern.edu
To run this app and ensure it functions properly, you may need to set up the database and adjust the path for the pictures in application.yml.

In application.yml:
spring:
  application:
    name: cocoa
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/cocoa?useSSL=false&serverTimezone=UTC
    username: Should be your username
    password: Should be your password
    
On the last line:
cocoa:
  path: Should be your path
