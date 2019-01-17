package com.practice.immutable;

public final class ImmutableClass {

	private final int id;
	private final String name;
	private final MutableClass mutableInstance;

	public ImmutableClass(int id, String name, MutableClass mutableInstance) {
		super();
		this.id = id;
		this.name = name;
		// this.mutableInstance = mutableInstance;
		this.mutableInstance = new MutableClass(mutableInstance.getId(), mutableInstance.getName());

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public MutableClass getMutableInstance() {
		return mutableInstance;
	}

	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", mutableInstance=" + mutableInstance + "]";
	}

}
