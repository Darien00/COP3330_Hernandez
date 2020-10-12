public abstract class Shape {


    protected String name;
    protected double length;
    protected double width;


    //overload constructors
    public Shape(){
        this(0,0);//invoke constructor with 2 arguments
    }
    public Shape(double length){
        this(length,0);
    }


    public Shape(double length, double width){
        if(length < 0){
            throw new IllegalArgumentException("length cant be negative");
        }
        if(width < 0){
            throw new IllegalArgumentException("width cant be negative");
        }
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        if(length < 0){
            throw new IllegalArgumentException("length cant be negative");
        }
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double Width){
        if(width < 0){
            throw new IllegalArgumentException("width cant be negative");
        }
        this.width = length;
    }
    public double getWidth(){
        return width;
    }


    public abstract String getName();
    public abstract double getArea();





}
