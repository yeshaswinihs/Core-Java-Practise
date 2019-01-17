package com.practice.singleton;

//Instance is created as soon as Class is loaded
class EagerInitializedSingletonClass {

	private static EagerInitializedSingletonClass instance = new EagerInitializedSingletonClass();

	private EagerInitializedSingletonClass() {
	}

	public EagerInitializedSingletonClass getInstance() {
		return instance;
	}

}

// Instance is created only when getInstance method is invoked
class LazyInitializedSingletonClass {

	private static LazyInitializedSingletonClass instance;

	private LazyInitializedSingletonClass() {
	}

	// Method is not thread safe, when 2 threads execute getInstance at the same
	// time 2 instances might get created
	public LazyInitializedSingletonClass getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingletonClass();
		}
		return instance;
	}

}

class ThreadSafeSingletonClass {
	private static ThreadSafeSingletonClass instance;

	private ThreadSafeSingletonClass() {
	}

	// Using synchronized method, but it comes with performance impact
	public synchronized ThreadSafeSingletonClass getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingletonClass();
		}
		return instance;
	}
}

class BillPughSingletonClass {

	private BillPughSingletonClass() {
	}

	private static class SingletonHelper {
		private static final BillPughSingletonClass instance = new BillPughSingletonClass();
	}

	public BillPughSingletonClass getInstance() {
		return SingletonHelper.instance;
	}
}

public class SingletonClassRunner {

	public static void main(String[] args) {


	}

}
