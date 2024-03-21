# RabbitMQ-test

## Preprocessing
1. run rabbitmq docker
  - `docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 --restart=unless-stopped rabbitmq:management`

2. run eureka server with 8761 port
3. run gateway server with 8080 port
4. run receiver project(8083 port) and sender project(8081 port, 8082 port).
