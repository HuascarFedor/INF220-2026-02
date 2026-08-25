public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        setCelsius(celsius);
    }

    // --- Getter ---
    public double getCelsius() {
        return celsius;
    }
    
    // --- Setter ---
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    
    // Conversion a Fahrenheit
    public double getFahrenheit() {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    // Conversion a Kelvin
    public double getKelvin() {
        return celsius + 273.15;
    }

    // Demostracion rapida
    public static void main(String[] args) {
        Temperatura t = new Temperatura(25);
        System.out.println("Celsius: " + t.getCelsius());
        System.out.println("Fahrenheit: " + t.getFahrenheit());
        System.out.println("Kelvin: " + t.getKelvin());
    }
}
