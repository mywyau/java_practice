# Java Syntax Used in the DSA Solutions

This guide explains Java expressions that make algorithm solutions shorter but
can make them harder to read at first. Shorter is not always clearer. It is fine
to use the expanded versions while learning.

## Reading a method signature

```java
public static int[] twoSum(int[] numbers, int target)
```

- `public`: code in other classes may call the method.
- `static`: call it on the class, such as `TwoSum.twoSum(...)`; no `new TwoSum()`
  object is required.
- `int[]`: the method returns an array of integers.
- `int[] numbers`: the first parameter is an integer array.
- `int target`: the second parameter is one integer.

`void` means a method does not return a value. A method such as `moveZeroes`
changes the supplied array directly instead.

## Arrays

```java
int[] numbers = {2, 7, 11, 15};
int first = numbers[0];
int size = numbers.length;
```

Array indexes start at zero, so the last valid index is `numbers.length - 1`.
Arrays have a fixed length after creation.

```java
int[] copy = numbers.clone();
```

For a one-dimensional primitive array, `clone()` copies the values. For a 2D
array, cloning only the outer array still shares the inner arrays. Copy each row
when the rows must also be independent.

## Enhanced `for` loop

Shortcut:

```java
for (int number : numbers) {
    System.out.println(number);
}
```

Roughly equivalent to:

```java
for (int index = 0; index < numbers.length; index++) {
    int number = numbers[index];
    System.out.println(number);
}
```

Use the indexed form when the algorithm needs the index. Assigning to the loop
variable does not alter the array:

```java
for (int number : numbers) {
    number = 0; // changes only the local variable
}
```

To alter the array, assign through an index: `numbers[index] = 0`.

## Increment and decrement

```java
write++;
```

means:

```java
write = write + 1;
```

Post-increment returns the old value before incrementing:

```java
numbers[write++] = number;
```

is equivalent to:

```java
numbers[write] = number;
write = write + 1;
```

By contrast, `++write` increments first and then produces the new value. Avoid
combining increment with other operations until this distinction feels natural.

The same idea applies to `count--`, `--count`, `total += value`, and
`remaining -= coin`.

## Braces and one-line control flow

Java permits braces to be omitted for a single statement:

```java
if (number != 0)
    numbers[write++] = number;
```

The braced version is easier to extend safely:

```java
if (number != 0) {
    numbers[write] = number;
    write++;
}
```

An indentation mistake does not change which statement Java considers part of
an unbraced `if` or loop. Prefer braces while learning and in production code.

## Boolean operators and short-circuiting

- `&&` means AND.
- `||` means OR.
- `!condition` means NOT.
- `==` compares primitive values or object identities.
- `.equals(...)` normally compares object contents.

`&&` and `||` short-circuit: Java evaluates the right side only if it is needed.
This safely checks a linked-list pointer:

```java
while (fast != null && fast.next != null) {
    fast = fast.next.next;
}
```

If `fast` is `null`, Java never evaluates `fast.next`.

## The ternary operator

Shortcut:

```java
return head == null ? 0 : 1 + maxDepth(head.left);
```

Equivalent form:

```java
if (head == null) {
    return 0;
} else {
    return 1 + maxDepth(head.left);
}
```

The syntax is `condition ? valueWhenTrue : valueWhenFalse`. Use it for small
choices; nested ternaries quickly become difficult to follow.

## Collections and generics

```java
List<Integer> values = new ArrayList<>();
Set<Integer> seen = new HashSet<>();
Map<Integer, Integer> counts = new HashMap<>();
Queue<TreeNode> queue = new ArrayDeque<>();
Deque<Integer> stack = new ArrayDeque<>();
```

The type inside `<...>` states what the collection contains. The empty diamond
`<>` tells Java to infer the type on the right from the declaration on the left.

- `List`: ordered values; duplicates are allowed.
- `Set`: unique values; useful for membership checks.
- `Map`: key/value associations.
- `Queue`: first in, first out (FIFO).
- `Deque`: double-ended queue; commonly used as a stack.
- `PriorityQueue`: removes the smallest item first unless given another comparator.

Primitive types such as `int` cannot be generic arguments, so collections use
wrapper types such as `Integer`, `Character`, and `Boolean`. Java usually converts
between `int` and `Integer` automatically; this is called boxing and unboxing.

## Common `Map` shortcuts

### `getOrDefault`

```java
int count = counts.getOrDefault(number, 0);
```

returns the stored value, or `0` when the key is absent.

### `putIfAbsent`

```java
copies.putIfAbsent(original, new Node(original.value));
```

adds a value only when the key does not already exist.

