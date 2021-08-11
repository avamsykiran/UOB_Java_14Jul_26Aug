package com.cts.lsd.service;

@FunctionalInterface
public interface Consumer<T> {
	void doConsume(T value);
}
