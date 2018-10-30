package stuff;

public class Calculator {

	int answer = 0;

	public static void main(String[] args) {

		Calculator y = new Calculator(1);
		int a = 11;
		int b = 8;
		int x = y.add(11, 8);
		int z = y.subtract(11, 8);
		int v = y.multiply(11, 8);
		int m = y.divide(11, 8);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(a + "+ " + b + "=" + x);
		System.out.println(a + "- " + b + "=" + z);
		System.out.println(a + "* " + b + "=" + v);
		System.out.println(a + "/ " + b + "=" + m);
		System.out.println("yo homeboy");

	}

	public Calculator(int answer) {
		this.answer = answer;
	}

	public int add(int a, int b) {
		answer = a + b;
		return answer;

	}

	public int subtract(int a, int b) {
		answer = a - b;
		return answer;

	}

	public int multiply(int a, int b) {
		answer = a * b;
		return answer;

	}

	public int divide(int a, int b) {
		answer = a / b;
		return answer;

	}

}