### `merge`

```java
counts.merge(number, 1, Integer::sum);
```

means “store 1 if absent; otherwise add 1 to the old value.” An expanded version is:

```java
if (counts.containsKey(number)) {
    counts.put(number, counts.get(number) + 1);
} else {
    counts.put(number, 1);
}
```

### `computeIfAbsent`

```java
groups.computeIfAbsent(key, ignored -> new ArrayList<>()).add(word);
```

means:

```java
if (!groups.containsKey(key)) {
    groups.put(key, new ArrayList<>());
}
groups.get(key).add(word);
```

`ignored` is the key supplied to the lambda. The name signals that the lambda
does not need to use it.

## Lambdas and method references

A lambda is a small function passed as a value:

```java
(first, second) -> Integer.compare(first.value, second.value)
```

It accepts two nodes and returns how they should be ordered.

A method reference is shorthand when an existing method already does the work:

```java
Integer::sum
```

is similar to:

```java
(first, second) -> Integer.sum(first, second)
```

Another example:

```java
Comparator.comparingInt(node -> node.value)
```

creates a comparator that orders nodes by their integer `value` field.

## Streams

Streams describe a pipeline of transformations:

```java
int maximum = Arrays.stream(numbers).max().orElseThrow();
```

- `Arrays.stream(numbers)` visits the array values.
- `.max()` finds the largest value and returns an `OptionalInt` because an array
  might be empty.
- `.orElseThrow()` returns the value or throws when none exists.

A loop is often easier to debug as a beginner. Streams are syntax convenience,
not a different algorithmic technique.

## Switch expressions

Modern Java can return a value from `switch`:

```java
int result = switch (operator) {
    case "+" -> left + right;
    case "-" -> left - right;
    case "*" -> left * right;
    case "/" -> left / right;
    default -> throw new IllegalArgumentException("Unknown operator");
};
```

The arrow form does not fall through into the next case, unlike the older
colon-and-`break` syntax.

## Nested classes and nodes

Linked-list, tree, and graph exercises define node classes such as:

```java
public static class ListNode {
    public int value;
    public ListNode next;
}
```

`next` stores either another node reference or `null`. Multiple variables can
refer to the same node. Reassigning a variable changes the reference held by that
variable; changing `node.next` mutates the shared node object.

That difference explains why pointer algorithms save references before rewiring:

```java
ListNode next = current.next;
current.next = previous;
current = next;
```

## Recursion syntax

A recursive method calls itself on a smaller subproblem:

```java
static int maxDepth(TreeNode node) {
    if (node == null) {              // base case
        return 0;
    }

    int leftDepth = maxDepth(node.left);
    int rightDepth = maxDepth(node.right);
    return 1 + Math.max(leftDepth, rightDepth);
}
```

Every recursive solution needs:

1. A base case that returns without another recursive call.
2. A smaller subproblem so execution approaches the base case.
3. A definition of what the return value means.

Each unfinished call remains on the call stack. This is why recursive tree and
graph algorithms use stack space even when they create no explicit stack object.

## Numeric details

Integer arithmetic truncates division:

```java
5 / 2 == 2
```

Convert an operand to `double` when a fractional result is required:

```java
double average = (double) sum / count;
```

An `int` can overflow at roughly ±2.1 billion. Use `long` for intermediate sums,
products, squared distances, and counters when inputs might exceed that range:

```java
long squaredDistance = (long) x * x + (long) y * y;
```

The cast occurs before multiplication, so the multiplication itself uses `long`.

## Useful library calls

- `Math.min(a, b)` / `Math.max(a, b)`: smaller/larger value.
- `Arrays.sort(array)`: sort an array in place.
- `Arrays.fill(array, value)`: assign one value to every position.
- `list.add(value)`: append a value.
- `list.removeLast()`: remove the final value in Java 21.
- `stack.push(value)` / `stack.pop()` / `stack.peek()`: stack operations.
- `queue.add(value)` / `queue.remove()` / `queue.element()`: queue operations.
- `set.add(value)`: returns `false` if the value was already present.

Check whether a library operation mutates its input. For example,
`Arrays.sort(array)` changes the array, while `array.clone()` creates another array.

## How to expand unfamiliar code

When a line feels dense:

1. Give each expression a named local variable.
2. Replace ternaries with `if`/`else`.
3. Separate `write++` from the assignment.
4. Replace `merge` or `computeIfAbsent` with explicit map operations.
5. Add braces to every loop and conditional.
6. Print the important state after each iteration.

These transformations do not change the algorithm. They make its state changes
visible, which is usually the fastest route to understanding it.
