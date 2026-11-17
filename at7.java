package org.example;

import java.util.Scanner;

public class at7 {

    public static String gerarIniciais(String nomeCompleto)
    {
        String[] partes =nomeCompleto.trim().split("\\s+");
        String iniciais = "";

        for (int i = 0; i < partes.length; i++)
        {
            iniciais += partes[i].toUpperCase().charAt(0);

            if (i < partes.length - 1)
            {
                iniciais += ".";
            }
        }
        return iniciais;
    }
    public static void exibirChamada(String[] nomes)
    {
        for (int i = 0; i < nomes.length; i++)
        {
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + "). ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];
        for (int i = 0; i < nomes.length; i++)
        {
            System.out.println("Diga o nome do aluno " + (i + 1) + ":");
            nomes[i] = sc.nextLine().trim();
        }
        exibirChamada(nomes);
    }

}
