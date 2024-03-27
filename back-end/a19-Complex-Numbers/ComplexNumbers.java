public class ComplexNumbers{
    private double real;
    private double imaginary;
    public ComplexNumbers(){
        this.real=2;
        this.imaginary=3;
    }
    public ComplexNumbers(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void setReal(double real){
        this.real=real;
    }
    public void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public ComplexNumbers add(ComplexNumbers obj){
        return new ComplexNumbers(this.real+obj.real,this.imaginary+obj.imaginary);
    }
    public ComplexNumbers subtract(ComplexNumbers obj){
        return new ComplexNumbers(this.real-obj.real,this.imaginary-obj.imaginary);
    }
    public ComplexNumbers multiply(ComplexNumbers obj){
        double realPart = (this.real * obj.real) - (this.imaginary * obj.imaginary);
        double imaginaryPart = (this.real * obj.imaginary) + (this.imaginary * obj.real);
        return new ComplexNumbers(realPart, imaginaryPart);
    }
    public ComplexNumbers divide(ComplexNumbers obj){
        double realPart = ((this.real * obj.real) + (this.imaginary * obj.imaginary))/((obj.real*obj.real)+(obj.imaginary*obj.imaginary));
        double imaginaryPart = ((this.imaginary * obj.real)-(this.real * obj.imaginary))/((obj.real*obj.real)+(obj.imaginary*obj.imaginary));
        return new ComplexNumbers(realPart, imaginaryPart);
    }
    public String toString(){
        if (this.imaginary<0){
            return this.real + "" + this.imaginary + "i";
        }
        return this.real + "+" + this.imaginary + "i";
    }
    public static void main(String[] args){
        ComplexNumbers val = new ComplexNumbers(-3,7);
        ComplexNumbers nextVal = new ComplexNumbers(2,5);
        System.out.println("multiplication: " + val.multiply(nextVal));
        System.out.println("addition: " + val.add(nextVal));
        System.out.println("subtraction: " + val.subtract(nextVal));
        System.out.println("division: " + val.divide(nextVal));
    }
}