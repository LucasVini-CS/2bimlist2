package org.example;

import java.util.Scanner;

public class at6 {

    public static int contarVogais(String texto)
    {
        int quantidade = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++)
        {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            {
                quantidade++;
            }
        }
        return quantidade;
    }
    public static void exibirContagem(String[] frases)
    {
        int maiorQuantidade = -1;

        String fraseMaior = "";

        for (int i = 0; i < frases.length; i++)
        {
            int quantidade = contarVogais(frases[i]);
            System.out.println(frases[i] + " - " + quantidade + " vogais ");

            if (quantidade > maiorQuantidade)
            {
                maiorQuantidade = quantidade;
                fraseMaior = frases[i];
            }
        }
        System.out.println("Frase com mais vogais: ");
        System.out.println(fraseMaior);
        System.out.println("quantidade " + maiorQuantidade);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++)
        {
            System.out.println("Diga a frase "+ (i + 1) + ":");
            frases[i] = sc.nextLine().trim();
        }
        exibirContagem(frases);
    }
}
