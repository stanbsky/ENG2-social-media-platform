#!/usr/bin/env bash

function setup() {
  curl -s -X POST -H "Content-Type: application/json" \
  -d '
  {
      "name": "john"
  }' http://localhost:8080/users | jq
}

function watch() {
  curl -s 'http://localhost:8080/videos/'$1'?userId=1'
}

function list() {
  curl -s 'http://localhost:8083/subscriptions/user/1/hashtag/'$1 | jq
}

function sub() {
  curl -s -X PUT 'http://localhost:8083/subscriptions/user/1/hashtag/'$1
}

function post() {
  curl -s -X POST -H "Content-Type: application/json" \
  -d '
  {
    "title": "Video",
    "hashtags": ["hashtag'$1'"],
    "userId": 1
  }
  ' \
  http://localhost:8080/videos | jq
}

function post2() {
  curl -s -X POST -H "Content-Type: application/json" \
  -d '
  {
    "title": "Video",
    "hashtags": ["hashtag'$1'", "hashtag'$2'"],
    "userId": 1
  }
  ' \
  http://localhost:8080/videos | jq
}

function google() {
  curl https://google.com
}

case "$1" in
  watch)
    watch "$2"
    ;;
  sub)
    sub "$2"
    ;;
  post)
    post "$2"
    ;;
  post2)
    post2 "$2" "$3"
    ;;
  list)
    list "$2"
    ;;
  setup)
    setup
    ;;
  google)
    google
    ;;
  *)
    echo "Usage: $0 {watch [videoId]|sub [hashtag]|post [hashtag]}"
    exit 1
esac