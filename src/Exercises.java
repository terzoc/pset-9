import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
			return true;
		}

		return false;
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() < n || n <= 0) {
			return new ArrayList<String>();
		}

		ArrayList<String> combined = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			combined.add(values.get(i));
		}

		for (int i = values.size() - n; i < values.size(); i++) {
			combined.add(values.get(i));
		}

		return combined;
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		int min = 0;
		int max = 0;

		for (int i = 0; i < numbers.size(); i++) {
			if (i == 0) {
				min = numbers.get(i);
				max = numbers.get(i);
			}

			if (max < numbers.get(i)) {
				max = numbers.get(i);
			}

			if (min > numbers.get(i)) {
				min = numbers.get(i);
			}
		}

		int differnce = max-min;

		return differnce;
	}

	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		}

		int middle = (int)(Math.ceil(numbers.size() / 2));
		double max = -1;

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < 0) {
					return -1;
				}

				if ((i == 0 || i == numbers.size() - 1 || i == middle) && numbers.get(i) > max) {
					max = numbers.get(i);
				}
			}

		return max;
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		if (values == null || values.size() < 3 || values.size() % 2 == 0) {
			return new ArrayList<String>();
		}

		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return new ArrayList<String>();
			}
		}

		int middle = (int)(Math.ceil(values.size() / 2));
		ArrayList<String> middles = new ArrayList<String>();
		middles.add(values.get(middle-1));
		middles.add(values.get(middle));
		middles.add(values.get(middle+1));

		return middles;
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
