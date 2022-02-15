public class Q1BMI {
    private double weight;
    private double height;
    private double bmiCal;

    public static final double POUNDTOKG = 0.45359237;
    public static final double INCHTOMETERS = 0.0254;

    public Q1BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double computeBMI() {
        bmiCal = (this.weight*POUNDTOKG) / Math.pow(this.height*INCHTOMETERS,2);
        return bmiCal;
    }

    public void computeInterpretation(){
        if (bmiCal < 18.5){
            System.out.println("Underweight");
        }
        else if (bmiCal >= 18.5 && bmiCal < 25.0){
            System.out.println("Normal");
        }
        else if (bmiCal >= 25.0 && bmiCal < 30.0){
            System.out.println("Overweight");
        }
        else if (bmiCal >= 30.0){
            System.out.println("Obese");
        }        
        else{
            System.out.println("Overflow");
        }
    }

}
 