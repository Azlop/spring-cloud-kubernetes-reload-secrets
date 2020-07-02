#!/bin/bash -e

eval $(minikube docker-env)

mvn clean install

docker build -t reload-secret-service .

kubectl delete -f k8s/secret.yaml
kubectl delete -f k8s/service.yaml
kubectl delete -f k8s/deployment.yaml

kubectl create -f k8s/secret.yaml
kubectl create -f k8s/service.yaml
kubectl create -f k8s/deployment.yaml

kubectl get pods
