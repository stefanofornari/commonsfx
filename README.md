# commonsfx

A collection of useful utilities and extensions for JavaFX.

## Features

### Nullable IntegerProperty
`IntegerProperty` provides a nullable alternative to the standard `SimpleIntegerProperty` by using `Integer` instead of `int`.

```java
IntegerProperty p = new IntegerProperty(null);
p.setValue(10);
p.setValue(null); // Supported
```

### MappedList
A `TransformationList` that maps elements from a source `ObservableList` using a provided function.

```java
ObservableList<String> source = FXCollections.observableArrayList("1", "2", "3");
MappedList<Integer, String> mapped = new MappedList<>(source, Integer::valueOf);
// mapped reflects changes in source and converts types on the fly
```
