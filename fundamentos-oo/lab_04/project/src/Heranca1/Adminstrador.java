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
public class Adminstrador extends Funcionario {
    

    public Adminstrador(String nome, String sobrenome, double salarioFixo) {
        super(nome, sobrenome, salarioFixo);
    }


    public double calculaRenda(){
        return getSalarioFixo();
    }

    @Override
    public void mostraDados() {
        System.out.println("-------------------------------------------------");
        System.out.println("Nome:" + getNome() + " "+ getSobrenome());
        System.out.println("Cargo:" + this.getClass().getSimpleName());
        System.out.println("Salário:" + getSalarioFixo());
        System.out.println("-------------------------------------------------");
    }
 
}
