public class Main {
    public static void main(String[] args) {
        ColaEnlazada<Integer> tickets = new ColaEnlazada<>();
        tickets.encolar(20);
        tickets.encolar(35);
        tickets.encolar(23);
        tickets.encolar(78);
        
        System.out.println(tickets.toString());

        System.out.println(tickets.desencolar());
        System.out.println(tickets.desencolar());
        System.out.println(tickets.desencolar());
        System.out.println(tickets.desencolar());
        System.out.println(tickets.desencolar());
    }
}
