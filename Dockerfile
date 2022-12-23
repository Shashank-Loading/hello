FROM openjdk
ADD target/demo.jar demo.jar
ENTRYPOINT ["java","-jar","demo.jar"]