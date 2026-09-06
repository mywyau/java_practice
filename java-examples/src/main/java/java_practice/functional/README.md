# Functional programming in Java

Functional programming treats behaviour as data: functions can be stored in
variables, passed to methods, composed, and applied to collections. Java is not
a purely functional language, but lambdas, method references, streams, and
`Optional` support this style well.

Run these commands from the repository root.

## Suggested order

1. [`LambdaAndInterfaces.java`](LambdaAndInterfaces.java) introduces lambdas and
   the standard `Predicate`, `Function`, `Consumer`, and `Supplier` interfaces.
2. [`FunctionComposition.java`](FunctionComposition.java) combines small
   functions with `andThen` and predicates with `and`.
3. [`StreamPipeline.java`](StreamPipeline.java) demonstrates `filter`, `sorted`,
   `map`, `toList`, numeric streams, and `groupingBy`.
4. [`OptionalExample.java`](OptionalExample.java) models values that may be
   missing without returning `null`.

```bash
./java_practice.sh java_practice.functional.LambdaAndInterfaces
./java_practice.sh java_practice.functional.FunctionComposition
./java_practice.sh java_practice.functional.StreamPipeline
./java_practice.sh java_practice.functional.OptionalExample
```

## The shape of a stream pipeline

```text
source -> intermediate operations -> terminal operation
 list       filter / map / sorted       toList / sum / forEach
```

Intermediate operations are lazy: Java performs the work only when a terminal
operation is requested. A stream does not modify its source collection.

Prefer small, deterministic functions that return a new value and avoid
changing shared state. They are easier to combine, understand, and test.

## Practice ideas

1. Add subtraction and division lambdas to `LambdaAndInterfaces`.
2. Extend the username function to replace hyphens with dots.
3. Add an average-price calculation to `StreamPipeline`.
4. Change `productsByCategory` to count products instead of storing lists.
5. Add a user with no email and model the email as an `Optional<String>`.
