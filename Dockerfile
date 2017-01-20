FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/todolist.jar /todolist/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/todolist/app.jar"]
