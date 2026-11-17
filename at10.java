package org.example;

import java.util.Scanner;

public class at10 {

    public static int fibonacci(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        if (n == 1)
        {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int somar(int[] v)
    {
        int total = 0;

        for (int i = 0; i < v.length; i++)
        {
            total += v[i];
        }
        return total;
    }
    public static void exibir(int[] v)
    {
        for (int i = 0; i < v.length; i++)
        {
            System.out.println(v[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma quantia de números 1 e 30");
        int n = sc.nextInt();

        if (n < 1 || n > 30)
        {
            System.out.println("QUANTIDADE INVALIDA!");
        }
        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = fibonacci(i);
        }
        System.out.println("Sequencia de Fibonacci ");
        exibir(numeros);

        System.out.println("Soma " + somar(numeros));
    }
}
