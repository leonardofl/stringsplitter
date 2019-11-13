# String Splitter

A String splitter util for Java.

|  Feature   | Status |
|:----------:|:------:|
| Unit Tests | [![Build Status](https://travis-ci.org/ortolanph/stringsplitter.svg?branch=master)](https://travis-ci.org/ortolanph/stringsplitter) |
| Coverage   | [![Coverage Status](https://coveralls.io/repos/github/ortolanph/stringsplitter/badge.svg?branch=master)](https://coveralls.io/github/ortolanph/stringsplitter?branch=master) |

## Requirements

Java 8 or later.

## How to use

### Splitting Strings

```java
String data = "Collect THIS text";

// Only the text
String result = StringSplit
    .newStringSplit(7, 11)
    .split(data);

// Lower Case
String resultUpperCase = StringSplit
    .newStringSplit(7, 11, WordCase.LOWER_CASE)
    .split(data);

// Trimmed
String resultUpperCase = StringSplit
    .newStringSplit(7, 12, true)
    .split(data);

// Lower Case and Trimmed
String resultUpperCase = StringSplit
    .newStringSplit(7, 12, WordCase.LOWER_CASE, true)
    .split(data);
```

### Splitting String Arrays

```java
String data = "STRINGSPLITTER";

StringArraySplit StringArraySplit = new StringArraySplit();

StringArraySplit splitter = new StringArraySplit();

StringSplit stringSplit1 = StringSplit.newSplit(0, 6);
StringSplit stringSplit2 = StringSplit.newSplit(6);

splitter.addSplit(stringSplit1);
splitter.addSplit(stringSplit2);

List<String> result = splitter.split(data);
```

Or using a builder:

```java
String data = "STRINGSPLITTER";

List<String> result =
    StringArraySplitterBuilder
        .newSplitter()
        .addStringSplit(0, 6)
        .addStringSplit(6)
        .build()
        .split(data);
```


### Splitting Booleans

```java
String data = "FAILED SUCCESS";

Function conversionFunction<String, Boolean> = myTrue => {
    if(myTrue.equals("FAILED ") {
        return Boolean.FALSE;
    }

    if(myTrue.equals("SUCCESS") {
        return Boolean.TRUE;
    }

    return Boolean.FALSE;
};

BooleanSplit booleanSplit = BooleanSplit.newBooleanSplit(0, 7, conversionFunction);

boolean hasCompleted = booleanSplit.split(data);

```

### Splitting Bytes

```java
String data = "textfile.txt  40KB";

ByteSplit byteSplit = ByteSplit.newByteSplit(12, 16);

byte fileSizeInKB = byteSplit.split(data);

```

### Splitting Characters

```java
String data = "↑↑↓↓←→←→BA";

CharacterSplit characterSplit = CharacterSplit.newCharacterSplit(1);

char direction = characterSplit.split(data);
```

### Splitting Shorts

```java
String data = "BANK BRAND25892";

ShortSplit shortSplit = ShortSplit.newShortSplit(10, 14);

short agencyNumber = shortSplit.split(data);
```

### Splitting Integers

```java
String data = "FANCY LAPTOP i7     2,300";

IntegerSplit split = IntegerSplit.newIntegerSplit(20, ",");

int productPrice = split.split(data);
```

### Splitting Longs

```java
String data = "EARTH     149600000"

LongSplit longSplit = LongSplit.newLongSplit(10);

long distanceFromTheSun = longSplit.split(data);

```

## Next versions

The following table shows the plans to evolve the framework:

| Release | Feature | Status | Tasks Link |
|:-------:| ------- |:------:|:----------:|
| 1 | Framework architecture | Implemented | |
| 2 | StringSplit, StringArraySplit, CharacterSplit, ByteSplit, ShortSplit, IntegerSplit, LongSplit | Implemented | |
| 3 | LocalDateSplit, LocalTimeSplit, LocalDateTimeSplit, DateSplit and CalendarSplit | Under development | [Tasks](V3Tasks.md) | 
| 4 | FloatSplit, DoubleSplit, EntityBuilder update | To Be Implemented | |
| 5 | Studies on reflections, EntityBuilder and FieldSplit | To Be Implemented | |
| 6 | Annotations and Annotations Processing | To Be Defined | |
| 7 | Maven central plans | To Be Defined | |

## Reference

[Java Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

[Java Reflection, but Faster](https://dzone.com/articles/java-reflection-but-faster?edition=399225&utm_source=Zone%20Newsletter&utm_medium=email&utm_campaign=java%202018-09-25)

[Setters, Method Handles, and Java 11
](https://dzone.com/articles/setters-method-handles-and-java-11)
