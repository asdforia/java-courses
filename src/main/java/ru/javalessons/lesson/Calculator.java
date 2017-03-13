package ru.javalessons.lesson;

/**
 * this class is calculator
 */
public class Calculator {
    /**
     * temporary result store
     */
    private int result;

    /**
     * for addition of arguments
     * @param params arguments for addition
     */
    public void add (int ... params)
    {
        for (int param : params) {
            this.result += param;
        }
    }

    /**
     * for subtraction
     * @param params args for subtraction
     */
    public void sub(int ... params){
        for (int param : params) {
            this.result -= param;
        }
    }

    /**
     * for multiplication
     * @param params args for multiplication
     */
    public void mul(int ... params){
        for (int param : params) {
            this.result *= param;
        }
    }

    /**
     * for division
     * @param params args for division
     */
    public void div(int ... params){
        for (int param : params) {
            this.result /= param;
        }
    }

    /**
     * for Exponentiation
     * @param params args for Exponentiation
     */
    public void exp(Integer ... params){
        for (Integer param : params) {
            this.result ^= param;
        }
    }

    /**
     * get result
     * @return result of calculation
     */
    public int getResult(){
        return this.result;
    }

    /**
     * clean result
     */
    public void cleanResult(){
        this.result = 0;
    }
}
