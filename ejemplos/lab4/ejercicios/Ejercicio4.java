public class Ejercicio4 {
    public static void main(String[] args) {
        double c = 25;
        
        double f = Conversor.celsiusAFahrenheit(c);
        double k = Conversor.celsiusAKelvin(c);

        System.out.println(c + " °C = " + f + " °F");
        System.out.println(c + " °C = " + k + " °K");
    }
}

class Conversor{
    private Conversor() {} // contructor privado: impide crear objetos

    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 0.9 / 5.0 + 32;
    }

    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }
}
