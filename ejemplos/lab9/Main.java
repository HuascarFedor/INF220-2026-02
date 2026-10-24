public class Main {
    public static void main(String[] args) {
        System.out.println("Creando t1 con super(marca) explícito:");
        Telefono t1 = new Telefono("Samsung", "71234567");

        System.out.println("\nCreando t2 con super() implícita:");
        Telefono t2 = new Telefono("71234567");

        System.out.println("\n=== Uso de los obejtos ===");
        t1.llamar("72000000", 2);
        t1.encender();
        t1.llamar("72000000", 4);
        t1.llamar("60011122", 16);
        System.out.println(t1.estado());
        System.out.println(t2.estado());
    }
}
