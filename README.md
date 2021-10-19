# avaje-lang

Provides `@NonNullAPI` and `@Nullable` for APIs

## Step 1. Add dependency

```xml
    <dependency>
      <groupId>io.avaje</groupId>
      <artifactId>avaje-lang</artifactId>
      <version>1.0</version>
    </dependency>
```

## Step 2. Put `@NonNullAPI` on either package-info or a type

This defines the return type and parameters to be `@Nonnull` by default

## Step 3. Put `@Nullable` on anything that can be nullable


# How it works

These annotations are meta annotations using `jsr-305` annotations (`javax.annotation`)
and are then honored by most tools - IntelliJ etc.

Note that these annotations are RetentionType CLASS and expected to be used at compile time
only via static analysis and can not be read or used at runtime.
