package ru.javalessons.lesson;

public class Calculate
{
	public static void main(String[] args)
	{
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		Calculator calculator = new Calculator();
		System.out.println("Sum " + calculator.sum(first, second));
	}
}