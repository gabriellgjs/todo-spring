DOCKER_COMPOSE_FILE=.docker/docker-compose.yml
DOCKER_ENV_FILE=.docker/.env

# ┌─────────────────────────────────────────────────────────────────────────────┐
# │ Infra commands                                                              │
# └─────────────────────────────────────────────────────────────────────────────┘

.PHONY: build
build:
	@docker-compose -f $(DOCKER_COMPOSE_FILE) --env-file $(DOCKER_ENV_FILE) build

.PHONY: start
start: build
	@docker-compose -f $(DOCKER_COMPOSE_FILE) --env-file $(DOCKER_ENV_FILE) up -d

.PHONY: stop
stop:
	@docker-compose -f $(DOCKER_COMPOSE_FILE) --env-file $(DOCKER_ENV_FILE) down


