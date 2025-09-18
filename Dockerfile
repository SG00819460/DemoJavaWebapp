FROM openjdk:8
WORKDIR /app
EXPOSE 8080
ADD target/DemoJavaWebapp.war DemoJavaWebapp.war
ENTRYPOINT ["java","-war","/DemoJavaWebapp.war"]
