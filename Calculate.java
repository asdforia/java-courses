public class Calculate {
	public static void main(String[] args)
	{
		System.out.println("Calculate...");
		float first = Float.valueOf(args[0]);
		float second = Float.valueOf(args[1]);
		double multiply = first * second;
		System.out.println("Multiply " + first + " and " + second + " is " + multiply);
	}
}