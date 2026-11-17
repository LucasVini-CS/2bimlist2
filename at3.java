package org.example;

import java.util.Scanner;

public class at3 {
    public static boolean primo(int numero)
    {
        if(numero < 2)
        {
            return false;
        }
        for (int i = 2; i < numero; i++)
        {
            if (numero % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static int contagemPrimos(int[] n)
    {
        int quantia = 0;

        for (int i = 0; i < n.length; i++)
        {
            if (primo(n[i]))
            {
                quantia++;
            }
        }
        return quantia;
    }
    public static void amostrarPrimos(int[] n)
    {
        System.out.println("Números primos encontrados: ");

        for (int i = 0; i < n.length; i++)
        {
            if (primo(n[i]))
            {
                System.out.println(n[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[8];

        for (int i = 0; i < 8; i++)
        {
            System.out.println("Diga o número" + (i + 1) + ":");
            numero[i] = sc.nextInt();
        }
        amostrarPrimos(numero);
        System.out.println("Primos encontrados " + contagemPrimos(numero));
    }
}
