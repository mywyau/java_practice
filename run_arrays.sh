#!/bin/bash

# Stop the script if any command fails
set -e

echo "Starting the array-list example..."
./gradlew :java-examples:runExample \
  -PmainClass=java_practice.collections.ArrayListsExamples
