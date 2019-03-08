package com.practice.designPatterns.observable;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock implements Observable {

	private List<Observer> observers;
	private String name;
	private int price;

	Stock() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		if (observers != null) {
			observers.add(observer);
		}
	}

	@Override
	public void notifyObserver() {
		observers.stream().forEach(observer -> observer.update(this));

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void updateStockPrice(int price) {
		this.price = price;
		this.notifyObserver();
	}

}
