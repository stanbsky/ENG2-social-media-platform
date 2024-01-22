#!/usr/bin/env bash

function setup() {
  curl -s -vX POST -H "Content-Type: application/json" \
  -d '
  {
      "name": "john"
  }' http://localhost:8080/users | jq
  if [ -z "$1" ]; then
    videos=11
  else
    videos="$1"
  fi
  for i in $(seq 1 $videos) ; do
    echo "Creating video $i"
     curl -s -vX POST -H "Content-Type: application/json" \
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
  if [ -z "$1" ]; then
    maxLikes=10
  else
    maxLikes="$1"
  fi
  if [ -z "$2" ]; then
    videos=11
  else
    videos="$2"
  fi
  for i in $(seq 1 $videos) ; do
    likes=$(( ( RANDOM % maxLikes )  + 1 ))
    for j in $(seq 1 $likes) ; do
#      echo "Liking video $i, like $j"
      curl -sv -X PUT \
      "http://localhost:8080/videos/user/1/video/$i/like" > /dev/null
    done
    echo "Video $i has $likes likes"
  done
}

case "$1" in
  setup)
    setup "$2"
    ;;
  like)
    like "$2" "$3"
    ;;
  *)
    echo "Usage: $0 {setup|like [maxLikes] [videos]}"
    exit 1
esac
