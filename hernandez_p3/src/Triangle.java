public class Triangle extends Shape2D{

    private double base;
    private double height;
    private String name = "Triangle";

    public Triangle(double base, double height){
        if(base < 0){
            throw new IllegalArgumentException("length cant be negative");
        }
        if(height < 0){
            throw new IllegalArgumentException("width cant be negative");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return (base * height) / 2;
    }

    @Override
    public String getName(){
        return name;
    }

}
