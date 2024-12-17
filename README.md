# Groovy NullPointerException in Collection Iteration

This repository demonstrates a common Groovy bug related to NullPointerExceptions when iterating over collections that might be null. The `BuggyGroovyCode.groovy` file shows the problematic code, while `FixedGroovyCode.groovy` provides a solution.

## Bug Description

The `myMethod` function iterates over a list of integers, doubling each number and printing the result. If the input list (`numbers`) is null, a `NullPointerException` is thrown because the `each` method cannot be called on null. This is a subtle bug that can be easily missed.

## Solution

The `FixedGroovyCode.groovy` file demonstrates how to safely handle potential null inputs.  A simple null check before the iteration prevents the exception.

## How to Reproduce

1. Clone this repository.
2. Run `BuggyGroovyCode.groovy`. Observe the NullPointerException.
3. Run `FixedGroovyCode.groovy`. Observe the graceful handling of the null input.