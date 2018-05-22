/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas_0;

/**
 *
 * @author Danie
 */
public class Problemas_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        maiorMenor(20, 100, 5);
        umA20();
        quadrados();
        impares();
        somatoria();
        fatorial();
        bhaskara(1, 12, -13);
    }

    private static void maiorMenor(int valor1, int valor2, int valor3) {
        int maiorValor = valor1;
        int menorValor = valor1;

        if (valor1 > valor2) {
            maiorValor = valor1;
        }

        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }

        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }

        if (valor1 < valor2) {
            menorValor = valor1;
        }

        if (valor2 < menorValor) {
            menorValor = valor2;
        }

        if (valor3 < menorValor) {
            menorValor = valor3;
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }

    private static void umA20() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Valor: " + i);
        }
    }

    private static void quadrados() {
        for (int i = 1; i < 21; i++) {
            System.out.println("O quadrado de " + i + " é " + (i * i));
        }
    }

    private static void impares() {
        for (int i = 1; i < 51; i++) {
            if (i % 2 != 0) {
                System.out.println("Ímpar =  " + i);
            }
        }
    }

    private static void somatoria() {
        int somatoria = 0;
        for (int i = 1; i < 51; i++) {
            somatoria = somatoria + i;
        }

        System.out.println("somatoria = " + somatoria);
    }

    private static void fatorial() {
        for (int i = 1; i < 11; i++) {
            System.out.println("O fatorial de " + i + " é " + fat(i));
        }
    }

    private static int fat(int numero) {
        return numero == 0 ? 1 : numero * fat(numero - 1);
    }

    private static void bhaskara(int a, int b, int c) {
        double delta = (b * b) - 4 * a * c;
        double raiz = Math.sqrt(delta);
        double fase1 = (b * -1);
        double divisao = 2 * a;

        double x1 = (fase1 - raiz) / divisao;
        double x2 = (fase1 + raiz) / divisao;

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }

}
