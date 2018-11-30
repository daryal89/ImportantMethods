package test;

public class LoopConcept {

	public static void main(String[] args) {
		// 1. while:
		int i = 1; // Initialization
		while (i <= 10) { // conditional
			System.out.println("value of i: " + i);
			i++; // incremental/decremental
		}

		// 2. for:
		for (int j = 1; j <= 10; j++) {
			System.out.println("value of J: " + j);
		}

		// do while loop: the loop will run at least one time no matter what will be the
		// condition.
		int k = 5;
		do {
			k++;
			System.out.println("value of k: " + k);
		} while (k < 1);
	}
}
