package com.practice.basicPrograms;

import java.io.FileNotFoundException;
import java.io.IOException;

public class L1Altmetrik {

	public static void main(String[] args) {
		L1Altmetrik l1Altmetrik = new L1Altmetrik();
		
		l1Altmetrik.test2();
		//l1Altmetrik.test1();
		
		try {
			A a = l1Altmetrik.new D();
			a.meth();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void test1(){
		char[] chars= {'a', 'D', 's','t','h','w','T'};
		char[]moves= {2,4,5,1,6,7,8,3};
		int j=0;
		for(char move:moves) {
			j+=move;
			j%=chars.length;
			System.out.println(chars[j]);
			
		}
	}
	
	void test2() {
		int n=3;
		int m=2;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println("i"+i);
			}
		}
	}
	
//	for (i = 0; i < N; i++) {
//	     for (j = 0; j < M; j++) {
//	         sequence of statements
//	      }
//	  }
//	The outer loop executes N times. Every time the outer loop executes, the inner loop executes M times.
//	As a result, the statements in the inner loop execute a total of N * M times. 
//	Thus, the total complexity for the two loops is O(N2).
	
	interface A {
	   public void meth() throws IOException;
	}

	class B implements A {
	    @Override
		public void meth() throws FileNotFoundException { } // compiles fine
	}

	class C implements A  {
	    @Override
	   public void meth() { } // compiles fine
	}

	class D implements A  {
	    @Override
	    public void meth() throws NullPointerException { 
	    	System.out.println("Name2");
	    } 
	    
	}

}
