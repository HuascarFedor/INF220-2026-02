public class Principal {
    public static void main(String[] args){
        Estudiante e1 = new Estudiante();
        e1.nombre = "Ana";
        e1.edad = 20;
        e1.promedio = 78.5;

        e1.mostrarDatos();

        if(e1.aprobo()) {
            System.out.print("El estudiante aprobó.");
        } else {
            System.out.print("El estudiante reprobó.");
        }
    }
}
