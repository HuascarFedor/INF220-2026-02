public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("15905678", "Ana Quispe",19,"1500123","Ingeniería Informática",2);
        System.out.println(e.presentarse());
        System.out.println(e.fichaAcademica());
        e.avanzarSemestre();
        System.out.println(e.fichaAcademica());
        System.out.println();
        
        Docente d = new Docente("55064523","Huascar Gonzales", 35, "12345", "Informática", 30);
        System.out.println(d.presentarse());
    }
}
