public class BodyMassIndex {
    double pounds;
    double inches;
    double BMI;

    public BodyMassIndex(double inches, double pounds){
        this.pounds = pounds;
        this.inches = inches;
    }

    public double getPounds(){
        return pounds;
    }
    public double getInches(){
        return inches;
    }
    public double calculateBMI(){
        BMI = 703 * pounds / (Math.pow(inches, 2.0));
        return BMI;

    }
    public double getBMI(){
        return BMI;
    }
    public void BMIcategory(){

        System.out.print("BMI Category: ");
        if(BMI < 18.5){
            System.out.print("Underweight\n");
        }
        else if(BMI>=18.5 && BMI<=24.9){
            System.out.print("Normal Weight\n");
        }
        else if(BMI>=25.00 && BMI<=29.9){
            System.out.print("Overweight\n");
        }
        else if(BMI>=30.00) {
            System.out.print("Obesity\n");
        }

    }


}
