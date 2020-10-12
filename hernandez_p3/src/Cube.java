public class Cube extends Shape3D {


    // sa = 6a^2 a= side
    //v = a^3
    private double side;
    private String name = "Cube";

    public Cube(double side){
        if(side < 0){
            throw new IllegalArgumentException("Negative side");
        }
        this.side = side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea(){
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double getVolume(){
        return Math.pow(side, 3);
    }
}
