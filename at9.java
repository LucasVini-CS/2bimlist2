package org.example;

import java.util.Scanner;

public class at9 {

    public static long potencia(int base, int expoente)
    {
        if (expoente == 0)
        {
            return 1;
        }
        return base * potencia(base, (expoente - 1));
    }
    public static void exibirPotencia(int[] base, int expoente)
    {
        for (int i = 0; i < base.length; i++)
        {
            System.out.println(base[i] + "^" + expoente + " = " + potencia(base[i], expoente));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int expoente;
        int[] base = new int[5];

        System.out.println("Qual o expoente: ");
        expoente = sc.nextInt();

        while (expoente < 0)
        {
            System.out.println("Diga um expoente que não seja negativo ");
            expoente = sc.nextInt();
        }
        for (int i = 0; i < base.length; i++)
        {
            System.out.println("Diga a base " + (i + 1) + ":");
            base[i] = sc.nextInt();
        }
        exibirPotencia(base, expoente);
    }
}