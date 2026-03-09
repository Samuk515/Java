
    public abstract class circle extends shape{
	public double radius;
	public final double PI =3.1428;
	// note: abstract method must be implemented, while implementing 
	// them 'abstract' keyword is not included
	@Override
	public double calculateArea() {
		double area = PI*this.radius*this.radius;
		return area;
		
	}
	@Override
	public double calculatePerimeter() {
		double perimeter = 2*PI*this.radius;
		return perimeter;
	}

}


