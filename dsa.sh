#!/bin/bash

set -e

MAIN_CLASS="${1:-dsa.BinaryTreeLevelOrder}"

echo "🚀 Running DSA example: $MAIN_CLASS"
./gradlew :java-examples:runExample -PmainClass="$MAIN_CLASS"
