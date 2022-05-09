### No spring.config.import property has been defined
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
</dependency>
```

# spring boot
1. user-server
    - h2
    - eureka-client
    - config-cloud
    - jpa
    - web
    - bootstrap
2. department-server
    - h2
    - eureka-client
    - config-cloud
    - jpa
    - web
    - bootstrap
3. eureka-server
    - eureka-server
4. gateway-server
    - eureka-client
    - gateway
    - actuator
    - bootstrap
5. config-server
    - eureka-client
    - config-server


## start:
1. eureka-server
2. config-server
3. department-server
4. user-server
5. gateway-server



