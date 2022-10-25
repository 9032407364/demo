
    #here openjdk is docker image for Java 11, as in pom.xml Java version is 11
    FROM openjdk:11
    #creating a working directory inside the image
    WORKDIR usr/lib
    #setting environment variable same name that are there in application.properties file
    #ENV MONGO_DATABASE=custdb
    #ENV MONGO_URL=mongodb://localhost:27017/custdb
    #Copy executable jar file getting created inside target and add it in usr/lib working director
    ADD ./target/demo-0.0.1-SNAPSHOT.jar /usr/lib/demo-0.0.1-SNAPSHOT.jar
    #Run the jar file
    ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]