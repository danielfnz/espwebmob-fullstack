/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

/**
 *
 * @author Alunoinf_2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empresa softHouse = new Empresa();
        
        softHouse.addPessoa(new Horista(160, 23, "Daniel", "Leonardo", 0));
        softHouse.addPessoa(new Horista(160, 30, "Daniel", "Teixeira", 0));
        
        softHouse.addPessoa(new Adminstrador("Daniel", "Adminstrador", 1447));
        softHouse.addPessoa(new Adminstrador("Daniel", "Adminstrador 2", 3000));
        softHouse.addPessoa(new Adminstrador("Daniel", "Adminstrador 3", 500));
        softHouse.addPessoa(new Adminstrador("Daniel", "Adminstrador 4", 78000));
        
        softHouse.addPessoa(new Comissionado(500, 0.5, "Daniel", "Comissionado1", 4000));
        softHouse.addPessoa(new Comissionado(500, 0.5, "Daniel", "Comissionado2", 5000));
        softHouse.addPessoa(new Comissionado(500, 0.5, "Daniel", "Comissionado3", 6000));
        
        softHouse.addPessoa(new Gerente("Daniel", "Gerente", 50000));
        
        //Relatório contendo os nomes do funcionários com seus respectivos cargos e salários.  
        softHouse.mostraDados();
        
        //Relatório contendo a quantidade de horistas
        softHouse.calculaQntHoristas();
        
        //Relatório contendo a quantidade de comissionados
        softHouse.calculaQntComissionados();

    }

}
