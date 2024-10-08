# spring-boot-chaos-monkey-example

An example using Spring Boot Chaos Monkey

## How to build in local

```bash
sdk env install
./mvnw clean verify
./mvnw clean spring-boot:run
./mvnw help:all-profiles
./mvnw clean spring-boot:run -P chaos-monkey -Dspring-boot.run.profiles=chaos-monkey
./mvnw clean verify -P chaos-monkey
jar tf ./target/*.jar
java -jar ./target/*.jar --spring.profiles.active=chaos-monkey

time curl -X GET "http://localhost:8080/v1/demo" \
     -H "Content-Type: application/json"
```

## References

- https://principlesofchaos.org/
- https://codecentric.github.io/chaos-monkey-spring-boot/
- https://codecentric.github.io/chaos-monkey-spring-boot/latest/

## Spring Boot CLI

```bash
sdk install springboot
spring init -d=web,devtools --build=maven --force ./
```
