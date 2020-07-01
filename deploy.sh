#!/bin/bash -e

eval $(minikube docker-env)

docker build -t reload-secrets .

kubectl delete -f k8s/secret.yaml
kubectl delete -f k8s/service.yaml
kubectl delete -f k8s/deployment.yaml

sleep 3

kubectl create -f k8s/secret.yaml
kubectl create -f k8s/service.yaml
kubectl create -f k8s/deployment.yaml

kubectl get pods
