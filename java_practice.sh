#!/bin/bash

set -e

MAIN_CLASS="${1:-java_practice.basics.App}"

echo "🚀 Running Java example: $MAIN_CLASS"
./gradlew :java-examples:runExample -PmainClass="$MAIN_CLASS"
