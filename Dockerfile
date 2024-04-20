FROM openjdk:19-jdk

ARG PROFILE
ENV PROFILE ${PROFILE}

ARG DB_URL
ENV DB_URL ${DB_URL}

ARG DB_USERNAME
ENV DB_USERNAME ${DB_USERNAME}

ARG DB_PASSWORD
ENV DB_PASSWORD ${DB_PASSWORD}

ARG REDIS_HOST
ENV REDIS_HOST ${REDIS_HOST}

ARG REDIS_PORT
ENV REDIS_PORT ${REDIS_PORT}

ARG AWS_ACCESS_KEY
ENV AWS_ACCESS_KEY ${AWS_ACCESS_KEY}

ARG SECRET_KEY
ENV SECRET_KEY ${SECRET_KEY}

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} application.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]
