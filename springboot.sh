#!/bin/bash

# Stop the script if any command fails
set -e

echo "Starting the application..."
./gradlew :spring-boot-example:bootRun
