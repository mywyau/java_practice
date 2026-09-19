# Java console examples

These examples build from simple output to interactive terminal input. Run all
commands from the repository root.

## 1. Writing output

[`ConsoleOutput.java`](ConsoleOutput.java) compares `print`, `println`, and
`printf`. It also shows the separate standard error stream.

```bash
./java_practice.sh java_practice.console.ConsoleOutput
```

Useful `printf` placeholders include `%s` for text, `%d` for whole numbers,
`%f` for decimals, and `%n` for a platform-independent newline.

## 2. Reading command-line arguments

[`CommandLineArguments.java`](CommandLineArguments.java) reads the `args` array
passed to `main`.

```bash
./gradlew :java-examples:runExample \
  -PmainClass=java_practice.console.CommandLineArguments \
  --args="Ada Java console"
```

Quoted text is one argument; space-separated words are separate arguments.

## 3. Reading interactive input

[`ScannerInput.java`](ScannerInput.java) uses `Scanner` to read lines from
`System.in`, rejects empty names, and keeps asking until an age is valid.

```bash
./java_practice.sh java_practice.console.ScannerInput
```

Reading each response with `nextLine()` and then parsing it avoids the common
surprise where `nextInt()` leaves a newline for the next input operation.

## 4. Using `System.console()`

[`SystemConsoleLogin.java`](SystemConsoleLogin.java) demonstrates `Console` and
hidden password input. Gradle and many IDEs do not provide a real system
console, so compile first and run the class directly in a terminal:

```bash
./gradlew :java-examples:classes
java -cp java-examples/build/classes/java/main \
  java_practice.console.SystemConsoleLogin
```

`readPassword()` returns a `char[]`, which the example clears after use so the
password does not remain in memory longer than necessary.

## Small practice ideas

1. Add a currency value to `ConsoleOutput` and display it with two decimals.
2. Make `CommandLineArguments` print its arguments in reverse order.
3. Ask for two numbers in `ScannerInput` and let the user choose an operation.
4. Limit the login example to three password attempts.
