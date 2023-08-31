package org.example;

import org.example.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro ");
        int parametroDois = terminal.nextInt();

        var contador = new Contador();

        try {
            //chamando o método contendo a lógica de contagem
            contador.contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

}