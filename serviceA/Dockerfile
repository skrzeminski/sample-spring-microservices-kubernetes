FROM openjdk:8-jre-alpine
ENV APP_FILE servicea-0.0.1-SNAPSHOT.jar
ENV APP_HOME /usr/apps
EXPOSE 8080
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME1
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]