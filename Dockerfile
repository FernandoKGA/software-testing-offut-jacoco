FROM maven:3.9.9-eclipse-temurin-21

WORKDIR /code

COPY . /code/

CMD ["/bin/sh" "-c" "/bin/sh -c \"trap ':' TERM INT; sleep 3600 & wait\""]