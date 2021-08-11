package com.cts.lsd.service;

@FunctionalInterface
public interface Predicate<T> {
	boolean check(T value);
}
