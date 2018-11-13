package com.practice.access.package2;

class Player {
	private String name;
	private static int count;

	Player(String name) {
		count++;
		this.name = name;
		return;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void setCount(int count) {
		Player.count = count;
	}

	public static int getCount() {
		return count;
	}
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
		System.out.println(Player.getCount());
		Player player2 = new Player("Messi");
		System.out.println(Player.getCount());

	}

}
