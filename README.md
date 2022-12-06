# begnning-spring-boot-micro-service
## To start the project, make sure you already have *Docker* on your machine.  
Open the project, more precisely *article-service* in the *resource folder*: open the *dev folder* in your terminal and type the command:  
````
./start-db.sh
````      
In the root of the project there is a folder rabbitmq-docker opened it and typed the command:
````
docker-compose up -d
````
This command will allow you to mount your PostgreSQL database.  
after that turn on the services one by one.  
````
1-> config-service
2-> registery-service
3-> gateway-service
4-> article-service
5-> sale-service
````
