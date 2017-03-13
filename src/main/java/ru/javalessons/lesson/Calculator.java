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
