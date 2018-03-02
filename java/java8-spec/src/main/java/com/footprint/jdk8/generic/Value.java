package com.footprint.jdk8.generic;

/**
 * 更好的泛型推断
 * @param <T>
 */
public class Value<T> {
    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return (value != null) ? value : defaultValue;
    }
}