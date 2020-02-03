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
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		for (int i = 1; i < numbers.size()-1; i++) {
			if (numbers.get(i-1) < numbers.get(i) && numbers.get(i) < numbers.get(i+1)) {
				return true;
			}
		}

		return false;
		}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) {
			return false;
		}

		boolean lastPlace = false;
		int gap = 0;

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == x) {
				lastPlace = true;
				gap = 0;
			} else {
				if (i == 1 && lastPlace == false) {
					return false;
				} else if (lastPlace == false) {
					gap++;
				}
				lastPlace = false;
			}

			if (gap == 2) {
				return false;
			}
		}

		return true;
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		for (int i = 1; i < numbers.size()-1; i++) {
			if (numbers.get(i-1) % 2 == 0 && numbers.get(i) % 2 == 0 && numbers.get(i+1) % 2 == 0) {
				return true;
			}else if (numbers.get(i-1) % 2 == 1 && numbers.get(i) % 2 == 1 && numbers.get(i+1) % 2 == 1) {
				return true;
			}
		}

		return false;
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.length < 2) {
		return false;
	}

	for (int i = 0; i < numbers.length - 1; i++) {
		int sum1 = 0;
		int sum2 = 0;

		for (int j = i; j >= 0; j--) {
			sum1 += numbers[j];
		}

		for (int b = i + 1; b < numbers.length; b++) {
			sum2 += numbers[b];
		}

		if (sum1 == sum2) {
			return true;
		}
	}
	return false;
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
