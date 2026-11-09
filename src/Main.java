import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students;

        System.out.print("How many students?: ");
        students = input.nextInt();

        if (students <= 0){
            System.out.println("No Students to process.");
        }
        else {
            for (int i = 1; i <= students; i++) {
                System.out.println("Student #" + i + ":");
                double heightCm;
                double weightKg;
                String category;


                System.out.print("Enter height in cm: ");
                heightCm = input.nextDouble();

                System.out.print("Enter weight in kg: ");
                weightKg = input.nextDouble();

                double heightM = heightCm / 100.0;      // 1.7
                double bmi = weightKg / (heightM * heightM);

                if (bmi < 18.5) {
                    category = "Underweight";
                } else if (bmi < 25) {
                    category = "Normal";
                } else if (bmi < 30) {
                    category = "Overweight";
                } else {
                    category = "Obese";
                }

                System.out.printf("BMI: %.1f — %s%n", bmi, category);

                if (category.equals("Normal")) {
                    System.out.println("Keep it up! 💪");
                } else {
                    System.out.println("Talk to a nutritionist!");
                }
                System.out.println(" ");
            }
        }
        System.out.println("Processed " + students + " students.");
    }
}