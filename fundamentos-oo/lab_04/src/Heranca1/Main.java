/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca1;

/**
 *
 * @author Alunoinf_2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Empresa softHouse = new Empresa();

        Funcionario h1 = new Horista(160, 23, "Daniel", "Leonardo", 0);
        Funcionario h2 = new Horista(160, 30, "Daniel", "Teixeira", 0);

        Funcionario adm1 = new Adminstrador("Daniel", "Adminstrador", 1447);
        Funcionario adm2 = new Adminstrador("Daniel", "Adminstrador 2", 3000);
        Funcionario adm3 = new Adminstrador("Daniel", "Adminstrador 3", 500);
        Funcionario adm4 = new Adminstrador("Daniel", "Adminstrador 4", 78000);

        Funcionario com1 = new Comissionado(500, 0.5, "Daniel", "Comissionado1", 4000);
        Funcionario com2 = new Comissionado(500, 0.5, "Daniel", "Comissionado2", 5000);
        Funcionario com3 = new Comissionado(500, 0.5, "Daniel", "Comissionado3", 6000);
        Funcionario gerente = new Gerente("Daniel", "Gerente", 50000);

        softHouse.addPessoa(h1);
        softHouse.addPessoa(h2);
        softHouse.addPessoa(adm1);
        softHouse.addPessoa(adm2);
        softHouse.addPessoa(adm3);
        softHouse.addPessoa(adm4);
        softHouse.addPessoa(com1);
        softHouse.addPessoa(com2);
        softHouse.addPessoa(com3);
        softHouse.addPessoa(gerente);
        
        softHouse.mostraDados();

    }

}
