#!/bin/sh

set -e -x

cd sonic-eats-ms
  ./gradlew build

cd ..
cp ./build/libs/demo-service-0.0.1-SNAPSHOT.jar build-output/.

pwd
