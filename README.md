### Log and Exception Controller Advice App


RUN:

```
mvn clean install
java -jar -Dspring.profiles.active=prod target/log-exception-controller-advice-app-0.0.1-SNAPSHOT.jar
```
swagger: http://localhost:8080/swagger-ui.html

GET: http://localhost:8080/product/1231
