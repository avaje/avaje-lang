package io.avaje.lang;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;

/**
 * A common annotation to declare that annotated elements can be {@code null}.
 * <p>
 * Used in association with {@code @NonNullApi} to override the default
 * non-nullable semantic to nullable.
 * <p>
 * Leverages JSR-305 meta-annotations to indicate nullability in Java to common
 * tools with JSR-305 support and used by Kotlin to infer nullability.
 * <p>
 * Should be used at parameter, return value. Methods override should repeat
 * parent {@code @Nullable} annotations unless they behave differently.
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
@Documented
@Nonnull(when = When.MAYBE)
@TypeQualifierNickname
public @interface Nullable {
}