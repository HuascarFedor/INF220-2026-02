public class Ejemplo2 {
    public static void main(String[] args) {
        String a = "hola";
        String b = "hola";
        String c = new String("hola");

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        System.out.println(a == b);  // true
        System.out.println(a == c);  // false

        System.out.println(a.equals(c)); // true
        System.out.println(a.equalsIgnoreCase("HOLA")); //true
    }
}
