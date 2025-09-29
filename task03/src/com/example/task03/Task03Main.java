package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexDigit complexDigit1 =  new ComplexDigit(1,2);
        ComplexDigit complexDigit2 =  new ComplexDigit(2,3);

        ComplexDigit sum =  complexDigit1.add(complexDigit2);
        ComplexDigit mul =  complexDigit1.multiply(complexDigit2);

        System.out.println(complexDigit1);
        System.out.println(complexDigit2);
        System.out.println(sum);
        System.out.println(mul);


    }
}
