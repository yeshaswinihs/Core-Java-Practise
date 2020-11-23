package com.practice.basicPrograms;

import java.util.HashSet;
import java.util.Set;

public class T {

	public static void main(String[] args) {
		T t = new T();
		I ia = t.new A();
		I.test3();
		I ib = t.new B();
		ia.test();
		C c = t.new D();
	Set s = new HashSet();
	Object o = new Object();
	s.add("hjd");

	}

	interface I {
		default void test() {
			System.out.println("test in I");
		}

		// public abstract void test2();
		
		static void test3() {
			System.out.println("test3");
		}
	}

	interface J {
		default void test() {
			System.out.println("test in J");
		}
	}

	class A implements I, J{

		@Override
		public void test() {
			// TODO Auto-generated method stub
			I.super.test();
		}

//		@Override
//		public void test2() {
//			System.out.println("test2");
//		}

//		public void test() {
//			System.out.println("in A class");
//		}

	}

	class B implements I {

//		@Override
//		public void test2() {
//			// TODO Auto-generated method stub
//			
//		}

	}
	
	abstract class C{
		abstract void t();
		void dos() {
			System.out.println("did");
		}
	}
	
	class D extends C{

		@Override
		void t() {
			// TODO Auto-generated method stub
			System.out.println("t in");
		}
		
	}
}
