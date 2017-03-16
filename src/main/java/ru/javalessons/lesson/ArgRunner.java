package ru.javalessons.lesson;

/**
 * for using from console arguments
 */
public class ArgRunner {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        String op = args[1];
        if (op.equals("+"))
            calc.add(Integer.valueOf(args[0]), Integer.valueOf(args[2]));
        else if(op.equals("-"))
            calc.sub(Integer.valueOf(args[0]), Integer.valueOf(args[2]));
        else if(op.equals("x"))
            calc.mul(Integer.valueOf(args[0]), Integer.valueOf(args[2]));
        else if(op.equals("/"))
            calc.div(Integer.valueOf(args[0]), Integer.valueOf(args[2]));
        else if(op.equals("^"))
            calc.exp(Integer.valueOf(args[0]), Integer.valueOf(args[2]));
        System.out.println("Result: " + calc.getResult());
    }
}
