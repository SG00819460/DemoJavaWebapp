FROM openjdk:17
EXPOSE 8080
ADD target/DemoJavaWebapp.war DemoJavaWebapp.war
ENTRYPOINT ["java","-war","/DemoJavaWebapp.war"]
