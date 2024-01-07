#!/bin/bash

# Disable path conversion in Git Bash
export MSYS_NO_PATHCONV=1

docker run --rm \
    -e DISABLE_WELCOME_MESSAGE=1 \
    --network video-microservice_default \
    bitnami/kafka:3.5 \
    kafka-topics.sh \
    --bootstrap-server kafka-0:9092 \
    "$@"
