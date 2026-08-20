# SOLID Principles in Java

SOLID is a set of design guidelines that helps classes remain understandable,
testable, and adaptable as an application grows. These are guidelines rather
than rules: use them when they make a design clearer.

## Suggested order

1. `single_responsibility/SingleResponsibilityExample.java`
2. `open_closed/OpenClosedExample.java`
3. `liskov_substitution/LiskovSubstitutionExample.java`
4. `interface_segregation/InterfaceSegregationExample.java`
5. `dependency_inversion/DependencyInversionExample.java`

Run an example from the repository root:

```bash
./gradlew :java-examples:runExample \
  -PmainClass=java_practice.solid.single_responsibility.SingleResponsibilityExample
```

After running each example, try changing the requirement described in its
comments. Notice which version requires fewer unrelated changes.

## The five principles

- **Single Responsibility:** a class should have one reason to change.
- **Open/Closed:** code should be open for extension but closed for modification.
- **Liskov Substitution:** a subtype should work anywhere its parent type is expected.
- **Interface Segregation:** clients should not depend on methods they do not use.
- **Dependency Inversion:** high-level policy should depend on abstractions, not details.
