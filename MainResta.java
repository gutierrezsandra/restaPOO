import java.util.Scanner;

class Resta {
    int a;
    int b;

    int restar() {
        return a - b;
    }
}

public class MainResta {
    public static void main(String[] args) {
        Resta n1 = new Resta();
        Scanner num = new Scanner(System.in);
        System.out.println("Resta de 2 numeros");
        System.out.println("Ingrese un numero:");
        int a = num.nextInt();
        n1.a = a;
        System.out.println("Ingrese segundo numero:");
        int b = num.nextInt();
        n1.b = b;
        System.out.println("El resultado es:");
        System.out.println(n1.restar());
    }
}
