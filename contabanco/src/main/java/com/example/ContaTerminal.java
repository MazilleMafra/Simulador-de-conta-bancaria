package com.example;

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, primeiroNomeCliente, segundoNomeCliente;
        double saldo;

        System.out.println("=========================================================");
        System.out.println("Olá! Seja muito bem vindo, vejo que você é novo por aqui.");
        System.out.println("=========================================================");
        System.out.println("Então para começar, vamos realizar seu cadastro");
        System.out.println("=========================================================");

        System.out.println("Para começar, digite sua agência:");
        agencia = sc.nextLine();
        System.out.println("---------------------------------");

        System.out.println("Ótimo, agora digite o número da sua agência:");
        numero = sc.nextInt();
        System.out.println("--------------------------------------------");

        System.out.println("Estamos quase lá, me informe seu primeiro nome:");
        primeiroNomeCliente =sc.next();
        System.out.println("-----------------------------------------------");
        System.err.println("Agora seu segundo nome");
        segundoNomeCliente = sc.next();
        System.out.println("-----------------------------------------------");

        System.out.println("E para fianlizar, o seu saldo na conta:");
        saldo = sc.nextDouble();
        System.out.println("---------------------------------------");

        String nomeCliente = nomeCliente(primeiroNomeCliente, segundoNomeCliente); 

       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
        sc.close();
    }
    public static String nomeCliente(String primeiroNomeCliente , String segundoNomeCliente){
        return primeiroNomeCliente.concat(" ").concat(segundoNomeCliente);
    }
 
}