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
5. [`HigherOrderFunctions.java`](HigherOrderFunctions.java) passes functions to
   methods, returns functions, curries arguments, and partially applies values.
6. [`EitherExample.java`](EitherExample.java) uses [`Either.java`](Either.java)
   for computations that can return a useful error or a successful value.
7. [`ValidationExample.java`](ValidationExample.java) uses
   [`Validation.java`](Validation.java) to accumulate errors from independent
   checks rather than stopping after the first error.
8. [`FunctorAndMonad.java`](FunctorAndMonad.java) connects the terms *functor*
   and *monad* to Java's familiar `map` and `flatMap` operations.
9. [`AlgebraicDataTypes.java`](AlgebraicDataTypes.java) models a closed set of
   alternatives with records, a sealed interface, and an exhaustive switch.
10. [`FoldsAndMonoids.java`](FoldsAndMonoids.java) generalises reductions using
    an identity value and an associative combine operation.

```bash
./java_practice.sh java_practice.functional.LambdaAndInterfaces
./java_practice.sh java_practice.functional.FunctionComposition
./java_practice.sh java_practice.functional.StreamPipeline
./java_practice.sh java_practice.functional.OptionalExample
./java_practice.sh java_practice.functional.HigherOrderFunctions
./java_practice.sh java_practice.functional.EitherExample
./java_practice.sh java_practice.functional.ValidationExample
./java_practice.sh java_practice.functional.FunctorAndMonad
./java_practice.sh java_practice.functional.AlgebraicDataTypes
./java_practice.sh java_practice.functional.FoldsAndMonoids
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

## How the vocabulary maps to Java

| Idea | Meaning | Java expression |
| --- | --- | --- |
| Pure function | Same input gives the same output, with no observable side effects | A method that only reads its arguments and returns a value |
| Immutable data | Create a new value instead of changing an existing one | Records, `List.copyOf`, unmodifiable collections |
| Higher-order function | Accepts or returns another function | `Function`, `Predicate`, `Supplier`, `Consumer` |
| Function composition | Builds a function from smaller functions | `compose`, `andThen` |
| Functor | A context whose values can be transformed with `map` | `Optional.map`, `Stream.map`, `Either.map` |
| Monad | A context that chains context-producing operations with `flatMap` | `Optional.flatMap`, `Stream.flatMap`, `Either.flatMap` |
| Either/Result | An error value or a success value | The custom sealed `Either<L, R>` in this package |
| Applicative validation | Combines independent checks and accumulates errors | `Validation.map2` |
| Algebraic data type | Data built from a fixed set of alternatives and/or fields | Sealed interfaces plus records |
| Fold | Reduces a structure to one value | `Stream.reduce` or `collect` |
| Monoid | An associative combine operation with an identity | `0` plus addition, `""` plus concatenation |

`Optional`, `Either`, and `List` can each behave like functors and monads, but
Java cannot express one type-safe, fully general `Functor<F<_>>` or
`Monad<F<_>>` interface. That abstraction needs **higher-kinded types**, which
Java does not have. In ordinary Java, prefer concrete `map` and `flatMap`
methods. Libraries such as Vavr can provide richer concrete types, while
libraries that emulate higher-kinded types introduce considerably more
ceremony.

The distinction between `Either` and `Validation` matters in real programs:

- Use `Either.flatMap` when later work depends on an earlier success; failure
  should stop the chain.
- Use `Validation.map2` when checks are independent and a caller benefits from
  seeing all errors at once, such as validating a form.

## Useful patterns to learn next

After these examples, the most useful topics are referential transparency,
lazy evaluation, recursion and trampolining, memoisation, lenses for immutable
updates, effect isolation, and property-based testing. In production Java,
immutable values, explicit error types, small pure functions, and composing at
the edges usually deliver more value than recreating every abstraction from a
purely functional language.

## Practice ideas

1. Add subtraction and division lambdas to `LambdaAndInterfaces`.
2. Extend the username function to replace hyphens with dots.
3. Add an average-price calculation to `StreamPipeline`.
4. Change `productsByCategory` to count products instead of storing lists.
5. Add a user with no email and model the email as an `Optional<String>`.
6. Add `filter` and `peek` operations to `Either` and write their tests first.
7. Extend `ValidationExample` with an independently validated email address.
8. Verify the functor identity law: `value.map(x -> x)` equals `value`.
9. Verify the monad right-identity law: `value.flatMap(Either::right)` equals
   `value`.
10. Define multiplication and boolean-AND monoids, then fold sample lists.
