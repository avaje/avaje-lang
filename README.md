[![Build](https://github.com/avaje/avaje-lang/actions/workflows/build.yml/badge.svg)](https://github.com/avaje/avaje-lang/actions/workflows/build.yml)
[![Maven Central](https://img.shields.io/maven-central/v/io.avaje/avaje-lang.svg?label=Maven%20Central)](https://mvnrepository.com/artifact/io.avaje/avaje-lang)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/avaje/avaje-lang/blob/master/LICENSE)
[![JDK EA](https://github.com/avaje/avaje-lang/actions/workflows/jdk-ea.yml/badge.svg)](https://github.com/avaje/avaje-lang/actions/workflows/jdk-ea.yml)

# avaje-lang

Provides `@NonNullAPI` and `@Nullable` for APIs

## Step 1. Add dependency

```xml
    <dependency>
      <groupId>io.avaje</groupId>
      <artifactId>avaje-lang</artifactId>
      <version>1.1</version>
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

The `jsr-305` annotations are not required to be a transitive dependency for the tooling
like IntelliJ to recognise and use.

# References

- https://blog.tlinkowski.pl/2019/when-to-use-jsr-305-for-nullability-in-java/
- [Spring framework NonNullApi](https://github.com/spring-projects/spring-framework/blob/main/spring-core/src/main/java/org/springframework/lang/NonNullApi.java)
- [Optional - The Mother of All Bikesheds by Stuart Marks](https://youtu.be/Ej0sss6cq14)

