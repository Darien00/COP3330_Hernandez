public class Square extends Shape2D {

    private String name = "square";

    //constructor
    public Square(double length){
        super(length);
    }

    @Override
    public double getArea(){
        return length * length;
    }

    @Override
    public String getName(){
        return name;
    }
}
