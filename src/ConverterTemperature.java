import java.util.Scanner;

public class ConverterTemperature {
    // Метод для конвертації з градусів Цельсія в Кельвіни
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Метод для конвертації з градусів Цельсія в Фаренгейти
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть температуру в градусах Цельсія: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsiusToKelvin(celsius);
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " градусів Цельсія = " + kelvin + " Кельвінів");
        System.out.println(celsius + " градусів Цельсія = " + fahrenheit + " градусів Фаренгейта");

        // Закриваємо сканер після використання
        scanner.close();
    }
}
