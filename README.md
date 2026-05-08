# LeetCode Java Solutions

This repository contains Java solutions to LeetCode-style problems, organized by topic in Maven modules.

## Project layout

- `pom.xml` - root Maven aggregator (`packaging=pom`)
- `01two-pointers/` - module for two-pointer problems
- `01two-pointers/src/main/java/com/codeprep/PairSumSorted.java` - current solved problem example

## Requirements

- Java 25 (configured in both `pom.xml` files)
- Maven 3.9+

## Build

From the repository root:

```bash
mvn clean compile
```

Build a single module:

```bash
mvn -pl 01two-pointers clean compile
```

## Problem index

### Two pointers

- Pair Sum in Sorted Array - `com.codeprep.PairSumSorted`

## Notes

- Modules are numbered by topic to keep progression clear.
- Add tests under each module's `src/test/java` as new solutions are added.
