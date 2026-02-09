class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
	void subtract(int a, int b) {
		System.out.println("Difference: " + (a - b));
	}

	public void subtract(double a, double b) {
		System.out.println("Difference: " + (a - b));
	}

	public void subtract(int a, int b, int c) {
		System.out.println("Difference: " + (a - b - c));
	}
	void multiply(int a, int b) {
		System.out.println("Product: " + (a * b));
	}
	void multiply(double a, double b) {
		System.out.println("Product: " + (a * b));
	}
	void multiply(int a, int b, int c) {
		System.out.println("Product: " + (a * b * c));
	}
	void divide(int a, int b) {
		if (b != 0) {
			System.out.println("Quotient: " + (a / b));
		} else {
			System.out.println("Cannot divide by zero");
		}
	}
	void divide(double a, double b) {
		if (b != 0) {
			System.out.println("Quotient: " + (a / b));
		} else {
			System.out.println("Cannot divide by zero");
		}
	}
}

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(5, 10);
        obj.add(5.5, 10.5);
        obj.add(5, 10, 15);
		obj.subtract(10, 5);
		obj.subtract(10.5, 5.5);
		obj.subtract(15, 10, 5);
		obj.multiply(5, 10);
		obj.multiply(5.5, 10.5);
		obj.multiply(5, 10, 15);
		obj.divide(10, 5);
		obj.divide(10.5, 5.5);
		obj.divide(15, 0);
		
    }
}
