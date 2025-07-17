# java_practice

### Set Up

SDKman for installing Java on your machine and setting java version

### gradle

MacOS

```
brew install gradle
```

###

```
gradle wrapper
```



## to run specific apps/classes, use custom runner script:

Please look inside build.gradle.kts for task names to run

```
./run.sh.sh <task name>
```

```
./run.sh.sh forLoopExamples
```

###  No pre-defined tasks

If not pre defined task set for file then you will need to update the manual overrides (manualOverrides) in tasks.register<JavaExec>("runMain") then run e.g:

```
./run.sh runMain SetExample
```

