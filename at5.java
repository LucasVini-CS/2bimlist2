package org.example;

import java.util.Scanner;

public class at5 {

    public static String paraBinario(int n)
    {
        if (n == 0)
        {
            return "0";
        }

        String binario = "";

        while (n > 0)
        {
            int resto = n % 2;

            binario = resto + binario;

            n =n / 2;
        }
        return binario;
    }
    public static void mostrarTela(int[] v)
    {
        for (int i = 0; i < v.length; i++)
        {
            System.out.println(v[i] + " = " + paraBinario(v[i]));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[5];

        for (int i = 0; i < numero.length; i++)
        {
            System.out.println("Digite um numero inteiro: ");
            numero[i] = sc.nextInt();

            while (numero[i] < 0)
            {
                System.out.println("NUMERO INVALIDO! Não pode ser negativo ");
                numero[i] = sc.nextInt();
            }
        }
        System.out.println("Conversão para binário");
        mostrarTela(numero);
    }
}
