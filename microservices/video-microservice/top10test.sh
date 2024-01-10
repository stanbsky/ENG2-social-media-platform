#!/usr/bin/env bash

function setup() {
  curl -s -X POST -H "Content-Type: application/json" \
  -d '
  {
      "name": "john"
  }' http://localhost:8080/users | jq
  for i in {1..10} ; do
     curl -s -X POST -H "Content-Type: application/json" \
     -d '
     {
       "title": "Video '$i'",
       "hashtags": ["hashtag'$i'"],
       "userId": 1
     }
     ' \
     http://localhost:8080/videos | jq
  done
}

function like() {
  for i in {1..10} ; do
    likes=$(( ( RANDOM % 10 )  + 1 ))
    for j in $(seq 1 $likes) ; do
#      echo "Liking video $i, like $j"
      curl -s -X PUT \
      "http://localhost:8080/videos/$i/like?username=john" > /dev/null
    done
    echo "Video $i has $likes likes"
  done
}

case "$1" in
  setup)
    setup
    ;;
  like)
    like
    ;;
  *)
    echo "Usage: $0 {setup}"
    exit 1
esac