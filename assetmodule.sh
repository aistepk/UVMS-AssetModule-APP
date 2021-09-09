#!/bin/sh
docker kill postgres-release-1 wildfly-base-1
docker rm postgres-release-1 wildfly-base-1
cd UVMS-AssetModule-APP
mvn clean install -Pdocker,docker-start,liquibase -N
mvn clean install -Pjacoco,liquibase sonar:sonar \
  -Dsonar.projectKey=lia \
  -Dsonar.host.url=http://localhost:8000 \
  -Dsonar.login=20841dd696f9ecf58e4a416eb952c4772cf7ffa6




