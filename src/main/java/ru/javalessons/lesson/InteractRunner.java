package ru.javalessons.lesson;

import java.util.Scanner;

/**
 * class for interactive using
 */
public class InteractRunner {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Calculator calc = new Calculator();
        String exit = "no";
        try {
            while (!exit.equals("yes")) {
                System.out.println("Enter first argument: ");
                String first = reader.next();
                System.out.println("Enter second arg: ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result: " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit: yes/no ");
                exit = reader.next();
            }
        }
        finally {
            reader.close();
        }
    }
}
