#!/usr/bin/env bash

docker-compose up -d
printf "\nContainers are starting - but microservices will die because topics won't be ready yet!\n"

while [ $(docker-compose ps -q kafka-topic-creator | wc -l) -gt 0 ]; do
    echo "Waiting for kafka-topic-creator to complete..."
    sleep 5
done

printf "\nkafka-topic-creator has completed, re-running docker compose up...\n"
docker-compose up -d

printf "\nMicroservices starting again and should be ready in 10-20 seconds\n"

