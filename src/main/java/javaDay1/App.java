package javaDay1;

public class App {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Hello World");
		for (String i : args) {
			System.out.println(i);
			sum += Integer.parseInt(i);
		}
		System.out.println("Sum is " + sum);
	}
}
