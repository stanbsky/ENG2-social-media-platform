#!/usr/bin/env bash

read -r -d '' TOPICS <<'EOF'
hashtag-disliked
hashtag-liked
new-videos
new-videos-by-user-hashtag
next-subscription-videos
subscriptions
subscriptions-single
top-hashtags
top-hashtags-windowed
video-disliked
video-liked
video-posted
video-viewed
watched-videos
watched-videos-by-user-hashtag
EOF

for t in $TOPICS; do
  echo "Creating $t";
  kafka-topics.sh --create --if-not-exists --bootstrap-server kafka-0:9092 --partitions 6 --replication-factor 3 --topic "eng2-$t";
done

echo "All topics created"