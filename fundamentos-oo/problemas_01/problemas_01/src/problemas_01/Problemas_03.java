/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas_01;

/**
 *
 * @author Danie
 */
public class Problemas_03 {

    public static void main(String[] args) {
        quantidadeCaracteres("Daniel");
        arredonda(454541.22222);
        calculaMaiorMenor(8000, 45454554);
        geraAleatorio();
        calculaQuadradoeRaiz(8);
        operacoes(50, 10);
    }

    private static void quantidadeCaracteres(String nome) {
        System.out.println("-----------------------------");
        System.out.println("O nome " + nome.toUpperCase() + " tem tamanho de " + nome.length() + " caracteres");
    }

    private static void arredonda(double valor) {
        String floor = String.valueOf(Math.floor(valor));
        String ceil = String.valueOf(Math.ceil(valor));
        String round = String.valueOf(Math.round(valor));
        System.out.println("-----------------------------");
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
        System.out.println("Round: " + round);
    }

    private static void calculaMaiorMenor(int a, int b) {
        System.out.println("-----------------------------");
        System.out.println("Maior: " + String.valueOf(Math.max(a, b)));
        System.out.println("Menor: " + String.valueOf(Math.min(a, b)));
    }

    private static void geraAleatorio() {
        System.out.println("-----------------------------");
        System.out.println("Valor Gerado Aleatorio: " + Math.random() * 101);
    }

    private static void calculaQuadradoeRaiz(int numero) {
        String quadrado = String.valueOf(numero * 2);
        String raiz = String.valueOf(Math.sqrt(numero));

        System.out.println("-----------------------------");
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Raíz: " + raiz);
    }

    private static void operacoes(int a, int b) {
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println("-----------------------------");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("-----------------------------");
    }
}
