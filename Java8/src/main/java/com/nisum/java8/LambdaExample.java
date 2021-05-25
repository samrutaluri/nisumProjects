package com.nisum.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample<D> {

	private D district;

	public LambdaExample(D district) {
		this.district = district;
	}

	public <R> R apply(Function<? super D, ? extends R> function) {
		return function.apply(district);
	}

	public boolean matches(Predicate<? super D> predicate) {
		return predicate.test(district);
	}

	public void consume(Consumer<? super D> consumer) {
		consumer.accept(district);
	}
}