spring boot
    1. user-server
        -h2
        -eureka-client
        -config-cloud
        -jpa
        -web
    2. department-server
        -h2
        -eureka-client
        -config-cloud
        -jpa
        -web
    3. eureka-server
        -eureka-server
    4. gateway-server
        -eureka-client
        -gateway
        -actuator
    5. config-server
        -eureka-client
        -config-server