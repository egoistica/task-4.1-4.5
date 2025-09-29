package com.example.task03;

public class ComplexDigit {
    //z=a+bi   (a - действительная b - мнимая часть)

    private double real;
    private double imag;

    ComplexDigit(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    ComplexDigit add(ComplexDigit complexDigit){
        //(a+bi)+(c+di)=(a+c)+(b+d)i
        double newReal= (this.real + complexDigit.real);
        double newImag = (this.imag + complexDigit.imag);
        return new ComplexDigit(newReal,newImag);
    }
    ComplexDigit multiply(ComplexDigit complexDigit){
        //(a+bi)⋅(c+di)=(ac−bd)+(ad+bc)i
        double newReal =  (this.real * complexDigit.real) - (this.imag * complexDigit.imag);
        double newImag = (this.real * complexDigit.imag)+(this.imag * complexDigit.real);
        return new ComplexDigit(newReal,newImag);
    }


    public String toString() {
        return String.format("%.2f + %.2fi",real,imag);
    }
}


