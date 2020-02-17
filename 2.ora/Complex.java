package trig;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double abs(){
        return Math.sqrt(re * re + im * im);
    }

    public Complex mult(Complex c){
        return new Complex(re*c.re - im*c.im, re*c.im + im*c.re);
    }

    public double getRe(){
        return re;
    }

    public void setRe(double re){
        this.re = re;
    }

    public double getIm(){
        return im;
    }

    public void setIm(double im){
        this.im = im;
    }
}