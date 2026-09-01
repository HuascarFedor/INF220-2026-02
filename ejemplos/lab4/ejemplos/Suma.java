public class Suma {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Suma s = new Suma();
        int s1 = s.sumar(2, 3);
        System.out.println(s1);
        double s2 = s.sumar(4.5, 6.0);
        System.out.println(s2);
        int s3 = s.sumar(2, 3, 6);        
        System.out.println(s3);
    }
}
