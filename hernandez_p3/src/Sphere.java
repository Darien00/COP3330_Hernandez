public class Sphere extends Shape3D{

    private double radius;
    private String name = "Sphere";

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 4.0 * Math.PI * Math.pow(radius,2.0);

    }

    @Override
    public double getVolume(){
        return (4.0/3.0)* Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String getName(){
        return name;
    }

}
