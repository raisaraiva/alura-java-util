import test.Array;
import test.Lambda;
import test.ValidaGuardadorDeContas;
import test.ValidaGuardadorDeReferencias;
import test.Wrappers;

public class Program {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("Wrappers");
        System.out.println("--------------------------------");
        Wrappers.test();
        System.out.println("--------------------------------");
        System.out.println("Array");
        System.out.println("--------------------------------");
        Array.test();
        System.out.println("--------------------------------");
        System.out.println("Lambda");
        System.out.println("--------------------------------");
        Lambda.test();
        System.out.println("--------------------------------");
        System.out.println("ValidaGuardadorDeContas");
        System.out.println("--------------------------------");
        ValidaGuardadorDeContas.test();
        System.out.println("--------------------------------");
        System.out.println("ValidaGuardadorDeReferencias");
        System.out.println("--------------------------------");
        ValidaGuardadorDeReferencias.test();
    }
}
