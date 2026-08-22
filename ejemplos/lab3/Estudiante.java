public class Estudiante {
    // Modificadores de acceso
    // private: Solo es accesible dentro de la propia clase. Es lo habitual para los 
    //          atributos.
    // public: Es accesible desde cualquier clase. Se usa para métodos que forman la 
    //          interfaz del objeto.
    // protected: Accesible dentro del paquete y por las clases hijas (se verá con
    //             la herencia)
    
    private String nombre;
    private int edad;
    private double promedio;

    // Los getters y setters son metodos que nos brindan accedo controlado a los
    // atributos privados.
    // getters: devuelve valores
    // setters: modifica valores

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { 
        if(edad >= 0 && edad<=120) {
            this.edad = edad; 
        } else {
            System.out.println("Edad inválida, se ignora el valor.");
        }
    }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { 
        if(promedio >= 0 && promedio <=100) {
            this.promedio = promedio; 
        } else {
            System.out.println("Promedio fuera del rango [0-100].");
        }
    }

    // Constructor: Es un método publico que permite inicializar los valores de 
    //              los atributos. Debe establecerse con el mismo nombre de la clase.

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Sobrecarga de constructores: Ofrecer varias formas de crear un objeto

    public Estudiante() {
        // objeto vacio
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
}
