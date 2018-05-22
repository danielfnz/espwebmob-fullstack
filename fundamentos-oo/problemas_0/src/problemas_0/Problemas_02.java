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
public class Problemas_02 {

    public static void main(String[] args) {
        double gastoJaneiro = 15000;
        double gastoFevereiro = 23000;
        double gastoMarco = 17000;
        double gastosTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;

        System.out.println("Os gastos do trimestre são de :" + gastosTrimestre);
        System.out.println("A media de gastos do trimestre é de :" + gastosTrimestre / 3);
    }

}
