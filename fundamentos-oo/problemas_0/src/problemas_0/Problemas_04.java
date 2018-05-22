/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas_0;

import java.util.Scanner;

/**
 *
 * @author Danie
 */
public class Problemas_04 {

    public static void main(String[] args) {
        validarCadastro();
    }

    public static void validarCadastro() {
        Scanner scanner = new Scanner(System.in);

        String nome, telefone;

        System.out.println("Insira o nome: ");
        nome = scanner.nextLine();

        System.out.println("Insira o telefone: ");
        telefone = scanner.nextLine();

        if (nome == null) {
            System.out.println("Nome vazio!");
            return;
        }

        if (telefone == null) {
            System.out.println("Número vazio!");
            return;
        }

        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);

            if (!Character.isAlphabetic(c)) {
                System.out.println("O nome deve possuir apenas letras!");
                return;
            }
        }

        System.out.println("O nome \"" + nome + "\" é válido");

        for (int i = 0; i < telefone.length(); i++) {
            char c = telefone.charAt(i);

            if (!Character.isDigit(c)) {
                System.out.println("O telefone deve possuir apenas números! Você inseriu: " + c);
                return;
            }
        }

        System.out.println("O número \"" + telefone + "\" é válido");
    }
}
