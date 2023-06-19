FROM openjdk:8
Run mvn clean install
ADD target/DemoJavaWebapp.war DemoJavaWebapp.war
ENTRYPOINT ["java","-war","/DemoJavaWebapp.war"]
