# spring-cloud-kubernetes-reload-secrets
Reload Secrets

# Description
Simple project to test reload a Secret when

# Setup
1. Start minikube
$ minikube start

2. Create the required roles so Spring Cloud Kubernetes can interact with Kubernetes itself
$ kubectl create -f k8s/set-roles.yaml

3. Run deploy.sh
$ ./deploy.sh