# spring-boot-chaos-monkey-example

An example using Spring Boot Chaos Monkey

## How to build in local

```bash
sdk env install
./mvnw clean verify
./mvnw clean spring-boot:run
```

## References

- https://codecentric.github.io/chaos-monkey-spring-boot/

## Spring Boot CLI

```bash
sdk install springboot
spring init -d=web,devtools --build=maven --force ./
```