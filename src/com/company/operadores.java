package com.company;

public class operadores {
    public static void main(String[] args) {
        //Operadores
        System.out.println("Operadores Aritmeticos");
        int a = 1 + 2;
        int b = a * 4;
        int c = b/2;
        int d = c -a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d= " + d);
        System.out.println("e = " + e);

        System.out.println("\nOperador Modulo (residuo):");
        System.out.println("x mod 10 = " + a % 2);

        System.out.println("\nOperador Compuesto");
        //a = a + n
        a +=2;
        b -=4;
        c *=a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\nOperador de incremento");
        // a= a+ 1
        a++;
        System.out.println("a = " + a);
        int x = 1, z =1;
        System.out.println("x = "+x++); // imprime 1.
        System.out.println("x = "+x); //imprime 2
        //preincremento/decremento
        System.out.println("z = "+ ++z); // imprime 2.
        System.out.println("z = " +z);   // imprime 2.
        //se incrementa antes asigna el valor
        c =++a;
        //asigna el valor de b y luego se incrementa
        d =b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        // a-- , --a
        System.out.println("a = " + --a);

        System.out.println("\nOperador racional");
        // a es menor que b
        boolean res = a < b;
        System.out.println("res =" + res);

        System.out.println("\nOperador Ternario o condicion (x < y)? T : F;");
        int min = (a < b) ? a:b;
        System.out.println("Cual es el valor del menor " + min);

        System.out.println("\nOperador de asignacion");
        int i,j,k;
        i = k = j = 100;
        System.out.println("i = " + i);
        System.out.println("k = " + k);
        System.out.println("j = " + j);

        //PRECEDENCIA DE OPERADORES
        System.out.println("Primerl ejemplo de precendencia de operadores");
        x =5;
        int y = 10;
        z = ++x * y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z =" + z);

        System.out.println("Ejemplo de evalucion");
        System.out.println("4 + 5 * 6 / 3 = " + (4 + 5 * 6 / 3 ));
        System.out.println("(4 + 5 ) * (6 / 3) = "+ ((4 +5 ) * (6 / 3)));

        System.out.println("otro ejemplo de evalucion");
        System.out.println(1 + 2 -3 * 4 / 5);
        System.out.println(1 + 2 - (3 *( 4 / 5)));

        System.out.println("\nOtro ejemplo");
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = "  + (1+2));

        System.out.println("\nOtro ejemplo");
        System.out.println("abc" + 1 + 2);
        System.out.println(1 + 2 + "abc");
    }
}
