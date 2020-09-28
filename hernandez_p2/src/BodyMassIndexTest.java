import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {
    @Test
    public void testBodyMassIndexParamConstructor(){
        BodyMassIndex bmi = new BodyMassIndex(61.52, 175);
        assertEquals(61.52, bmi.getInches());
        assertEquals(175, bmi.getPounds());

    }
    @Test
    public void testGetInches(){
        BodyMassIndex bmi = new BodyMassIndex(61.52, 175);
        assertEquals(61.52, bmi.getInches());
    }
    @Test
    public void testGetWeight(){
        BodyMassIndex bmi = new BodyMassIndex(61.52, 175);
        assertEquals(175, bmi.getPounds());
    }
    @Test
    public void testGetBMI(){
        BodyMassIndex bmi = new BodyMassIndex(61.52, 175);
        assertEquals(32.50578961074538, bmi.getBMI());
    }

    @Test
    public void testCalculateBMI(){
        BodyMassIndex bmi = new BodyMassIndex(61.52, 175);
        assertEquals( 32.50578961074538, bmi.calculateBMI());
    }

    @Test
    public void testBMICategory(){
        BodyMassIndex bmi = new BodyMassIndex(61.52, 175);
        bmi.BMIcategory();
    }

}