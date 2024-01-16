#!/bin/bash

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

create() {
    for t in $TOPICS; do
        echo "Creating $t"
        ./topics.sh --create --topic "eng2-$t" --partitions 6 --replication-factor 3
    done
}

delete() {
    for t in $TOPICS; do
        echo "Deleting $t"
        ./topics.sh --delete --topic "eng2-$t"
    done
}

case "$1" in
    create)
        create
        ;;
    delete)
        delete
        ;;
    purge)
        delete
        create
        ;;
    *)
        echo "Invalid command: $1. Use 'create', 'delete', or 'purge'."
        exit 1
        ;;
esac

exit 0
