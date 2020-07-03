# spring-cloud-kubernetes-reload-secrets
Reload Secrets

## Description
Simple project to test reload of a Secret when it changes on the fly.

## Setup
Start minikube

	minikube start

Create the required roles so Spring Cloud Kubernetes can interact with Kubernetes itself

	kubectl create -f k8s/set-roles.yaml

Run deploy.sh

	./deploy.sh

## Versions used
Ubuntu 20.04 LTS
docker - 19.03.8
kubectl - v1.18.3
minikube - v1.11.0

## Useful info
https://cloud.spring.io/spring-cloud-static/spring-cloud-kubernetes/1.1.3.RELEASE/reference/html/