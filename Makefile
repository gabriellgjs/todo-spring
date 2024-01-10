DOCKER_COMPOSE_FILE=.docker/docker-compose.yml

# ┌─────────────────────────────────────────────────────────────────────────────┐
# │ Infra commands                                                              │
# └─────────────────────────────────────────────────────────────────────────────┘


.PHONY: start
start: build
	@docker-compose -f $(DOCKER_COMPOSE_FILE) up -d --build

.PHONY: stop
stop:
	@docker-compose -f $(DOCKER_COMPOSE_FILE) down


