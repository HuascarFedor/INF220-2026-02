class MathUtil {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double promedio(double[] valores) {
        double suma = 0;
        for(double v: valores) {
            suma += v;
        }
        return suma / valores.length;
    }
}

public class Principal {
    public static void main(String[] args) {
        System.out.println(MathUtil.max(7, 3));
        double[] notas = {60, 75, 90};
        System.out.println(MathUtil.promedio(notas));
    }
}
