### No spring.config.import property has been defined
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
</dependency>
```

# spring boot
1. user-server
    1. h2
    2. eureka-client
    3. config-cloud
    4. jpa
    5. web
    6. bootstrap
2. department-server
    1. h2
    2. eureka-client
    3. config-cloud
    4. jpa
    5. web
    6. bootstrap
3. eureka-server
    1. eureka-server
4. gateway-server
    1. eureka-client
    2. gateway
    3. actuator
    4. bootstrap
5. config-server
    1. eureka-client
    2. config-server


## start:
1. eureka-server
2. config-server
3. department-server
4. user-server
5. gateway-server



