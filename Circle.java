public class Circle extends Shape implements Area{

    private double radius;

    public Circle(double radius, String name){
	super(name);
	this.radius = radius;
    }

    public double getRadius(){
	return radius;
    }

    public String toString(){
	return "HELLO!";
    }

    public double getArea(){
	return Math.pow(radius,2)*Math.PI;
    }
}