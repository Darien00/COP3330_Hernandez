import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        ArrayList <BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while(moreInput()){
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    public static boolean moreInput(){
        Scanner input = new Scanner(System.in);
        String choice;
        System.out.print("\n Enter Y: To input Data N: To Exit:");
        choice = input.next();
        if(choice.equals("Y") || choice.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }


    public static double getUserHeight(){
        Scanner input = new Scanner(System.in);
        double height = 0;
        do{
            System.out.print("Your Height(in inches):");//prompt
            height = input.nextDouble();
            if(height < 0.00) {
                System.out.print("please enter valid height\n");
            }

        }while(height < 0.00);
        return height;
    }

    public static double getUserWeight(){
        Scanner input = new Scanner(System.in);
        double weight =0;
        do{
            System.out.print("Your Weight(in pounds):");
            weight = input.nextDouble();
            if(weight < 0.00){
                System.out.print("please enter a valid weight\n");

            }
        }while(weight < 0.00);

        return weight;
    }
    public static void displayBmiInfo(BodyMassIndex BMI){
        System.out.printf("Height:%f%n", BMI.getInches());
        System.out.printf("Weight:%f%n", BMI.getPounds());
        System.out.printf("Your BMI:%f%n", BMI.calculateBMI());
        BMI.BMIcategory();
    }

    public static void displayBmiStatistics( ArrayList<BodyMassIndex>bmiData){

        double averageBMI = 0;
        double sumBMI =0;
        int counter =0;
        System.out.println("BMI categories");
        System.out.printf("%s%n%s%n%s%n%s%n%n","Underweight < 18.5", "Normal weight = 18.5–24.9", "Overweight = 25–29.9 ","Obesity >= 30");
        for(BodyMassIndex userBMI: bmiData){
            System.out.printf("user %d: BMI:%f ", counter + 1, userBMI.getBMI());
            userBMI.BMIcategory();

            sumBMI += userBMI.getBMI();
            counter++;

        }
        averageBMI = sumBMI / (double)counter;
        System.out.printf("%n%nAverage BMI:%.2f", averageBMI);

    }
}

