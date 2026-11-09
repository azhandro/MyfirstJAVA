public class Main {
    public static void main(String[] args) {
        double heightCm = 170;
        double weightKg = 63;

        double heightM = heightCm / 100.0;      // 1.7
        double BMI = weightKg / (heightM * heightM);

        System.out.println("BMI: " + BMI);

        double celsius = 30; //celsius
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Fahrenheit: " + fahrenheit);

        System.out.println("Height: " + heightCm + "Cm" + "|" + "Weight: " + weightKg + "Kg" + "|" + "BMI: " + BMI + "|" + celsius +"C = " + fahrenheit + "F");

    }
}