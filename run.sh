#!/bin/bash

set -e

echo "🔨 Building the application..."
./gradlew build

# Default task name if none given
DEFAULT_TASK="runJavaPracticeApp"
TASK="$1"
MAIN_CLASS="$2"

if [[ -z "$TASK" ]]; then
  TASK="$DEFAULT_TASK"
fi

if [[ "$TASK" == "runMain" && -n "$MAIN_CLASS" ]]; then
  echo "🚀 Running main class: $MAIN_CLASS"
  ./gradlew runMain -PmainClass="$MAIN_CLASS"
else
  echo "🚀 Running task: $TASK"
  ./gradlew "$TASK"
fi
