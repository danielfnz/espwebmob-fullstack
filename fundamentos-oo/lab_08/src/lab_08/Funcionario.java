/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author Alunoinf_2
 */
public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(double salario, String nome, Data nascimento) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double calculaImposto() {
        return getSalario() - (getSalario() * 0.03);
    }

    @Override
    public void imprimeDados() {
        System.out.println("-------------------------------------------------");
        System.out.println("Nome:" + getNome());
        System.out.println("Tipo de cadastro: Funcionario");
        System.out.println("Nascimento:" + getNascimento().getData());
        System.out.println("Salario:" + this.calculaImposto());
        System.out.println("-------------------------------------------------");
    }
}
