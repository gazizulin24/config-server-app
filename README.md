<h1>Spring Boot Microservices with config server</h1>

### Run in local env:

1) Build and run cloud config server:
```bash
      cd Cloud-Config-Server
      ./gradlew clean build -x test
      cd ../
      java -jar  java -jar Cloud-Config-Server/build/libs/Cloud-Config-Server-0.0.1-SNAPSHOT.jar
```
Config server will be run on 8081 port and share configuration with services from https://github.com/gazizulin24/repo-for-config-server repository. 

2) Build and run one of two demo services:
    <br>
```bash
      cd Spring-Config-Server-Demo
      ./gradlew clean build -x test
      cd ../
      java -jar Spring-Config-Server-Demo/build/libs/Spring-Config-Server-Demo-0.0.1-SNAPSHOT.jar
```
or
```bash
      cd Spring-Config-Server-Demo-2
      ./gradlew clean build -x test
      cd ../
      java -jar Spring-Config-Server-Demo-2/build/libs/Spring-Config-Server-Demo-2-0.0.1-SNAPSHOT.jar
```
Apps will be run on 8080 and 8082 ports and import different configuration from config server.
<br>
### Test Endpoints:

1) For demo service 1:
```bash
      curl --location 'http://localhost:8080/str'
```
```bash
      curl --location 'http://localhost:8080/int'
```

2) For demo service 2:

```bash
      curl --location 'http://localhost:8082/str'
```
```bash
      curl --location 'http://localhost:8082/int'
```
Will return different values taken from config repository.
