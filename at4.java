package org.example;

import java.util.Scanner;

public class at4 {

    public static void ordenar(int[] v)
    {
        for (int i = 0; i < v.length - 1;i++)
        {
            for (int j = 0; j < v.length - 1 - i; j++)
            {
                if (v[j] > v[j + 1])
                {
                    int auxilio = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = auxilio;

                }
            }
        }
    }
    public static boolean estaOrdenado(int[] v)
    {
        for (int i = 0; i < v.length - 1; i++)
        {
            if (v[i] > v[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    public static void mostrar(int[] v)
    {
        for (int i = 0; i < v.length; i++)
        {
            System.out.print(v[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[6];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Diga um número " + (i + 1) + " ");
            numero[i] = sc.nextInt();
        }
        System.out.println("Antes de ordenar");
        mostrar(numero);
        System.out.println("esta em ordem? " + estaOrdenado(numero));

        ordenar(numero);
        System.out.println();

        System.out.println("Depois de ordenar");
        mostrar(numero);
        System.out.println("Esta em ordem? " + estaOrdenado(numero));
    }
}
