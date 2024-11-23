import java.util.Scanner;
import java.time.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Podaj promien koła: ");
        double radius = scanner.nextDouble();

        if (radius > 0){
            double area = ExerciseSix.calculateCircleArea(radius);
            double circumference = ExerciseSix.calculateCircumference(radius);
            double volume = ExerciseSix.calculateCircumference(radius);

            System.out.println("Pole koła wynosi: " + String.format("%.2f", area) );
            System.out.println("Objętość wynosi: " + String.format("%.2f", volume));
            System.out.println("Obwód wynosi: "+ String.format("%.2f", circumference));
        }else{
            System.out.println("Wprowadź poprawną liczbę");
        }

        System.out.println("Podaj dzień, miesiąc i rok:");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();




    }
}