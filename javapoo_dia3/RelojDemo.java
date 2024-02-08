package javapoo_dia3;

import java.util.Scanner;

public class RelojDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESAR SEGUNDOS: ");
        int segundos = sc.nextInt();
        reloj r1 = new reloj(segundos);

        System.out.println("HORA ACTUAL");
        System.out.println(r1.toString());
        System.out.println("--AUMENTANDO EL TICK--");
        for (int i = 0; i <=10 ; i++) {
            r1.tick();
            System.out.println(r1.toString());
            if (r1.getSegundos() >59) {
                r1.setSegundos(0);
            }
        }

        System.out.println("---RESTANDO EL RELOJ");
        reloj r2 = new reloj(22,39,4);

        r1.restaReloj(r2);
    }
}
