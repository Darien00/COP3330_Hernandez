public class Pyramid extends Shape3D{

    private double length, width, height;
    private String name = "Pyramid";


    public Pyramid(double length, double width, double height){

        this.length = length;
        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea(){
        return length * width + ((0.5 * width)* Math.sqrt(4*Math.pow(height,2)+ Math.pow(length,2)))+((0.5 * length)* Math.sqrt(4*Math.pow(height,2)+Math.pow(width,2)));
    }

    @Override
    public double getVolume(){
        return (length * width * height)/3;
    }

    @Override
    public String getName(){
        return name;
    }
}
