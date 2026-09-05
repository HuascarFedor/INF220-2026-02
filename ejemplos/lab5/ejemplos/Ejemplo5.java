public class Ejemplo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append("mundo");
        sb.insert(0, ">> ");

        System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());
    }
}
