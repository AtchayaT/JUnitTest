package com.techtalk.JUnit;

public class calculator {

    private final double value;

    calculator(double value){
        this.value=value;
    }

    public static boolean compare(int num1,int num2) {
        return num1 < num2;
    }
    public static int summation(int num1, int num2){
        return num1+num2;

    }

    public String getMessage() {
        return "Junit is working fine";
    }

        @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(!(obj instanceof calculator)){
            return false;
        }
        calculator newValue=(calculator) obj;
        return this.value== newValue.value;

    }
}
