package com.practice.dataStructures;

public interface IAdvancedStack<T> {

	public void push(T newItem);

	public T pop();

	public boolean contains(T item);

	public T access(T item);

	public int size();
}
