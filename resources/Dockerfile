FROM selenium/standalone-chromium:latest

ARG JAR_NAME=selenium-0.0.1-SNAPSHOT-jar-with-dependencies.jar

USER root

RUN mkdir /opt/app

RUN mkdir /opt/data

COPY resources/users.csv /opt/data/users.csv

COPY target/$JAR_NAME /opt/app/selenium-app.jar

CMD java -jar /opt/app/selenium-app.jar