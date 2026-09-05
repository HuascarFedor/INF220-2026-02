public class Ejemplo3 {
    public static void main(String[] args) {
        String frase = "Estructuras de datos";
        int vocales = 0;
        String v = "aeiouAEIOU";

        for(int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (v.indexOf(c) >= 0) {
                System.out.println(c);
                vocales ++;
            }
        }

        System.out.println("Cantidad de vocales: " + vocales);
    }
}
