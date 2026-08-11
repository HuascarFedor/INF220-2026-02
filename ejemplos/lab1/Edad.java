import java.util.Scanner;
public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        if(edad >= 18){
            System.out.println("Es mayor de edad.");
        }
        else{
            System.out.println("Es menor de edad");
        }
        sc.close();
    }
}
