#!/bin/bash

# Stop the script if any command fails
set -e

echo "Running tests for all subprojects..."
./gradlew test
