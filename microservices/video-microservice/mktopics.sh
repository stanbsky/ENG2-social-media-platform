#!/bin/bash

TOPICS='video-posted video-liked video-disliked video-viewed'

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