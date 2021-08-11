package com.cts.lsd.service;

@FunctionalInterface
public interface Function<T> {
	T compute(T v1,T v2);
}
