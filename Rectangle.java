public class Rectangle extends shape{
    public double length;
    public double breadth;
    @Override
    public double calculateArea(){
        double area = this.length*this.breadth;
        return area;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = 2*(this.length+this.breadth);
        return perimeter;
    }
    
}
