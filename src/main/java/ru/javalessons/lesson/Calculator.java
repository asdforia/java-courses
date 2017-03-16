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
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result -= params[i];
        }
    }

    /**
     * for multiplication
     * @param params args for multiplication
     */
    public void mul(int ... params){
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result *= params[i];
        }
    }

    /**
     * for division
     * @param params args for division
     */
    public void div(int ... params){
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result /= params[i];
        }
    }

    /**
     * for Exponentiation
     * @param params args for Exponentiation
     */
    public void exp(int ... params){
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result = (int) Math.pow(this.result, params[i]);
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
