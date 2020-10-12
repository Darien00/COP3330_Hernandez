public abstract class Shape2D extends Shape {

    public Shape2D(){
        super();
    }
    public Shape2D(double length){
        super(length);
    }
    public Shape2D(double length, double width){
        super(length, width);
    }


    public abstract double getArea();

    public abstract String getName();
}
