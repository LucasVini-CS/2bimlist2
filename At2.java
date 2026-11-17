package org.example;

import java.util.Scanner;


public class At2 {
    public static double calculaIMC (double peso, double altura)
    {
        return peso / (altura * altura);
    }
    public static String classeIMC(double imc)
    {
        if (imc < 18.5)
        {
            return "Abaixo do peso!";
        }
        else if (imc < 25)
        {
            return "Peso normal!";
        }
        else if (imc < 30)
        {
            return "Acima do peso";
        }
        else
        {
            return "OBESO";
        }
    }
    public static void relatorio(double[] peso, double[] altura)
    {
        for (int i = 0; i < 4; i++)
        {
            double imc = calculaIMC(peso[i], altura[i]);
            System.out.printf("Pessoa %d: IMC %.2f - %s%n", (i + 1), imc, classeIMC(imc));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double[] peso = new double[4];
        double[] altura = new double[4];

        for (int i = 0; i < 4; i++)
        {
            System.out.println("Qual peso " + (i + 1) + ":");
            peso[i] = sc.nextDouble();

            System.out.println("Qual altura " + (i + 1) + ":");
            altura[i] = sc.nextDouble();
        }
        relatorio(peso, altura);
    }
}