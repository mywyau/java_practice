#!/bin/bash

# Stop the script if any command fails
set -e

echo "Starting the default Java exercises..."
./gradlew :java-examples:run
