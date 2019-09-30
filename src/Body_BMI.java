import java.util.Scanner;

public class Body_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao của bạn , tính  bằng met :");
        double height = sc.nextDouble();
        System.out.println("Nhập cân nặng của bạn , tính bằng kg:");
        double weight = sc.nextDouble();
        double bmi = weight/ Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi <18.5){
            System.out.println("Underweight");
        }else if(bmi<25){
            System.out.println("Normal");
        }else if(bmi <30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
