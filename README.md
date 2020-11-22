# Techonologies used
1. JavaEE 8
2. Payara Micro Server
3. Insomia Rest Client
4. Maven

# Commands
1. build uberjar - java -jar pm.jar --deploy (local directory path)\hello-todo.war --port 8080 --outputUberJar helloTodo.jar
2. Execute jar - java -jar helloTodo.jar

# Build
mvn clean package && docker build -t academy.learnprogramming/hello-todo .

# RUN

docker rm -f hello-todo || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-todo academy.learnprogramming/hello-todo 
