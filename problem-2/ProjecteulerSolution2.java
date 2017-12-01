package io.zzzz.owo;

public class ProjecteulerSolution2 {

	public static void main(String[] args) {
		double a = 1, b = 2, y = 0, z = 2;
		
		while (y < 4000000) {
			y = a+b;
			a = b;
			b = y;
			
			if (y % 2 == 0) {
				z += y;
			}
		}
		System.out.print(z);
	}

}
