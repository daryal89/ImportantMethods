package methods;

public class TwoMaxValues {
		public void GetTwoMaxValues(int[] nums) {

			int maxOne = 0;
			int maxTwo = 0;
			for (int n : nums) {
				if (maxOne < n) {
					maxTwo = maxOne;
					maxOne = n;
				} else if (maxTwo < n) {
					maxTwo = n;
				}

			}

			System.out.println("Max1 - " + maxOne);
			System.out.println("Max2 - " + maxTwo);
		}

		public static void main(String[] args) {

			int list[] = { 15, 24, 48, 21, 43, 11, 79, 93 };

			TwoMaxValues max = new TwoMaxValues();
			max.GetTwoMaxValues(list);
		}
	}

