package io.zzzz.owo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProjecteulerSolution3 {

	public static void main(String[] args) {
		double target = 600851475143.0;
		double target_square = Math.sqrt(target);
		List<Integer> primeNumbers = sieveOfEratosthenes((int) target_square);
		
		for(int a = primeNumbers.size(); a > 0; a--) {
			if(target % primeNumbers.get(a-2) == 0) {
				System.out.print(primeNumbers.get(a-2));
				break;
			}
		}		
	}
	
	public static List<Integer> sieveOfEratosthenes(int n) {
		boolean primes[] = new boolean[n+1];
		Arrays.fill(primes, true);
		
		for (int p = 2; p*p <= n; p++) {
			if(primes[p]) {
				for(int i = p*2; i <= n; i += p) {
					primes[i] = false;
				}
			}
		}
		
		List<Integer> primeNumbers = new LinkedList<>();
		for(int i = 2; i <= n ; i++) {
			if(primes[i]) {
				primeNumbers.add(i);
			}
		}
		
		return primeNumbers;
	}

}
