public class Circle extends Shape2D {

    private double radius;
    private String name = "Circle";

    public Circle(double radius){
        if(radius < 0){
            throw new IllegalArgumentException("Negative radius");
        }
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getName(){
        return name;
    }
}
