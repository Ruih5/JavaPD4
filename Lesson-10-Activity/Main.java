
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
	
    double Gpa = gpa(95);
    System.out.println("Calculated GPA: " + newGpa);

    int result = isGraduating("Senior", 45);
    if (result) {
        System.out.println("Student is Graduating");
    } else {
        System.out.println("Student is NOT Graduating");
     }

    System.out.println("BMI Status: " + BMI(150, 65));

    System.out.println("Shipping cost: $" + shippingCost(30));

    System.out.println("Is blue or violet: " + blueOrViolet(710));
    }

    double gpa(double gpaValue) {
        if (gpaValue > 90) {
            return gpaValue * 1.1;
        } else {
            return gpaValue;
        }
    }

     
    int isGraduating(String gradeLevel, int credits) {
        if (gradeLevel.equals("Senior") && credits >= 44) {
            return true;
        } else {
            return false;
        }
    }

    String BMI(double weight, double height) {
        double bmi = (weight / (height * height)) * 703;
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    double shippingCost(double weight) {
        if (weight <= 10) {
            return 0.00;
        } else if (weight <= 15) {
            return 5.00;
        } else if (weight <= 25) {
            return 10.00;
        } else {
            return 10.00 + (weight - 25) * 0.02;
        }
    } 

    int blueOrViolet(double frequency) {
        if ((frequency >= 600 && frequency <= 670) || (frequency >= 700 && frequency <= 750)) {
            return true;
        } else {
            return false;
        }
    } 
}