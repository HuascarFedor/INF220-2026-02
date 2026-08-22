public class Principal {
     public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", 25, 75);
        System.out.println("Estudiante: " + e1.getNombre());
        System.out.println("Edad: " + e1.getEdad());
        System.out.println("Promedio: " + e1.getPromedio());

        Estudiante e2 = new Estudiante();
        e2.setNombre("Monica");
        e2.setEdad(23);
        e2.setPromedio(100.0);
        System.out.println("Estudiante: " + e2.getNombre());
        System.out.println("Edad: " + e2.getEdad());
        System.out.println("Promedio: " + e2.getPromedio());

        Estudiante e3 = new Estudiante("Maria"); 
        e3.setEdad(19);
        System.out.println("Estudiante: " + e3.getNombre());
        System.out.println("Edad: " + e3.getEdad());
        System.out.println("Promedio: " + e3.getPromedio());
     }
} 