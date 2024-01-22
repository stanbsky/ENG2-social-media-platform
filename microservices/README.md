# README - Bringing up Docker containers

**Attempting to run `docker compose up` will result in microservices dying on start!**

This is due to the topics not being created prior to the containers launching. There are two options to solve this:
* Run the provided `./compose-up.sh` script: it will re-run `docker compose up -d` after topic creation is completed.
* Simply wait 10-20 seconds, then re-run `docker compose up -d` manually.

I don't believe it's feasible for Docker orchestration to wait until another container finishes, so this was the solution I adapted.
